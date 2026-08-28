import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dij extends dhq implements dky {
   public static final MapCodec<dij> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ly.e.q().fieldOf("turns_into").forGetter(dij::b),
               ly.b.q().fieldOf("brush_sound").forGetter(dij::c),
               ly.b.q().fieldOf("brush_completed_sound").forGetter(dij::d),
               t()
            )
            .apply($$0, dij::new)
   );
   private static final dwj c = dvz.bv;
   public static final int b = 2;
   private final die d;
   private final awk e;
   private final awk f;

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   public dij(die $$0, awk $$1, awk $$2, dvi.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }

   @Override
   public dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   public void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.c_($$2) instanceof dsq $$4) {
         $$4.a($$1);
      }

      if (dkz.n($$1.a_($$2.e())) && $$2.v() >= $$1.I_()) {
         cku $$5 = cku.a($$1, $$2, $$0);
         $$5.o();
      }
   }

   @Override
   public void a(dfb $$0, jh $$1, cku $$2) {
      ezn $$3 = $$2.cS().f();
      $$0.c(2001, jh.a((ka)$$3), die.j($$2.q()));
      $$0.a($$2, eag.f, $$3);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (dkz.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lj(lr.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsq($$0, $$1);
   }

   public die b() {
      return this.d;
   }

   public awk c() {
      return this.e;
   }

   public awk d() {
      return this.f;
   }
}
