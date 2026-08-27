import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ehw implements ehy {
   private static final Logger b = LogUtils.getLogger();
   private final cvr c;
   private final int d;
   private final ArrayDeque<ehw.c> e = new ArrayDeque<>();
   private final List<ehw.c> f = new ArrayList<>();
   private int g = 0;

   public ehw(cvr $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ie $$0, dlj $$1, hz $$2, hz $$3, int $$4, int $$5) {
      this.a($$2, new ehw.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(hz $$0, cys $$1, hz $$2) {
      this.a($$0, new ehw.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dlj $$0, hz $$1, cys $$2, hz $$3, boolean $$4) {
      this.a($$1, new ehw.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(hz $$0, cys $$1, @Nullable ie $$2) {
      this.a($$0, new ehw.b($$0.i(), $$1, $$2));
   }

   private void a(hz $$0, ehw.c $$1) {
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
            ehw.c $$1 = this.e.peek();

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

   static record a(dlj a, hz b, cys c, hz d, boolean e) implements ehw.c {
      @Override
      public boolean a(cvr $$0) {
         ehy.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ehw.c {
      private final hz a;
      private final cys b;
      @Nullable
      private final ie c;
      private int d = 0;

      b(hz $$0, cys $$1, @Nullable ie $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ehy.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cvr $$0) {
         hz $$1 = this.a.a(ehy.a[this.d++]);
         dlj $$2 = $$0.a_($$1);
         ehy.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < ehy.a.length && ehy.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ehy.a.length;
      }
   }

   interface c {
      boolean a(cvr var1);
   }

   static record d(ie a, dlj b, hz c, hz d, int e, int f) implements ehw.c {
      @Override
      public boolean a(cvr $$0) {
         ehy.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(hz a, cys b, hz c) implements ehw.c {
      @Override
      public boolean a(cvr $$0) {
         dlj $$1 = $$0.a_(this.a);
         ehy.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
