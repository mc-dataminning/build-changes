import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erd implements eri {
   private static final Logger b = LogUtils.getLogger();
   private final dds c;
   private final int d;
   private final ArrayDeque<erd.c> e = new ArrayDeque<>();
   private final List<erd.c> f = new ArrayList<>();
   private int g = 0;

   public erd(dds $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jj $$0, dua $$1, je $$2, je $$3, int $$4, int $$5) {
      this.a($$2, new erd.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(je $$0, dgv $$1, @Nullable erj $$2) {
      this.a($$0, new erd.e($$0, $$1, $$2));
   }

   @Override
   public void a(dua $$0, je $$1, dgv $$2, @Nullable erj $$3, boolean $$4) {
      this.a($$1, new erd.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(je $$0, dgv $$1, @Nullable jj $$2, @Nullable erj $$3) {
      this.a($$0, new erd.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(je $$0, erd.c $$1) {
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
            erd.c $$1 = this.e.peek();

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

   static record a(dua a, je b, dgv c, @Nullable erj d, boolean e) implements erd.c {
      @Override
      public boolean a(dds $$0) {
         eri.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements erd.c {
      private final je a;
      private final dgv b;
      @Nullable
      private erj c;
      @Nullable
      private final jj d;
      private int e = 0;

      b(je $$0, dgv $$1, @Nullable erj $$2, @Nullable jj $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (eri.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dds $$0) {
         jj $$1 = eri.a[this.e++];
         je $$2 = this.a.a($$1);
         dua $$3 = $$0.a_($$2);
         erj $$4 = null;
         if ($$0.J().b(cqj.d)) {
            if (this.c == null) {
               this.c = erf.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         eri.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < eri.a.length && eri.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < eri.a.length;
      }
   }

   interface c {
      boolean a(dds var1);
   }

   static record d(jj a, dua b, je c, je d, int e, int f) implements erd.c {
      @Override
      public boolean a(dds $$0) {
         eri.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(je a, dgv b, @Nullable erj c) implements erd.c {
      @Override
      public boolean a(dds $$0) {
         dua $$1 = $$0.a_(this.a);
         eri.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
