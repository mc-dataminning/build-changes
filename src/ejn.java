import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ejn implements ejp {
   private static final Logger b = LogUtils.getLogger();
   private final cwz c;
   private final int d;
   private final ArrayDeque<ejn.c> e = new ArrayDeque<>();
   private final List<ejn.c> f = new ArrayList<>();
   private int g = 0;

   public ejn(cwz $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ih $$0, dmz $$1, ib $$2, ib $$3, int $$4, int $$5) {
      this.a($$2, new ejn.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(ib $$0, daa $$1, ib $$2) {
      this.a($$0, new ejn.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dmz $$0, ib $$1, daa $$2, ib $$3, boolean $$4) {
      this.a($$1, new ejn.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(ib $$0, daa $$1, @Nullable ih $$2) {
      this.a($$0, new ejn.b($$0.i(), $$1, $$2));
   }

   private void a(ib $$0, ejn.c $$1) {
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
            ejn.c $$1 = this.e.peek();

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

   static record a(dmz a, ib b, daa c, ib d, boolean e) implements ejn.c {
      @Override
      public boolean a(cwz $$0) {
         ejp.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ejn.c {
      private final ib a;
      private final daa b;
      @Nullable
      private final ih c;
      private int d = 0;

      b(ib $$0, daa $$1, @Nullable ih $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ejp.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cwz $$0) {
         ib $$1 = this.a.a(ejp.a[this.d++]);
         dmz $$2 = $$0.a_($$1);
         ejp.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < ejp.a.length && ejp.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ejp.a.length;
      }
   }

   interface c {
      boolean a(cwz var1);
   }

   static record d(ih a, dmz b, ib c, ib d, int e, int f) implements ejn.c {
      @Override
      public boolean a(cwz $$0) {
         ejp.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(ib a, daa b, ib c) implements ejn.c {
      @Override
      public boolean a(cwz $$0) {
         dmz $$1 = $$0.a_(this.a);
         ejp.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
