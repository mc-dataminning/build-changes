import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class edg implements edi {
   private static final Logger b = LogUtils.getLogger();
   private final crs c;
   private final int d;
   private final ArrayDeque<edg.c> e = new ArrayDeque<>();
   private final List<edg.c> f = new ArrayList<>();
   private int g = 0;

   public edg(crs $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(hx $$0, dgw $$1, ht $$2, ht $$3, int $$4, int $$5) {
      this.a($$2, new edg.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(ht $$0, cut $$1, ht $$2) {
      this.a($$0, new edg.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dgw $$0, ht $$1, cut $$2, ht $$3, boolean $$4) {
      this.a($$1, new edg.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(ht $$0, cut $$1, @Nullable hx $$2) {
      this.a($$0, new edg.b($$0.i(), $$1, $$2));
   }

   private void a(ht $$0, edg.c $$1) {
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
            edg.c $$1 = this.e.peek();

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

   static record a(dgw a, ht b, cut c, ht d, boolean e) implements edg.c {
      @Override
      public boolean a(crs $$0) {
         edi.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements edg.c {
      private final ht a;
      private final cut b;
      @Nullable
      private final hx c;
      private int d = 0;

      b(ht $$0, cut $$1, @Nullable hx $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (edi.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(crs $$0) {
         ht $$1 = this.a.a(edi.a[this.d++]);
         dgw $$2 = $$0.a_($$1);
         edi.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < edi.a.length && edi.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < edi.a.length;
      }
   }

   interface c {
      boolean a(crs var1);
   }

   static record d(hx a, dgw b, ht c, ht d, int e, int f) implements edg.c {
      @Override
      public boolean a(crs $$0) {
         edi.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(ht a, cut b, ht c) implements edg.c {
      @Override
      public boolean a(crs $$0) {
         dgw $$1 = $$0.a_(this.a);
         edi.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
