import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bpu extends bnm<cee> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cmh e;
   private final List<cmh> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bpu(int $$0, int $$1) {
      super(ImmutableMap.of(bux.q, buy.a), $$0, $$1);
   }

   public boolean a(amp $$0, cee $$1) {
      bmv<?> $$2 = $$1.dO();
      if ($$2.c(bux.q).isEmpty()) {
         return false;
      } else {
         blv $$3 = $$2.c(bux.q).get();
         return $$3.ai() == blj.bv && $$1.bx() && $$3.bx() && !$$1.o_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(amp $$0, cee $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dO().c(bux.q).isPresent();
   }

   public void b(amp $$0, cee $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(amp $$0, cee $$1, long $$2) {
      blv $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(amp $$0, cee $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dO().b(bux.q);
      c($$1);
      this.e = null;
   }

   private void a(blv $$0, cee $$1) {
      boolean $$2 = false;
      cmh $$3 = $$0.eT();
      if (this.e == null || !cmh.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.b()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cee $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cee $$0) {
      for (crw $$1 : $$0.gg()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(crw $$0) {
      return cmh.b(this.e, $$0.b()) || cmh.b(this.e, $$0.c());
   }

   private static void c(cee $$0) {
      $$0.a(blk.a, cmh.f);
      $$0.a(blk.a, 0.085F);
   }

   private static void a(cee $$0, cmh $$1) {
      $$0.a(blk.a, $$1);
      $$0.a(blk.a, 0.0F);
   }

   private blv d(cee $$0) {
      bmv<?> $$1 = $$0.dO();
      blv $$2 = $$1.c(bux.q).get();
      $$1.a(bux.n, new bnx($$2, true));
      return $$2;
   }

   private void e(cee $$0) {
      if (this.f.size() >= 2 && ++this.g >= 40) {
         this.h++;
         this.g = 0;
         if (this.h > this.f.size() - 1) {
            this.h = 0;
         }

         a($$0, this.f.get(this.h));
      }
   }
}
