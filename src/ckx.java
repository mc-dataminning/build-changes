import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckx extends cku implements bwh<jq<cky>> {
   private static final akm<jq<cky>> g = akq.a(ckx.class, ako.A);
   public static final MapCodec<jq<cky>> d = cky.c.fieldOf("variant");
   public static final Codec<jq<cky>> e = d.codec();
   public static final float f = 0.0625F;

   public ckx(bus<? extends ckx> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(g, this.dX().e(ma.X).a().orElseThrow());
   }

   @Override
   public void a(akm<?> $$0) {
      if (g.equals($$0)) {
         this.j();
      }
   }

   public void b(jq<cky> $$0) {
      this.al.a(g, $$0);
   }

   public jq<cky> q() {
      return this.al.a(g);
   }

   public static Optional<ckx> a(dfm $$0, jh $$1, jm $$2) {
      ckx $$3 = new ckx($$0, $$1);
      List<jq<cky>> $$4 = new ArrayList<>();
      $$0.J_().e(ma.X).c(axm.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.l();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(ckx::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jq<cky>> $$6 = ae.b($$4, $$3.ae);
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

   private static int c(jq<cky> $$0) {
      return $$0.a().a();
   }

   private ckx(dfm $$0, jh $$1) {
      super(bus.aJ, $$0, $$1);
   }

   public ckx(dfm $$0, jh $$1, jm $$2, jq<cky> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ul $$0) {
      e.encodeStart(this.dX().a(uz.a), this.q()).ifSuccess($$1 -> $$0.a((ul)$$1));
      $$0.a("facing", (byte)this.c.e());
      super.b($$0);
   }

   @Override
   public void a(ul $$0) {
      e.parse(this.dX().a(uz.a), $$0).ifSuccess(this::b);
      this.c = jm.b($$0.f("facing"));
      super.a($$0);
      this.a(this.c);
   }

   @Override
   protected ezt a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      ezy $$3 = ezy.b($$0).a($$1, -0.46875);
      cky $$4 = this.q().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jm $$7 = $$1.i();
      ezy $$8 = $$3.a($$7, $$5).a(jm.b, $$6);
      jm.a $$9 = $$1.o();
      double $$10 = $$9 == jm.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jm.a.c ? 0.0625 : (double)$$4.b();
      return ezt.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(arp $$0, @Nullable bul $$1) {
      if ($$0.N().b(dfi.i)) {
         this.a(awn.sr, 1.0F, 1.0F);
         if ($$1 instanceof cou $$2 && $$2.fT()) {
            return;
         }

         this.a($$0, cwq.qa);
      }
   }

   @Override
   public void y() {
      this.a(awn.ss, 1.0F, 1.0F);
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
   public ezy du() {
      return ezy.a(this.a);
   }

   @Override
   public zq<acf> a(arn $$0) {
      return new acg(this, this.c.d(), this.n());
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      this.a(jm.a($$0.p()));
   }

   @Override
   public cwm dI() {
      return new cwm(cwq.qa);
   }
}
