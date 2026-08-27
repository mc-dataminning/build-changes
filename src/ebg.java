import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebg implements ebi {
   private static final Logger b = LogUtils.getLogger();
   private final cqb c;
   private final int d;
   private final ArrayDeque<ebg.c> e = new ArrayDeque<>();
   private final List<ebg.c> f = new ArrayList<>();
   private int g = 0;

   public ebg(cqb $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ha $$0, dfd $$1, gw $$2, gw $$3, int $$4, int $$5) {
      this.a($$2, new ebg.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(gw $$0, ctc $$1, gw $$2) {
      this.a($$0, new ebg.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dfd $$0, gw $$1, ctc $$2, gw $$3, boolean $$4) {
      this.a($$1, new ebg.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(gw $$0, ctc $$1, @Nullable ha $$2) {
      this.a($$0, new ebg.b($$0.i(), $$1, $$2));
   }

   private void a(gw $$0, ebg.c $$1) {
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
            ebg.c $$1 = this.e.peek();

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

   static record a(dfd a, gw b, ctc c, gw d, boolean e) implements ebg.c {
      @Override
      public boolean a(cqb $$0) {
         ebi.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ebg.c {
      private final gw a;
      private final ctc b;
      @Nullable
      private final ha c;
      private int d = 0;

      b(gw $$0, ctc $$1, @Nullable ha $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ebi.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cqb $$0) {
         gw $$1 = this.a.a(ebi.a[this.d++]);
         dfd $$2 = $$0.a_($$1);
         ebi.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < ebi.a.length && ebi.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ebi.a.length;
      }
   }

   interface c {
      boolean a(cqb var1);
   }

   static record d(ha a, dfd b, gw c, gw d, int e, int f) implements ebg.c {
      @Override
      public boolean a(cqb $$0) {
         ebi.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(gw a, ctc b, gw c) implements ebg.c {
      @Override
      public boolean a(cqb $$0) {
         dfd $$1 = $$0.a_(this.a);
         ebi.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
