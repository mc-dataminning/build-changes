import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqm extends diz implements dit {
   public static final MapCodec<dqm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ali.a(ma.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ali.a(ma.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ali.a(ma.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dqm::new)
   );
   public static final int b = 7;
   public static final dwu c = dwl.av;
   protected static final float d = 1.0F;
   protected static final fas[] e = new fas[]{
      diq.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      diq.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      diq.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      diq.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      diq.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      diq.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      diq.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      diq.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ali<diq> f;
   private final ali<diq> g;
   private final ali<cwi> h;

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   protected dqm(ali<diq> $$0, ali<diq> $$1, ali<cwi> $$2, dvu.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(dis.cC);
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dkl.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jm $$6 = jm.c.a.a($$3);
               jh $$7 = $$2.a($$6);
               dvv $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dis.cC) || $$8.a(axc.ag))) {
                  kd<diq> $$9 = $$1.J_().e(ma.f);
                  Optional<diq> $$10 = $$9.f(this.f);
                  Optional<diq> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dml.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm((dfl)DataFixUtils.orElse($$0.J_().e(ma.K).f(this.h), this));
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azm.a($$0.A, 2, 5));
      dvv $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }
}
