import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class efr implements eft {
   private static final Logger b = LogUtils.getLogger();
   private final ctp c;
   private final int d;
   private final ArrayDeque<efr.c> e = new ArrayDeque<>();
   private final List<efr.c> f = new ArrayList<>();
   private int g = 0;

   public efr(ctp $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ic $$0, djh $$1, hx $$2, hx $$3, int $$4, int $$5) {
      this.a($$2, new efr.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(hx $$0, cwq $$1, hx $$2) {
      this.a($$0, new efr.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(djh $$0, hx $$1, cwq $$2, hx $$3, boolean $$4) {
      this.a($$1, new efr.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(hx $$0, cwq $$1, @Nullable ic $$2) {
      this.a($$0, new efr.b($$0.i(), $$1, $$2));
   }

   private void a(hx $$0, efr.c $$1) {
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
            efr.c $$1 = this.e.peek();

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

   static record a(djh a, hx b, cwq c, hx d, boolean e) implements efr.c {
      @Override
      public boolean a(ctp $$0) {
         eft.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements efr.c {
      private final hx a;
      private final cwq b;
      @Nullable
      private final ic c;
      private int d = 0;

      b(hx $$0, cwq $$1, @Nullable ic $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (eft.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(ctp $$0) {
         hx $$1 = this.a.a(eft.a[this.d++]);
         djh $$2 = $$0.a_($$1);
         eft.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < eft.a.length && eft.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < eft.a.length;
      }
   }

   interface c {
      boolean a(ctp var1);
   }

   static record d(ic a, djh b, hx c, hx d, int e, int f) implements efr.c {
      @Override
      public boolean a(ctp $$0) {
         eft.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(hx a, cwq b, hx c) implements efr.c {
      @Override
      public boolean a(ctp $$0) {
         djh $$1 = $$0.a_(this.a);
         eft.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
