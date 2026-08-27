import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class efz implements egb {
   private static final Logger b = LogUtils.getLogger();
   private final ctx c;
   private final int d;
   private final ArrayDeque<efz.c> e = new ArrayDeque<>();
   private final List<efz.c> f = new ArrayList<>();
   private int g = 0;

   public efz(ctx $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ic $$0, djp $$1, hx $$2, hx $$3, int $$4, int $$5) {
      this.a($$2, new efz.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(hx $$0, cwy $$1, hx $$2) {
      this.a($$0, new efz.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(djp $$0, hx $$1, cwy $$2, hx $$3, boolean $$4) {
      this.a($$1, new efz.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(hx $$0, cwy $$1, @Nullable ic $$2) {
      this.a($$0, new efz.b($$0.i(), $$1, $$2));
   }

   private void a(hx $$0, efz.c $$1) {
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
            efz.c $$1 = this.e.peek();

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

   static record a(djp a, hx b, cwy c, hx d, boolean e) implements efz.c {
      @Override
      public boolean a(ctx $$0) {
         egb.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements efz.c {
      private final hx a;
      private final cwy b;
      @Nullable
      private final ic c;
      private int d = 0;

      b(hx $$0, cwy $$1, @Nullable ic $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (egb.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(ctx $$0) {
         hx $$1 = this.a.a(egb.a[this.d++]);
         djp $$2 = $$0.a_($$1);
         egb.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < egb.a.length && egb.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < egb.a.length;
      }
   }

   interface c {
      boolean a(ctx var1);
   }

   static record d(ic a, djp b, hx c, hx d, int e, int f) implements efz.c {
      @Override
      public boolean a(ctx $$0) {
         egb.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(hx a, cwy b, hx c) implements efz.c {
      @Override
      public boolean a(ctx $$0) {
         djp $$1 = $$0.a_(this.a);
         egb.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
