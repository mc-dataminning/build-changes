import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djr extends dix implements dmh {
   public static final MapCodec<djr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mb.e.q().fieldOf("turns_into").forGetter(djr::b),
               mb.b.q().fieldOf("brush_sound").forGetter(djr::c),
               mb.b.q().fieldOf("brush_completed_sound").forGetter(djr::d),
               t()
            )
            .apply($$0, djr::new)
   );
   private static final dxv c = dxm.by;
   public static final int b = 2;
   private final djl d;
   private final avz e;
   private final avz f;

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(djl $$0, avz $$1, avz $$2, dwv.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }

   @Override
   public void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.c_($$2) instanceof duc $$4) {
         $$4.a($$1);
      }

      if (dmi.n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         cla $$5 = cla.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(dgh $$0, ji $$1, cla $$2) {
      faz $$3 = $$2.cR().f();
      $$0.c(2001, ji.a((kb)$$3), djl.j($$2.p()));
      $$0.a($$2, ebs.f, $$3);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         ji $$4 = $$2.e();
         if (dmi.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ll(lt.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new duc($$0, $$1);
   }

   public djl b() {
      return this.d;
   }

   public avz c() {
      return this.e;
   }

   public avz d() {
      return this.f;
   }
}
