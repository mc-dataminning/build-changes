import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dsw extends dle implements dkx {
   public static final MapCodec<dsw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alc.a(me.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alc.a(me.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               alc.a(me.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dsw::new)
   );
   public static final int b = 7;
   public static final dzm c = dzc.ay;
   private static final fdo[] d = dku.a(7, $$0 -> dku.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final alc<dku> e;
   private final alc<dku> f;
   private final alc<cxu> g;

   @Override
   public MapCodec<dsw> a() {
      return a;
   }

   protected dsw(alc<dku> $$0, alc<dku> $$1, alc<cxu> $$2, dyl.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(dkw.cK);
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dmq.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jo $$6 = jo.c.a.a($$3);
               jj $$7 = $$2.a($$6);
               dym $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dkw.cK) || $$8.a(awz.ah))) {
                  kf<dku> $$9 = $$1.F_().f(me.f);
                  Optional<dku> $$10 = $$9.f(this.e);
                  Optional<dku> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dot.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy((dho)DataFixUtils.orElse($$0.F_().f(me.K).f(this.g), this));
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azk.a($$0.A, 2, 5));
      dym $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }
}
