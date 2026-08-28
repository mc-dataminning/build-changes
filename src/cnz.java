import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnz extends cnw {
   private static final akn<jg<coa>> e = akr.a(cnz.class, akp.E);
   public static final float d = 0.0625F;

   public cnz(bxe<? extends cnz> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(e, cui.b(this.dX(), mi.aZ));
   }

   @Override
   public void a(akn<?> $$0) {
      if (e.equals($$0)) {
         this.f();
      }
   }

   private void b(jg<coa> $$0) {
      this.al.a(e, $$0);
   }

   public jg<coa> m() {
      return this.al.a(e);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aM ? c((kk<T>)$$0, this.m()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aM);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aM) {
         this.b(c(kl.aM, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static Optional<cnz> a(djz $$0, iw $$1, jc $$2) {
      cnz $$3 = new cnz($$0, $$1);
      List<jg<coa>> $$4 = new ArrayList<>();
      $$0.J_().f(mi.aZ).c(axp.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cnz::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jg<coa>> $$6 = ag.b($$4, $$3.ae);
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

   private static int c(jg<coa> $$0) {
      return $$0.a().a();
   }

   private cnz(djz $$0, iw $$1) {
      super(bxe.aL, $$0, $$1);
   }

   public cnz(djz $$0, iw $$1, jc $$2, jg<coa> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ua $$0) {
      $$0.a("facing", jc.l, this.c);
      super.b($$0);
      cui.a($$0, this.m());
   }

   @Override
   public void a(ua $$0) {
      this.c = $$0.<jc>a("facing", jc.l).orElse(jc.d);
      super.a($$0);
      this.a(this.c);
      cui.a($$0, this.dX(), mi.aZ).ifPresent(this::b);
   }

   @Override
   protected ffn a(iw $$0, jc $$1) {
      float $$2 = 0.46875F;
      ffs $$3 = ffs.b($$0).a($$1, -0.46875);
      coa $$4 = this.m().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jc $$7 = $$1.i();
      ffs $$8 = $$3.a($$7, $$5).a(jc.b, $$6);
      jc.a $$9 = $$1.o();
      double $$10 = $$9 == jc.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jc.a.c ? 0.0625 : (double)$$4.b();
      return ffn.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(aru $$0, @Nullable bwv $$1) {
      if ($$0.O().c(djv.j)) {
         this.a(awr.te, 1.0F, 1.0F);
         if ($$1 instanceof crz $$2 && $$2.fV()) {
            return;
         }

         this.a($$0, dae.qN);
      }
   }

   @Override
   public void v() {
      this.a(awr.tf, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public ffs du() {
      return ffs.a(this.a);
   }

   @Override
   public zj<aby> a(ars $$0) {
      return new abz(this, this.c.d(), this.j());
   }

   @Override
   public void a(abz $$0) {
      super.a($$0);
      this.a(jc.a($$0.p()));
   }

   @Override
   public daa dI() {
      return new daa(dae.qN);
   }
}
