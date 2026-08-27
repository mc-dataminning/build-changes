import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emt implements emv {
   private static final Logger b = LogUtils.getLogger();
   private final czu c;
   private final int d;
   private final ArrayDeque<emt.c> e = new ArrayDeque<>();
   private final List<emt.c> f = new ArrayList<>();
   private int g = 0;

   public emt(czu $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ir $$0, dpy $$1, im $$2, im $$3, int $$4, int $$5) {
      this.a($$2, new emt.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(im $$0, dcv $$1, im $$2) {
      this.a($$0, new emt.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dpy $$0, im $$1, dcv $$2, im $$3, boolean $$4) {
      this.a($$1, new emt.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(im $$0, dcv $$1, @Nullable ir $$2) {
      this.a($$0, new emt.b($$0.i(), $$1, $$2));
   }

   private void a(im $$0, emt.c $$1) {
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
            emt.c $$1 = this.e.peek();

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

   static record a(dpy a, im b, dcv c, im d, boolean e) implements emt.c {
      @Override
      public boolean a(czu $$0) {
         emv.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements emt.c {
      private final im a;
      private final dcv b;
      @Nullable
      private final ir c;
      private int d = 0;

      b(im $$0, dcv $$1, @Nullable ir $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (emv.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(czu $$0) {
         im $$1 = this.a.a(emv.a[this.d++]);
         dpy $$2 = $$0.a_($$1);
         emv.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < emv.a.length && emv.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < emv.a.length;
      }
   }

   interface c {
      boolean a(czu var1);
   }

   static record d(ir a, dpy b, im c, im d, int e, int f) implements emt.c {
      @Override
      public boolean a(czu $$0) {
         emv.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(im a, dcv b, im c) implements emt.c {
      @Override
      public boolean a(czu $$0) {
         dpy $$1 = $$0.a_(this.a);
         emv.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
