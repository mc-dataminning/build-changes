import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enc implements ene {
   private static final Logger b = LogUtils.getLogger();
   private final dad c;
   private final int d;
   private final ArrayDeque<enc.c> e = new ArrayDeque<>();
   private final List<enc.c> f = new ArrayList<>();
   private int g = 0;

   public enc(dad $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(is $$0, dqh $$1, in $$2, in $$3, int $$4, int $$5) {
      this.a($$2, new enc.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(in $$0, dde $$1, in $$2) {
      this.a($$0, new enc.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dqh $$0, in $$1, dde $$2, in $$3, boolean $$4) {
      this.a($$1, new enc.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(in $$0, dde $$1, @Nullable is $$2) {
      this.a($$0, new enc.b($$0.i(), $$1, $$2));
   }

   private void a(in $$0, enc.c $$1) {
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
            enc.c $$1 = this.e.peek();

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

   static record a(dqh a, in b, dde c, in d, boolean e) implements enc.c {
      @Override
      public boolean a(dad $$0) {
         ene.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements enc.c {
      private final in a;
      private final dde b;
      @Nullable
      private final is c;
      private int d = 0;

      b(in $$0, dde $$1, @Nullable is $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ene.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(dad $$0) {
         in $$1 = this.a.a(ene.a[this.d++]);
         dqh $$2 = $$0.a_($$1);
         ene.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < ene.a.length && ene.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ene.a.length;
      }
   }

   interface c {
      boolean a(dad var1);
   }

   static record d(is a, dqh b, in c, in d, int e, int f) implements enc.c {
      @Override
      public boolean a(dad $$0) {
         ene.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(in a, dde b, in c) implements enc.c {
      @Override
      public boolean a(dad $$0) {
         dqh $$1 = $$0.a_(this.a);
         ene.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
