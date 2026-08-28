import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eur implements euw {
   private static final Logger b = LogUtils.getLogger();
   private final dha c;
   private final int d;
   private final ArrayDeque<eur.c> e = new ArrayDeque<>();
   private final List<eur.c> f = new ArrayList<>();
   private int g = 0;

   public eur(dha $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jm $$0, dxn $$1, jh $$2, jh $$3, int $$4, int $$5) {
      this.a($$2, new eur.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(jh $$0, dke $$1, @Nullable eux $$2) {
      this.a($$0, new eur.e($$0, $$1, $$2));
   }

   @Override
   public void a(dxn $$0, jh $$1, dke $$2, @Nullable eux $$3, boolean $$4) {
      this.a($$1, new eur.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(jh $$0, dke $$1, @Nullable jm $$2, @Nullable eux $$3) {
      this.a($$0, new eur.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(jh $$0, eur.c $$1) {
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
            eur.c $$1 = this.e.peek();

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

   static record a(dxn a, jh b, dke c, @Nullable eux d, boolean e) implements eur.c {
      @Override
      public boolean a(dha $$0) {
         euw.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements eur.c {
      private final jh a;
      private final dke b;
      @Nullable
      private eux c;
      @Nullable
      private final jm d;
      private int e = 0;

      b(jh $$0, dke $$1, @Nullable eux $$2, @Nullable jm $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (euw.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dha $$0) {
         jm $$1 = euw.a[this.e++];
         jh $$2 = this.a.a($$1);
         dxn $$3 = $$0.a_($$2);
         eux $$4 = null;
         if ($$0.J().b(csq.d)) {
            if (this.c == null) {
               this.c = eut.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         euw.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < euw.a.length && euw.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < euw.a.length;
      }
   }

   interface c {
      boolean a(dha var1);
   }

   static record d(jm a, dxn b, jh c, jh d, int e, int f) implements eur.c {
      @Override
      public boolean a(dha $$0) {
         euw.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(jh a, dke b, @Nullable eux c) implements eur.c {
      @Override
      public boolean a(dha $$0) {
         dxn $$1 = $$0.a_(this.a);
         euw.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
