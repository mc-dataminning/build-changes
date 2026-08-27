import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dye implements dyg {
   private static final Logger b = LogUtils.getLogger();
   private final cmm c;
   private final int d;
   private final ArrayDeque<dye.c> e = new ArrayDeque<>();
   private final List<dye.c> f = new ArrayList<>();
   private int g = 0;

   public dye(cmm $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ha $$0, dcb $$1, gu $$2, gu $$3, int $$4, int $$5) {
      this.a($$2, new dye.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(gu $$0, cpn $$1, gu $$2) {
      this.a($$0, new dye.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dcb $$0, gu $$1, cpn $$2, gu $$3, boolean $$4) {
      this.a($$1, new dye.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(gu $$0, cpn $$1, @Nullable ha $$2) {
      this.a($$0, new dye.b($$0.i(), $$1, $$2));
   }

   private void a(gu $$0, dye.c $$1) {
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
            dye.c $$1 = this.e.peek();

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

   static record a(dcb a, gu b, cpn c, gu d, boolean e) implements dye.c {
      @Override
      public boolean a(cmm $$0) {
         dyg.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements dye.c {
      private final gu a;
      private final cpn b;
      @Nullable
      private final ha c;
      private int d = 0;

      b(gu $$0, cpn $$1, @Nullable ha $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (dyg.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cmm $$0) {
         gu $$1 = this.a.a(dyg.a[this.d++]);
         dcb $$2 = $$0.a_($$1);
         $$2.a($$0, $$1, this.b, this.a, false);
         if (this.d < dyg.a.length && dyg.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < dyg.a.length;
      }
   }

   interface c {
      boolean a(cmm var1);
   }

   static record d(ha a, dcb b, gu c, gu d, int e, int f) implements dye.c {
      @Override
      public boolean a(cmm $$0) {
         dyg.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(gu a, cpn b, gu c) implements dye.c {
      @Override
      public boolean a(cmm $$0) {
         dcb $$1 = $$0.a_(this.a);
         dyg.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
