import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dla extends dkg implements dnq {
   public static final MapCodec<dla> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               md.e.q().fieldOf("turns_into").forGetter(dla::b),
               md.b.q().fieldOf("brush_sound").forGetter(dla::c),
               md.b.q().fieldOf("brush_completed_sound").forGetter(dla::d),
               t()
            )
            .apply($$0, dla::new)
   );
   private static final dzm c = dzc.by;
   public static final int b = 2;
   private final dku d;
   private final awj e;
   private final awj f;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dku $$0, awj $$1, awj $$2, dyl.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.c_($$2) instanceof dvq $$4) {
         $$4.a($$1);
      }

      if (dnr.n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cmm $$5 = cmm.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(dhp $$0, jj $$1, cmm $$2) {
      fcu $$3 = $$2.cR().f();
      $$0.c(2001, jj.a((kc)$$3), dku.j($$2.j()));
      $$0.a($$2, edm.f, $$3);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$3.a(16) == 0) {
         jj $$4 = $$2.e();
         if (dnr.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ln(lv.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvq($$0, $$1);
   }

   public dku b() {
      return this.d;
   }

   public awj c() {
      return this.e;
   }

   public awj d() {
      return this.f;
   }
}
