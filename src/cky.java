import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cky extends ckv implements bwi<jr<ckz>> {
   private static final ajy<jr<ckz>> g = akc.a(cky.class, aka.A);
   public static final MapCodec<jr<ckz>> d = ckz.c.fieldOf("variant");
   public static final Codec<jr<ckz>> e = d.codec();
   public static final float f = 0.0625F;

   public cky(but<? extends cky> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(g, this.dX().e(mc.X).a().orElseThrow());
   }

   @Override
   public void a(ajy<?> $$0) {
      if (g.equals($$0)) {
         this.l();
      }
   }

   public void b(jr<ckz> $$0) {
      this.al.a(g, $$0);
   }

   public jr<ckz> s() {
      return this.al.a(g);
   }

   public static Optional<cky> a(dgj $$0, ji $$1, jn $$2) {
      cky $$3 = new cky($$0, $$1);
      List<jr<ckz>> $$4 = new ArrayList<>();
      $$0.K_().e(mc.X).c(awz.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cky::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jr<ckz>> $$6 = af.b($$4, $$3.ae);
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

   private static int c(jr<ckz> $$0) {
      return $$0.a().a();
   }

   private cky(dgj $$0, ji $$1) {
      super(but.aK, $$0, $$1);
   }

   public cky(dgj $$0, ji $$1, jn $$2, jr<ckz> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tq $$0) {
      e.encodeStart(this.dX().a(ue.a), this.s()).ifSuccess($$1 -> $$0.a((tq)$$1));
      $$0.a("facing", (byte)this.c.e());
      super.b($$0);
   }

   @Override
   public void a(tq $$0) {
      e.parse(this.dX().a(ue.a), $$0).ifSuccess(this::b);
      this.c = jn.b($$0.f("facing"));
      super.a($$0);
      this.a(this.c);
   }

   @Override
   protected faw a(ji $$0, jn $$1) {
      float $$2 = 0.46875F;
      fbb $$3 = fbb.b($$0).a($$1, -0.46875);
      ckz $$4 = this.s().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jn $$7 = $$1.i();
      fbb $$8 = $$3.a($$7, $$5).a(jn.b, $$6);
      jn.a $$9 = $$1.o();
      double $$10 = $$9 == jn.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jn.a.c ? 0.0625 : (double)$$4.b();
      return faw.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(ard $$0, @Nullable bum $$1) {
      if ($$0.O().b(dgf.i)) {
         this.a(awa.sQ, 1.0F, 1.0F);
         if ($$1 instanceof coy $$2 && $$2.fV()) {
            return;
         }

         this.a($$0, cwu.qE);
      }
   }

   @Override
   public void z() {
      this.a(awa.sR, 1.0F, 1.0F);
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
   public fbb du() {
      return fbb.a(this.a);
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, this.c.d(), this.p());
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      this.a(jn.a($$0.p()));
   }

   @Override
   public cwq dI() {
      return new cwq(cwu.qE);
   }
}
