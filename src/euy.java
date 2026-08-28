import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euy implements evd {
   private static final Logger b = LogUtils.getLogger();
   private final dhh c;
   private final int d;
   private final ArrayDeque<euy.c> e = new ArrayDeque<>();
   private final List<euy.c> f = new ArrayList<>();
   private int g = 0;

   public euy(dhh $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jm $$0, dxu $$1, jh $$2, jh $$3, int $$4, int $$5) {
      this.a($$2, new euy.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(jh $$0, dkl $$1, @Nullable eve $$2) {
      this.a($$0, new euy.e($$0, $$1, $$2));
   }

   @Override
   public void a(dxu $$0, jh $$1, dkl $$2, @Nullable eve $$3, boolean $$4) {
      this.a($$1, new euy.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(jh $$0, dkl $$1, @Nullable jm $$2, @Nullable eve $$3) {
      this.a($$0, new euy.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(jh $$0, euy.c $$1) {
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
            euy.c $$1 = this.e.peek();

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

   static record a(dxu a, jh b, dkl c, @Nullable eve d, boolean e) implements euy.c {
      @Override
      public boolean a(dhh $$0) {
         evd.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements euy.c {
      private final jh a;
      private final dkl b;
      @Nullable
      private eve c;
      @Nullable
      private final jm d;
      private int e = 0;

      b(jh $$0, dkl $$1, @Nullable eve $$2, @Nullable jm $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (evd.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dhh $$0) {
         jm $$1 = evd.a[this.e++];
         jh $$2 = this.a.a($$1);
         dxu $$3 = $$0.a_($$2);
         eve $$4 = null;
         if ($$0.J().b(csu.d)) {
            if (this.c == null) {
               this.c = eva.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         evd.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < evd.a.length && evd.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < evd.a.length;
      }
   }

   interface c {
      boolean a(dhh var1);
   }

   static record d(jm a, dxu b, jh c, jh d, int e, int f) implements euy.c {
      @Override
      public boolean a(dhh $$0) {
         evd.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(jh a, dkl b, @Nullable eve c) implements euy.c {
      @Override
      public boolean a(dhh $$0) {
         dxu $$1 = $$0.a_(this.a);
         evd.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
