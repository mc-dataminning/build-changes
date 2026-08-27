import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bqk extends boc<cev> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cmy e;
   private final List<cmy> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bqk(int $$0, int $$1) {
      super(ImmutableMap.of(bvn.q, bvo.a), $$0, $$1);
   }

   public boolean a(and $$0, cev $$1) {
      bnl<?> $$2 = $$1.dO();
      if ($$2.c(bvn.q).isEmpty()) {
         return false;
      } else {
         bml $$3 = $$2.c(bvn.q).get();
         return $$3.ai() == blz.bv && $$1.bx() && $$3.bx() && !$$1.o_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(and $$0, cev $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dO().c(bvn.q).isPresent();
   }

   public void b(and $$0, cev $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(and $$0, cev $$1, long $$2) {
      bml $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(and $$0, cev $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dO().b(bvn.q);
      c($$1);
      this.e = null;
   }

   private void a(bml $$0, cev $$1) {
      boolean $$2 = false;
      cmy $$3 = $$0.eT();
      if (this.e == null || !cmy.b(this.e, $$3)) {
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

   private void a(cev $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cev $$0) {
      for (csn $$1 : $$0.gg()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(csn $$0) {
      return cmy.b(this.e, $$0.b()) || cmy.b(this.e, $$0.c());
   }

   private static void c(cev $$0) {
      $$0.a(bma.a, cmy.f);
      $$0.a(bma.a, 0.085F);
   }

   private static void a(cev $$0, cmy $$1) {
      $$0.a(bma.a, $$1);
      $$0.a(bma.a, 0.0F);
   }

   private bml d(cev $$0) {
      bnl<?> $$1 = $$0.dO();
      bml $$2 = $$1.c(bvn.q).get();
      $$1.a(bvn.n, new bon($$2, true));
      return $$2;
   }

   private void e(cev $$0) {
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
