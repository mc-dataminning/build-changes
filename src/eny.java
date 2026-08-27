import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eny implements eoa {
   private static final Logger b = LogUtils.getLogger();
   private final daz c;
   private final int d;
   private final ArrayDeque<eny.c> e = new ArrayDeque<>();
   private final List<eny.c> f = new ArrayList<>();
   private int g = 0;

   public eny(daz $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(it $$0, drd $$1, io $$2, io $$3, int $$4, int $$5) {
      this.a($$2, new eny.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(io $$0, dea $$1, io $$2) {
      this.a($$0, new eny.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(drd $$0, io $$1, dea $$2, io $$3, boolean $$4) {
      this.a($$1, new eny.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(io $$0, dea $$1, @Nullable it $$2) {
      this.a($$0, new eny.b($$0.i(), $$1, $$2));
   }

   private void a(io $$0, eny.c $$1) {
      boolean $$2 = this.g > 0;
      boolean $$3 = this.d >= 0 && this.g >= this.d;
      this.g++;
      if (!$$3) {
         if ($$2) {
            this.f.add($$1);
         } else {
            this.e.push($$1);
         }
      } else if (this.g - 1 == this.d) {
         b.error("Too many chained neighbor updates. Skipping the rest. First skipped position: " + $$0.x());
      }

      if (!$$2) {
         this.a();
      }
   }

   private void a() {
      try {
         while (!this.e.isEmpty() || !this.f.isEmpty()) {
            for (int $$0 = this.f.size() - 1; $$0 >= 0; $$0--) {
               this.e.push(this.f.get($$0));
            }

            this.f.clear();
            eny.c $$1 = this.e.peek();

            while (this.f.isEmpty()) {
               if (!$$1.a(this.c)) {
                  this.e.pop();
                  break;
               }
            }
         }
      } finally {
         this.e.clear();
         this.f.clear();
         this.g = 0;
      }
   }

   static record a(drd a, io b, dea c, io d, boolean e) implements eny.c {
      @Override
      public boolean a(daz $$0) {
         eoa.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements eny.c {
      private final io a;
      private final dea b;
      @Nullable
      private final it c;
      private int d = 0;

      b(io $$0, dea $$1, @Nullable it $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (eoa.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(daz $$0) {
         io $$1 = this.a.a(eoa.a[this.d++]);
         drd $$2 = $$0.a_($$1);
         eoa.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < eoa.a.length && eoa.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < eoa.a.length;
      }
   }

   interface c {
      boolean a(daz var1);
   }

   static record d(it a, drd b, io c, io d, int e, int f) implements eny.c {
      @Override
      public boolean a(daz $$0) {
         eoa.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(io a, dea b, io c) implements eny.c {
      @Override
      public boolean a(daz $$0) {
         drd $$1 = $$0.a_(this.a);
         eoa.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
