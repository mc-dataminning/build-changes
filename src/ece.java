import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ece implements ecg {
   private static final Logger b = LogUtils.getLogger();
   private final cqz c;
   private final int d;
   private final ArrayDeque<ece.c> e = new ArrayDeque<>();
   private final List<ece.c> f = new ArrayList<>();
   private int g = 0;

   public ece(cqz $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(hx $$0, dgb $$1, ht $$2, ht $$3, int $$4, int $$5) {
      this.a($$2, new ece.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(ht $$0, cua $$1, ht $$2) {
      this.a($$0, new ece.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dgb $$0, ht $$1, cua $$2, ht $$3, boolean $$4) {
      this.a($$1, new ece.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(ht $$0, cua $$1, @Nullable hx $$2) {
      this.a($$0, new ece.b($$0.i(), $$1, $$2));
   }

   private void a(ht $$0, ece.c $$1) {
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
            ece.c $$1 = this.e.peek();

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

   static record a(dgb a, ht b, cua c, ht d, boolean e) implements ece.c {
      @Override
      public boolean a(cqz $$0) {
         ecg.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ece.c {
      private final ht a;
      private final cua b;
      @Nullable
      private final hx c;
      private int d = 0;

      b(ht $$0, cua $$1, @Nullable hx $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ecg.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cqz $$0) {
         ht $$1 = this.a.a(ecg.a[this.d++]);
         dgb $$2 = $$0.a_($$1);
         ecg.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < ecg.a.length && ecg.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ecg.a.length;
      }
   }

   interface c {
      boolean a(cqz var1);
   }

   static record d(hx a, dgb b, ht c, ht d, int e, int f) implements ece.c {
      @Override
      public boolean a(cqz $$0) {
         ecg.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(ht a, cua b, ht c) implements ece.c {
      @Override
      public boolean a(cqz $$0) {
         dgb $$1 = $$0.a_(this.a);
         ecg.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
