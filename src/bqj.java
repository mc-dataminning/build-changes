import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bqj extends bob<ceu> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cmx e;
   private final List<cmx> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bqj(int $$0, int $$1) {
      super(ImmutableMap.of(bvm.q, bvn.a), $$0, $$1);
   }

   public boolean a(and $$0, ceu $$1) {
      bnk<?> $$2 = $$1.dO();
      if ($$2.c(bvm.q).isEmpty()) {
         return false;
      } else {
         bmk $$3 = $$2.c(bvm.q).get();
         return $$3.ai() == bly.bv && $$1.bx() && $$3.bx() && !$$1.o_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(and $$0, ceu $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dO().c(bvm.q).isPresent();
   }

   public void b(and $$0, ceu $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(and $$0, ceu $$1, long $$2) {
      bmk $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(and $$0, ceu $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dO().b(bvm.q);
      c($$1);
      this.e = null;
   }

   private void a(bmk $$0, ceu $$1) {
      boolean $$2 = false;
      cmx $$3 = $$0.eT();
      if (this.e == null || !cmx.b(this.e, $$3)) {
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

   private void a(ceu $$0) {
      a($$0, this.f.get(0));
   }

   private void b(ceu $$0) {
      for (csm $$1 : $$0.gg()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(csm $$0) {
      return cmx.b(this.e, $$0.b()) || cmx.b(this.e, $$0.c());
   }

   private static void c(ceu $$0) {
      $$0.a(blz.a, cmx.f);
      $$0.a(blz.a, 0.085F);
   }

   private static void a(ceu $$0, cmx $$1) {
      $$0.a(blz.a, $$1);
      $$0.a(blz.a, 0.0F);
   }

   private bmk d(ceu $$0) {
      bnk<?> $$1 = $$0.dO();
      bmk $$2 = $$1.c(bvm.q).get();
      $$1.a(bvm.n, new bom($$2, true));
      return $$2;
   }

   private void e(ceu $$0) {
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
