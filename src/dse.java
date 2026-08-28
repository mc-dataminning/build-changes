import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dse extends dkn implements dkg {
   public static final MapCodec<dse> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alo.a(mb.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               alo.a(mb.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               alo.a(mb.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dse::new)
   );
   public static final int b = 7;
   public static final dyn c = dye.ay;
   protected static final float d = 1.0F;
   protected static final fcl[] e = new fcl[]{
      dkd.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dkd.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dkd.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dkd.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dkd.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dkd.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dkd.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dkd.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final alo<dkd> f;
   private final alo<dkd> g;
   private final alo<cxc> h;

   @Override
   public MapCodec<dse> a() {
      return a;
   }

   protected dse(alo<dkd> $$0, alo<dkd> $$1, alo<cxc> $$2, dxn.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(dkf.cK);
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dlz.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jm $$6 = jm.c.a.a($$3);
               jh $$7 = $$2.a($$6);
               dxo $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dkf.cK) || $$8.a(axk.ah))) {
                  kd<dkd> $$9 = $$1.K_().e(mb.f);
                  Optional<dkd> $$10 = $$9.f(this.f);
                  Optional<dkd> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dob.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg((dgy)DataFixUtils.orElse($$0.K_().e(mb.K).f(this.h), this));
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azu.a($$0.A, 2, 5));
      dxo $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }
}
