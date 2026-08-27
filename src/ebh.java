import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebh implements ebj {
   private static final Logger b = LogUtils.getLogger();
   private final cpq c;
   private final int d;
   private final ArrayDeque<ebh.c> e = new ArrayDeque<>();
   private final List<ebh.c> f = new ArrayList<>();
   private int g = 0;

   public ebh(cpq $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(hc $$0, dfe $$1, gw $$2, gw $$3, int $$4, int $$5) {
      this.a($$2, new ebh.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(gw $$0, csq $$1, gw $$2) {
      this.a($$0, new ebh.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dfe $$0, gw $$1, csq $$2, gw $$3, boolean $$4) {
      this.a($$1, new ebh.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(gw $$0, csq $$1, @Nullable hc $$2) {
      this.a($$0, new ebh.b($$0.i(), $$1, $$2));
   }

   private void a(gw $$0, ebh.c $$1) {
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
            ebh.c $$1 = this.e.peek();

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

   static record a(dfe a, gw b, csq c, gw d, boolean e) implements ebh.c {
      @Override
      public boolean a(cpq $$0) {
         ebj.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ebh.c {
      private final gw a;
      private final csq b;
      @Nullable
      private final hc c;
      private int d = 0;

      b(gw $$0, csq $$1, @Nullable hc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ebj.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cpq $$0) {
         gw $$1 = this.a.a(ebj.a[this.d++]);
         dfe $$2 = $$0.a_($$1);
         ebj.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < ebj.a.length && ebj.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ebj.a.length;
      }
   }

   interface c {
      boolean a(cpq var1);
   }

   static record d(hc a, dfe b, gw c, gw d, int e, int f) implements ebh.c {
      @Override
      public boolean a(cpq $$0) {
         ebj.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(gw a, csq b, gw c) implements ebh.c {
      @Override
      public boolean a(cpq $$0) {
         dfe $$1 = $$0.a_(this.a);
         ebj.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
