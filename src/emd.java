import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emd implements emf {
   private static final Logger b = LogUtils.getLogger();
   private final czg c;
   private final int d;
   private final ArrayDeque<emd.c> e = new ArrayDeque<>();
   private final List<emd.c> f = new ArrayList<>();
   private int g = 0;

   public emd(czg $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ij $$0, dpi $$1, id $$2, id $$3, int $$4, int $$5) {
      this.a($$2, new emd.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(id $$0, dch $$1, id $$2) {
      this.a($$0, new emd.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dpi $$0, id $$1, dch $$2, id $$3, boolean $$4) {
      this.a($$1, new emd.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(id $$0, dch $$1, @Nullable ij $$2) {
      this.a($$0, new emd.b($$0.i(), $$1, $$2));
   }

   private void a(id $$0, emd.c $$1) {
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
            emd.c $$1 = this.e.peek();

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

   static record a(dpi a, id b, dch c, id d, boolean e) implements emd.c {
      @Override
      public boolean a(czg $$0) {
         emf.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements emd.c {
      private final id a;
      private final dch b;
      @Nullable
      private final ij c;
      private int d = 0;

      b(id $$0, dch $$1, @Nullable ij $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (emf.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(czg $$0) {
         id $$1 = this.a.a(emf.a[this.d++]);
         dpi $$2 = $$0.a_($$1);
         emf.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < emf.a.length && emf.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < emf.a.length;
      }
   }

   interface c {
      boolean a(czg var1);
   }

   static record d(ij a, dpi b, id c, id d, int e, int f) implements emd.c {
      @Override
      public boolean a(czg $$0) {
         emf.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(id a, dch b, id c) implements emd.c {
      @Override
      public boolean a(czg $$0) {
         dpi $$1 = $$0.a_(this.a);
         emf.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
