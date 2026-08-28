import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djs extends diy implements dmi {
   public static final MapCodec<djs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mb.e.q().fieldOf("turns_into").forGetter(djs::b),
               mb.b.q().fieldOf("brush_sound").forGetter(djs::c),
               mb.b.q().fieldOf("brush_completed_sound").forGetter(djs::d),
               t()
            )
            .apply($$0, djs::new)
   );
   private static final dxw c = dxn.by;
   public static final int b = 2;
   private final djm d;
   private final avz e;
   private final avz f;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(djm $$0, avz $$1, avz $$2, dww.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }

   @Override
   public dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   public void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if ($$1.c_($$2) instanceof dud $$4) {
         $$4.a($$1);
      }

      if (dmj.n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         cla $$5 = cla.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(dgi $$0, ji $$1, cla $$2) {
      fba $$3 = $$2.cR().f();
      $$0.c(2001, ji.a((kb)$$3), djm.j($$2.p()));
      $$0.a($$2, ebt.f, $$3);
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         ji $$4 = $$2.e();
         if (dmj.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ll(lt.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dud($$0, $$1);
   }

   public djm b() {
      return this.d;
   }

   public avz c() {
      return this.e;
   }

   public avz d() {
      return this.f;
   }
}
