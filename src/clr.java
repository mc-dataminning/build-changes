import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class clr extends clo implements bxb<jq<cls>> {
   private static final alc<jq<cls>> g = alg.a(clr.class, ale.A);
   public static final MapCodec<jq<cls>> d = cls.c.fieldOf("variant");
   public static final Codec<jq<cls>> e = d.codec();
   public static final float f = 0.0625F;

   public clr(bvm<? extends clr> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(g, this.dX().e(mb.X).a().orElseThrow());
   }

   @Override
   public void a(alc<?> $$0) {
      if (g.equals($$0)) {
         this.l();
      }
   }

   public void b(jq<cls> $$0) {
      this.al.a(g, $$0);
   }

   public jq<cls> s() {
      return this.al.a(g);
   }

   public static Optional<clr> a(dha $$0, jh $$1, jm $$2) {
      clr $$3 = new clr($$0, $$1);
      List<jq<cls>> $$4 = new ArrayList<>();
      $$0.K_().e(mb.X).c(aye.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.m();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(clr::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jq<cls>> $$6 = ae.b($$4, $$3.ae);
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

   private static int c(jq<cls> $$0) {
      return $$0.a().a();
   }

   private clr(dha $$0, jh $$1) {
      super(bvm.aL, $$0, $$1);
   }

   public clr(dha $$0, jh $$1, jm $$2, jq<cls> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ux $$0) {
      e.encodeStart(this.dX().a(vl.a), this.s()).ifSuccess($$1 -> $$0.a((ux)$$1));
      $$0.a("facing", (byte)this.c.e());
      super.b($$0);
   }

   @Override
   public void a(ux $$0) {
      e.parse(this.dX().a(vl.a), $$0).ifSuccess(this::b);
      this.c = jm.b($$0.f("facing"));
      super.a($$0);
      this.a(this.c);
   }

   @Override
   protected fbn a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      fbs $$3 = fbs.b($$0).a($$1, -0.46875);
      cls $$4 = this.s().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jm $$7 = $$1.i();
      fbs $$8 = $$3.a($$7, $$5).a(jm.b, $$6);
      jm.a $$9 = $$1.o();
      double $$10 = $$9 == jm.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jm.a.c ? 0.0625 : (double)$$4.b();
      return fbn.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(ash $$0, @Nullable bvf $$1) {
      if ($$0.N().b(dgw.i)) {
         this.a(axf.sJ, 1.0F, 1.0F);
         if ($$1 instanceof cps $$2 && $$2.fT()) {
            return;
         }

         this.a($$0, cxo.qv);
      }
   }

   @Override
   public void z() {
      this.a(axf.sK, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public fbs du() {
      return fbs.a(this.a);
   }

   @Override
   public aac<acr> a(asf $$0) {
      return new acs(this, this.c.d(), this.p());
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      this.a(jm.a($$0.p()));
   }

   @Override
   public cxk dI() {
      return new cxk(cxo.qv);
   }
}
