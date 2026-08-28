import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewx implements exc {
   private static final Logger b = LogUtils.getLogger();
   private final dip c;
   private final int d;
   private final ArrayDeque<ewx.c> e = new ArrayDeque<>();
   private final List<ewx.c> f = new ArrayList<>();
   private int g = 0;

   public ewx(dip $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ja $$0, dzo $$1, iu $$2, iu $$3, int $$4, int $$5) {
      this.a($$2, new ewx.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(iu $$0, dlu $$1, @Nullable exd $$2) {
      this.a($$0, new ewx.e($$0, $$1, $$2));
   }

   @Override
   public void a(dzo $$0, iu $$1, dlu $$2, @Nullable exd $$3, boolean $$4) {
      this.a($$1, new ewx.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(iu $$0, dlu $$1, @Nullable ja $$2, @Nullable exd $$3) {
      this.a($$0, new ewx.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(iu $$0, ewx.c $$1) {
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
            ewx.c $$1 = this.e.peek();

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

   static record a(dzo a, iu b, dlu c, @Nullable exd d, boolean e) implements ewx.c {
      @Override
      public boolean a(dip $$0) {
         exc.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ewx.c {
      private final iu a;
      private final dlu b;
      @Nullable
      private exd c;
      @Nullable
      private final ja d;
      private int e = 0;

      b(iu $$0, dlu $$1, @Nullable exd $$2, @Nullable ja $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (exc.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dip $$0) {
         ja $$1 = exc.a[this.e++];
         iu $$2 = this.a.a($$1);
         dzo $$3 = $$0.a_($$2);
         exd $$4 = null;
         if ($$0.K().b(cud.c)) {
            if (this.c == null) {
               this.c = ewz.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         exc.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < exc.a.length && exc.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < exc.a.length;
      }
   }

   interface c {
      boolean a(dip var1);
   }

   static record d(ja a, dzo b, iu c, iu d, int e, int f) implements ewx.c {
      @Override
      public boolean a(dip $$0) {
         exc.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(iu a, dlu b, @Nullable exd c) implements ewx.c {
      @Override
      public boolean a(dip $$0) {
         dzo $$1 = $$0.a_(this.a);
         exc.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
