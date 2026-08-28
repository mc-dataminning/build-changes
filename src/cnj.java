import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnj extends cng {
   private static final akj<jf<cnk>> e = akn.a(cnj.class, akl.D);
   public static final float d = 0.0625F;

   public cnj(bwr<? extends cnj> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, cts.b(this.dW(), mh.aZ));
   }

   @Override
   public void a(akj<?> $$0) {
      if (e.equals($$0)) {
         this.f();
      }
   }

   private void b(jf<cnk> $$0) {
      this.al.a(e, $$0);
   }

   public jf<cnk> m() {
      return this.al.a(e);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aL ? c((kj<T>)$$0, this.m()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aL);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aL) {
         this.b(c(kk.aL, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static Optional<cnj> a(djh $$0, iv $$1, jb $$2) {
      cnj $$3 = new cnj($$0, $$1);
      List<jf<cnk>> $$4 = new ArrayList<>();
      $$0.F_().f(mh.aZ).c(axl.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.g();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(cnj::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jf<cnk>> $$6 = ag.b($$4, $$3.ae);
            if ($$6.isEmpty()) {
               return Optional.empty();
            } else {
               $$3.b($$6.get());
               $$3.a($$2);
               return Optional.of($$3);
            }
         }
      }
   }

   private static int c(jf<cnk> $$0) {
      return $$0.a().a();
   }

   private cnj(djh $$0, iv $$1) {
      super(bwr.aK, $$0, $$1);
   }

   public cnj(djh $$0, iv $$1, jb $$2, jf<cnk> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tz $$0) {
      $$0.a("facing", jb.l, this.c);
      super.b($$0);
      cts.a($$0, this.m());
   }

   @Override
   public void a(tz $$0) {
      this.c = $$0.<jb>a("facing", jb.l).orElse(jb.d);
      super.a($$0);
      this.a(this.c);
      cts.a($$0, this.dW(), mh.aZ).ifPresent(this::b);
   }

   @Override
   protected fes a(iv $$0, jb $$1) {
      float $$2 = 0.46875F;
      fex $$3 = fex.b($$0).a($$1, -0.46875);
      cnk $$4 = this.m().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jb $$7 = $$1.i();
      fex $$8 = $$3.a($$7, $$5).a(jb.b, $$6);
      jb.a $$9 = $$1.o();
      double $$10 = $$9 == jb.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jb.a.c ? 0.0625 : (double)$$4.b();
      return fes.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(arq $$0, @Nullable bwi $$1) {
      if ($$0.O().c(djd.j)) {
         this.a(awn.te, 1.0F, 1.0F);
         if ($$1 instanceof crj $$2 && $$2.fU()) {
            return;
         }

         this.a($$0, czo.qN);
      }
   }

   @Override
   public void v() {
      this.a(awn.tf, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public fex dt() {
      return fex.a(this.a);
   }

   @Override
   public zf<abu> a(aro $$0) {
      return new abv(this, this.c.d(), this.j());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.a(jb.a($$0.p()));
   }

   @Override
   public czk dH() {
      return new czk(czo.qN);
   }
}
