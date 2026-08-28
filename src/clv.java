import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class clv extends cls implements bxf<jq<clw>> {
   private static final alc<jq<clw>> g = alg.a(clv.class, ale.A);
   public static final MapCodec<jq<clw>> d = clw.c.fieldOf("variant");
   public static final Codec<jq<clw>> e = d.codec();
   public static final float f = 0.0625F;

   public clv(bvq<? extends clv> $$0, dhh $$1) {
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

   public void b(jq<clw> $$0) {
      this.al.a(g, $$0);
   }

   public jq<clw> s() {
      return this.al.a(g);
   }

   public static Optional<clv> a(dhh $$0, jh $$1, jm $$2) {
      clv $$3 = new clv($$0, $$1);
      List<jq<clw>> $$4 = new ArrayList<>();
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
            int $$5 = $$4.stream().mapToInt(clv::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jq<clw>> $$6 = ae.b($$4, $$3.ae);
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

   private static int c(jq<clw> $$0) {
      return $$0.a().a();
   }

   private clv(dhh $$0, jh $$1) {
      super(bvq.aL, $$0, $$1);
   }

   public clv(dhh $$0, jh $$1, jm $$2, jq<clw> $$3) {
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
   protected fbs a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      fbx $$3 = fbx.b($$0).a($$1, -0.46875);
      clw $$4 = this.s().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jm $$7 = $$1.i();
      fbx $$8 = $$3.a($$7, $$5).a(jm.b, $$6);
      jm.a $$9 = $$1.o();
      double $$10 = $$9 == jm.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jm.a.c ? 0.0625 : (double)$$4.b();
      return fbs.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(ash $$0, @Nullable bvj $$1) {
      if ($$0.N().b(dhd.i)) {
         this.a(axf.sK, 1.0F, 1.0F);
         if ($$1 instanceof cpw $$2 && $$2.fT()) {
            return;
         }

         this.a($$0, cxs.qv);
      }
   }

   @Override
   public void z() {
      this.a(axf.sL, 1.0F, 1.0F);
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
   public fbx du() {
      return fbx.a(this.a);
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
   public cxo dI() {
      return new cxo(cxs.qv);
   }
}
