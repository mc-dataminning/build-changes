import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class edx implements edz {
   private static final Logger b = LogUtils.getLogger();
   private final csf c;
   private final int d;
   private final ArrayDeque<edx.c> e = new ArrayDeque<>();
   private final List<edx.c> f = new ArrayList<>();
   private int g = 0;

   public edx(csf $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ib $$0, dhn $$1, hx $$2, hx $$3, int $$4, int $$5) {
      this.a($$2, new edx.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(hx $$0, cvf $$1, hx $$2) {
      this.a($$0, new edx.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dhn $$0, hx $$1, cvf $$2, hx $$3, boolean $$4) {
      this.a($$1, new edx.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(hx $$0, cvf $$1, @Nullable ib $$2) {
      this.a($$0, new edx.b($$0.i(), $$1, $$2));
   }

   private void a(hx $$0, edx.c $$1) {
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
            edx.c $$1 = this.e.peek();

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

   static record a(dhn a, hx b, cvf c, hx d, boolean e) implements edx.c {
      @Override
      public boolean a(csf $$0) {
         edz.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements edx.c {
      private final hx a;
      private final cvf b;
      @Nullable
      private final ib c;
      private int d = 0;

      b(hx $$0, cvf $$1, @Nullable ib $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (edz.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(csf $$0) {
         hx $$1 = this.a.a(edz.a[this.d++]);
         dhn $$2 = $$0.a_($$1);
         edz.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < edz.a.length && edz.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < edz.a.length;
      }
   }

   interface c {
      boolean a(csf var1);
   }

   static record d(ib a, dhn b, hx c, hx d, int e, int f) implements edx.c {
      @Override
      public boolean a(csf $$0) {
         edz.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(hx a, cvf b, hx c) implements edx.c {
      @Override
      public boolean a(csf $$0) {
         dhn $$1 = $$0.a_(this.a);
         edz.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
