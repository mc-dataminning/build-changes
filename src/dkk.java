import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkk extends djq implements dna {
   public static final MapCodec<dkk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mb.e.q().fieldOf("turns_into").forGetter(dkk::b),
               mb.b.q().fieldOf("brush_sound").forGetter(dkk::c),
               mb.b.q().fieldOf("brush_completed_sound").forGetter(dkk::d),
               t()
            )
            .apply($$0, dkk::new)
   );
   private static final dyq c = dyg.by;
   public static final int b = 2;
   private final dke d;
   private final avz e;
   private final avz f;

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(dke $$0, avz $$1, avz $$2, dxp.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.c_($$2) instanceof duw $$4) {
         $$4.a($$1);
      }

      if (dnb.n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         clv $$5 = clv.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(dgz $$0, ji $$1, clv $$2) {
      fbx $$3 = $$2.cQ().f();
      $$0.c(2001, ji.a((kb)$$3), dke.j($$2.j()));
      $$0.a($$2, ecp.f, $$3);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         ji $$4 = $$2.e();
         if (dnb.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ll(lt.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new duw($$0, $$1);
   }

   public dke b() {
      return this.d;
   }

   public avz c() {
      return this.e;
   }

   public avz d() {
      return this.f;
   }
}
