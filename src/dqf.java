import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqf extends dis implements dim {
   public static final MapCodec<dqf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alk.a(ma.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               alk.a(ma.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               alk.a(ma.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dqf::new)
   );
   public static final int b = 7;
   public static final dwn c = dwe.av;
   protected static final float d = 1.0F;
   protected static final fal[] e = new fal[]{
      dij.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dij.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dij.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dij.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dij.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dij.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dij.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dij.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final alk<dij> f;
   private final alk<dij> g;
   private final alk<cwb> h;

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   protected dqf(alk<dij> $$0, alk<dij> $$1, alk<cwb> $$2, dvn.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(dil.cC);
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dke.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jm $$6 = jm.c.a.a($$3);
               jh $$7 = $$2.a($$6);
               dvo $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dil.cC) || $$8.a(axd.ag))) {
                  kd<dij> $$9 = $$1.H_().e(ma.f);
                  Optional<dij> $$10 = $$9.f(this.f);
                  Optional<dij> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dme.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf((dfe)DataFixUtils.orElse($$0.H_().e(ma.K).f(this.h), this));
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azn.a($$0.A, 2, 5));
      dvo $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }
}
