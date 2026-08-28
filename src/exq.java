import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exq implements exv {
   private static final Logger b = LogUtils.getLogger();
   private final dja c;
   private final int d;
   private final ArrayDeque<exq.c> e = new ArrayDeque<>();
   private final List<exq.c> f = new ArrayList<>();
   private int g = 0;

   public exq(dja $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ja $$0, eah $$1, iu $$2, iu $$3, int $$4, int $$5) {
      this.a($$2, new exq.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(iu $$0, dmf $$1, @Nullable exw $$2) {
      this.a($$0, new exq.e($$0, $$1, $$2));
   }

   @Override
   public void a(eah $$0, iu $$1, dmf $$2, @Nullable exw $$3, boolean $$4) {
      this.a($$1, new exq.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(iu $$0, dmf $$1, @Nullable ja $$2, @Nullable exw $$3) {
      this.a($$0, new exq.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(iu $$0, exq.c $$1) {
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
            exq.c $$1 = this.e.peek();

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

   static record a(eah a, iu b, dmf c, @Nullable exw d, boolean e) implements exq.c {
      @Override
      public boolean a(dja $$0) {
         exv.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements exq.c {
      private final iu a;
      private final dmf b;
      @Nullable
      private exw c;
      @Nullable
      private final ja d;
      private int e = 0;

      b(iu $$0, dmf $$1, @Nullable exw $$2, @Nullable ja $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (exv.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dja $$0) {
         ja $$1 = exv.a[this.e++];
         iu $$2 = this.a.a($$1);
         eah $$3 = $$0.a_($$2);
         exw $$4 = null;
         if ($$0.K().b(cuo.c)) {
            if (this.c == null) {
               this.c = exs.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         exv.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < exv.a.length && exv.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < exv.a.length;
      }
   }

   interface c {
      boolean a(dja var1);
   }

   static record d(ja a, eah b, iu c, iu d, int e, int f) implements exq.c {
      @Override
      public boolean a(dja $$0) {
         exv.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(iu a, dmf b, @Nullable exw c) implements exq.c {
      @Override
      public boolean a(dja $$0) {
         eah $$1 = $$0.a_(this.a);
         exv.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
