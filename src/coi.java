import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class coi extends cof {
   private static final aku<jg<coj>> e = aky.a(coi.class, akw.E);
   public static final float d = 0.0625F;

   public coi(bxn<? extends coi> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(e, cur.b(this.dX(), mi.aZ));
   }

   @Override
   public void a(aku<?> $$0) {
      if (e.equals($$0)) {
         this.f();
      }
   }

   private void b(jg<coj> $$0) {
      this.al.a(e, $$0);
   }

   public jg<coj> m() {
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

   public static Optional<coi> a(dkj $$0, iw $$1, jc $$2) {
      coi $$3 = new coi($$0, $$1);
      List<jg<coj>> $$4 = new ArrayList<>();
      $$0.J_().f(mi.aZ).c(axw.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(coi::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jg<coj>> $$6 = ag.b($$4, $$3.ae);
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

   private static int c(jg<coj> $$0) {
      return $$0.a().a();
   }

   private coi(dkj $$0, iw $$1) {
      super(bxn.aL, $$0, $$1);
   }

   public coi(dkj $$0, iw $$1, jc $$2, jg<coj> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ua $$0) {
      $$0.a("facing", jc.l, this.c);
      super.b($$0);
      cur.a($$0, this.m());
   }

   @Override
   public void a(ua $$0) {
      this.c = $$0.<jc>a("facing", jc.l).orElse(jc.d);
      super.a($$0);
      this.a(this.c);
      cur.a($$0, this.dX(), mi.aZ).ifPresent(this::b);
   }

   @Override
   protected ffx a(iw $$0, jc $$1) {
      float $$2 = 0.46875F;
      fgc $$3 = fgc.b($$0).a($$1, -0.46875);
      coj $$4 = this.m().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jc $$7 = $$1.i();
      fgc $$8 = $$3.a($$7, $$5).a(jc.b, $$6);
      jc.a $$9 = $$1.o();
      double $$10 = $$9 == jc.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jc.a.c ? 0.0625 : (double)$$4.b();
      return ffx.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(asb $$0, @Nullable bxe $$1) {
      if ($$0.O().c(dkf.j)) {
         this.a(awy.te, 1.0F, 1.0F);
         if ($$1 instanceof csi $$2 && $$2.fV()) {
            return;
         }

         this.a($$0, dao.qN);
      }
   }

   @Override
   public void v() {
      this.a(awy.tf, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public fgc du() {
      return fgc.a(this.a);
   }

   @Override
   public zo<acf> a(arz $$0) {
      return new acg(this, this.c.d(), this.j());
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      this.a(jc.a($$0.p()));
   }

   @Override
   public dak dI() {
      return new dak(dao.qN);
   }
}
