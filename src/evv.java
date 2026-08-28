import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evv implements ewa {
   private static final Logger b = LogUtils.getLogger();
   private final dhp c;
   private final int d;
   private final ArrayDeque<evv.c> e = new ArrayDeque<>();
   private final List<evv.c> f = new ArrayList<>();
   private int g = 0;

   public evv(dhp $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jo $$0, dym $$1, jj $$2, jj $$3, int $$4, int $$5) {
      this.a($$2, new evv.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(jj $$0, dku $$1, @Nullable ewb $$2) {
      this.a($$0, new evv.e($$0, $$1, $$2));
   }

   @Override
   public void a(dym $$0, jj $$1, dku $$2, @Nullable ewb $$3, boolean $$4) {
      this.a($$1, new evv.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(jj $$0, dku $$1, @Nullable jo $$2, @Nullable ewb $$3) {
      this.a($$0, new evv.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(jj $$0, evv.c $$1) {
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
            evv.c $$1 = this.e.peek();

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

   static record a(dym a, jj b, dku c, @Nullable ewb d, boolean e) implements evv.c {
      @Override
      public boolean a(dhp $$0) {
         ewa.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements evv.c {
      private final jj a;
      private final dku b;
      @Nullable
      private ewb c;
      @Nullable
      private final jo d;
      private int e = 0;

      b(jj $$0, dku $$1, @Nullable ewb $$2, @Nullable jo $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (ewa.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dhp $$0) {
         jo $$1 = ewa.a[this.e++];
         jj $$2 = this.a.a($$1);
         dym $$3 = $$0.a_($$2);
         ewb $$4 = null;
         if ($$0.K().b(ctg.c)) {
            if (this.c == null) {
               this.c = evx.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         ewa.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < ewa.a.length && ewa.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < ewa.a.length;
      }
   }

   interface c {
      boolean a(dhp var1);
   }

   static record d(jo a, dym b, jj c, jj d, int e, int f) implements evv.c {
      @Override
      public boolean a(dhp $$0) {
         ewa.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(jj a, dku b, @Nullable ewb c) implements evv.c {
      @Override
      public boolean a(dhp $$0) {
         dym $$1 = $$0.a_(this.a);
         ewa.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
