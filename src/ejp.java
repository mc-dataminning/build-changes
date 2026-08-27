import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ejp implements ejr {
   private static final Logger b = LogUtils.getLogger();
   private final cxb c;
   private final int d;
   private final ArrayDeque<ejp.c> e = new ArrayDeque<>();
   private final List<ejp.c> f = new ArrayList<>();
   private int g = 0;

   public ejp(cxb $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ih $$0, dnb $$1, ib $$2, ib $$3, int $$4, int $$5) {
      this.a($$2, new ejp.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(ib $$0, dac $$1, ib $$2) {
      this.a($$0, new ejp.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dnb $$0, ib $$1, dac $$2, ib $$3, boolean $$4) {
      this.a($$1, new ejp.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(ib $$0, dac $$1, @Nullable ih $$2) {
      this.a($$0, new ejp.b($$0.i(), $$1, $$2));
   }

   private void a(ib $$0, ejp.c $$1) {
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
            ejp.c $$1 = this.e.peek();

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

   static record a(dnb a, ib b, dac c, ib d, boolean e) implements ejp.c {
      @Override
      public boolean a(cxb $$0) {
         ejr.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ejp.c {
      private final ib a;
      private final dac b;
      @Nullable
      private final ih c;
      private int d = 0;

      b(ib $$0, dac $$1, @Nullable ih $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ejr.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cxb $$0) {
         ib $$1 = this.a.a(ejr.a[this.d++]);
         dnb $$2 = $$0.a_($$1);
         ejr.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < ejr.a.length && ejr.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ejr.a.length;
      }
   }

   interface c {
      boolean a(cxb var1);
   }

   static record d(ih a, dnb b, ib c, ib d, int e, int f) implements ejp.c {
      @Override
      public boolean a(cxb $$0) {
         ejr.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(ib a, dac b, ib c) implements ejp.c {
      @Override
      public boolean a(cxb $$0) {
         dnb $$1 = $$0.a_(this.a);
         ejr.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
