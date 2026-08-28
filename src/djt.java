import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djt extends diz implements dmj {
   public static final MapCodec<djt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mb.e.q().fieldOf("turns_into").forGetter(djt::b),
               mb.b.q().fieldOf("brush_sound").forGetter(djt::c),
               mb.b.q().fieldOf("brush_completed_sound").forGetter(djt::d),
               t()
            )
            .apply($$0, djt::new)
   );
   private static final dxx c = dxo.by;
   public static final int b = 2;
   private final djn d;
   private final avz e;
   private final avz f;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(djn $$0, avz $$1, avz $$2, dwx.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }

   @Override
   public void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.c_($$2) instanceof due $$4) {
         $$4.a($$1);
      }

      if (dmk.n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         clc $$5 = clc.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(dgj $$0, ji $$1, clc $$2) {
      fbb $$3 = $$2.cR().f();
      $$0.c(2001, ji.a((kb)$$3), djn.j($$2.p()));
      $$0.a($$2, ebu.f, $$3);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         ji $$4 = $$2.e();
         if (dmk.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ll(lt.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new due($$0, $$1);
   }

   public djn b() {
      return this.d;
   }

   public avz c() {
      return this.e;
   }

   public avz d() {
      return this.f;
   }
}
