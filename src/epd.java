import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epd implements epf {
   private static final Logger b = LogUtils.getLogger();
   private final dcd c;
   private final int d;
   private final ArrayDeque<epd.c> e = new ArrayDeque<>();
   private final List<epd.c> f = new ArrayList<>();
   private int g = 0;

   public epd(dcd $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jf $$0, dsh $$1, ja $$2, ja $$3, int $$4, int $$5) {
      this.a($$2, new epd.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(ja $$0, dff $$1, ja $$2) {
      this.a($$0, new epd.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dsh $$0, ja $$1, dff $$2, ja $$3, boolean $$4) {
      this.a($$1, new epd.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(ja $$0, dff $$1, @Nullable jf $$2) {
      this.a($$0, new epd.b($$0.i(), $$1, $$2));
   }

   private void a(ja $$0, epd.c $$1) {
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
            epd.c $$1 = this.e.peek();

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

   static record a(dsh a, ja b, dff c, ja d, boolean e) implements epd.c {
      @Override
      public boolean a(dcd $$0) {
         epf.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements epd.c {
      private final ja a;
      private final dff b;
      @Nullable
      private final jf c;
      private int d = 0;

      b(ja $$0, dff $$1, @Nullable jf $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (epf.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(dcd $$0) {
         ja $$1 = this.a.a(epf.a[this.d++]);
         dsh $$2 = $$0.a_($$1);
         epf.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < epf.a.length && epf.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < epf.a.length;
      }
   }

   interface c {
      boolean a(dcd var1);
   }

   static record d(jf a, dsh b, ja c, ja d, int e, int f) implements epd.c {
      @Override
      public boolean a(dcd $$0) {
         epf.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(ja a, dff b, ja c) implements epd.c {
      @Override
      public boolean a(dcd $$0) {
         dsh $$1 = $$0.a_(this.a);
         epf.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
