import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebb implements ebd {
   private static final Logger b = LogUtils.getLogger();
   private final cpk c;
   private final int d;
   private final ArrayDeque<ebb.c> e = new ArrayDeque<>();
   private final List<ebb.c> f = new ArrayList<>();
   private int g = 0;

   public ebb(cpk $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(hb $$0, dey $$1, gv $$2, gv $$3, int $$4, int $$5) {
      this.a($$2, new ebb.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(gv $$0, csk $$1, gv $$2) {
      this.a($$0, new ebb.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dey $$0, gv $$1, csk $$2, gv $$3, boolean $$4) {
      this.a($$1, new ebb.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(gv $$0, csk $$1, @Nullable hb $$2) {
      this.a($$0, new ebb.b($$0.i(), $$1, $$2));
   }

   private void a(gv $$0, ebb.c $$1) {
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
            ebb.c $$1 = this.e.peek();

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

   static record a(dey a, gv b, csk c, gv d, boolean e) implements ebb.c {
      @Override
      public boolean a(cpk $$0) {
         ebd.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ebb.c {
      private final gv a;
      private final csk b;
      @Nullable
      private final hb c;
      private int d = 0;

      b(gv $$0, csk $$1, @Nullable hb $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ebd.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cpk $$0) {
         gv $$1 = this.a.a(ebd.a[this.d++]);
         dey $$2 = $$0.a_($$1);
         $$2.a($$0, $$1, this.b, this.a, false);
         if (this.d < ebd.a.length && ebd.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ebd.a.length;
      }
   }

   interface c {
      boolean a(cpk var1);
   }

   static record d(hb a, dey b, gv c, gv d, int e, int f) implements ebb.c {
      @Override
      public boolean a(cpk $$0) {
         ebd.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(gv a, csk b, gv c) implements ebb.c {
      @Override
      public boolean a(cpk $$0) {
         dey $$1 = $$0.a_(this.a);
         ebd.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
