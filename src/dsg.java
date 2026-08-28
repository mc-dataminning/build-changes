import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dsg extends dko implements dkh {
   public static final MapCodec<dsg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akt.a(mc.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akt.a(mc.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               akt.a(mc.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dsg::new)
   );
   public static final int b = 7;
   public static final dyq c = dyg.ay;
   private static final fcr[] d = dke.a(7, $$0 -> dke.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final akt<dke> e;
   private final akt<dke> f;
   private final akt<cxd> g;

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   protected dsg(akt<dke> $$0, akt<dke> $$1, akt<cxd> $$2, dxp.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(dkg.cK);
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dma.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jn $$6 = jn.c.a.a($$3);
               ji $$7 = $$2.a($$6);
               dxq $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dkg.cK) || $$8.a(awp.ah))) {
                  ke<dke> $$9 = $$1.F_().e(mc.f);
                  Optional<dke> $$10 = $$9.f(this.e);
                  Optional<dke> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dod.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh((dgy)DataFixUtils.orElse($$0.F_().e(mc.K).f(this.g), this));
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayz.a($$0.A, 2, 5));
      dxq $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }
}
