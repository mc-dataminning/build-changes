import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epl implements epn {
   private static final Logger b = LogUtils.getLogger();
   private final dcg c;
   private final int d;
   private final ArrayDeque<epl.c> e = new ArrayDeque<>();
   private final List<epl.c> f = new ArrayList<>();
   private int g = 0;

   public epl(dcg $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jf $$0, dsl $$1, ja $$2, ja $$3, int $$4, int $$5) {
      this.a($$2, new epl.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(ja $$0, dfi $$1, ja $$2) {
      this.a($$0, new epl.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dsl $$0, ja $$1, dfi $$2, ja $$3, boolean $$4) {
      this.a($$1, new epl.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(ja $$0, dfi $$1, @Nullable jf $$2) {
      this.a($$0, new epl.b($$0.i(), $$1, $$2));
   }

   private void a(ja $$0, epl.c $$1) {
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
            epl.c $$1 = this.e.peek();

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

   static record a(dsl a, ja b, dfi c, ja d, boolean e) implements epl.c {
      @Override
      public boolean a(dcg $$0) {
         epn.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements epl.c {
      private final ja a;
      private final dfi b;
      @Nullable
      private final jf c;
      private int d = 0;

      b(ja $$0, dfi $$1, @Nullable jf $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (epn.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(dcg $$0) {
         ja $$1 = this.a.a(epn.a[this.d++]);
         dsl $$2 = $$0.a_($$1);
         epn.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < epn.a.length && epn.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < epn.a.length;
      }
   }

   interface c {
      boolean a(dcg var1);
   }

   static record d(jf a, dsl b, ja c, ja d, int e, int f) implements epl.c {
      @Override
      public boolean a(dcg $$0) {
         epn.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(ja a, dfi b, ja c) implements epl.c {
      @Override
      public boolean a(dcg $$0) {
         dsl $$1 = $$0.a_(this.a);
         epn.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
