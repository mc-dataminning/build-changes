import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class err implements erw {
   private static final Logger b = LogUtils.getLogger();
   private final deg c;
   private final int d;
   private final ArrayDeque<err.c> e = new ArrayDeque<>();
   private final List<err.c> f = new ArrayList<>();
   private int g = 0;

   public err(deg $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jj $$0, duo $$1, je $$2, je $$3, int $$4, int $$5) {
      this.a($$2, new err.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(je $$0, dhj $$1, @Nullable erx $$2) {
      this.a($$0, new err.e($$0, $$1, $$2));
   }

   @Override
   public void a(duo $$0, je $$1, dhj $$2, @Nullable erx $$3, boolean $$4) {
      this.a($$1, new err.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(je $$0, dhj $$1, @Nullable jj $$2, @Nullable erx $$3) {
      this.a($$0, new err.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(je $$0, err.c $$1) {
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
            err.c $$1 = this.e.peek();

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

   static record a(duo a, je b, dhj c, @Nullable erx d, boolean e) implements err.c {
      @Override
      public boolean a(deg $$0) {
         erw.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements err.c {
      private final je a;
      private final dhj b;
      @Nullable
      private erx c;
      @Nullable
      private final jj d;
      private int e = 0;

      b(je $$0, dhj $$1, @Nullable erx $$2, @Nullable jj $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (erw.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(deg $$0) {
         jj $$1 = erw.a[this.e++];
         je $$2 = this.a.a($$1);
         duo $$3 = $$0.a_($$2);
         erx $$4 = null;
         if ($$0.J().b(cqp.d)) {
            if (this.c == null) {
               this.c = ert.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         erw.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < erw.a.length && erw.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < erw.a.length;
      }
   }

   interface c {
      boolean a(deg var1);
   }

   static record d(jj a, duo b, je c, je d, int e, int f) implements err.c {
      @Override
      public boolean a(deg $$0) {
         erw.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(je a, dhj b, @Nullable erx c) implements err.c {
      @Override
      public boolean a(deg $$0) {
         duo $$1 = $$0.a_(this.a);
         erw.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
