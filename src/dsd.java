import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dsd extends dko implements dkh {
   public static final MapCodec<dsd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aly.a(mb.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               aly.a(mb.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               aly.a(mb.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dsd::new)
   );
   public static final int b = 7;
   public static final dym c = dyd.aw;
   protected static final float d = 1.0F;
   protected static final fcm[] e = new fcm[]{
      dke.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dke.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dke.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dke.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dke.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dke.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dke.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dke.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final aly<dke> f;
   private final aly<dke> g;
   private final aly<cxg> h;

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   protected dsd(aly<dke> $$0, aly<dke> $$1, aly<cxg> $$2, dxm.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(dkg.cK);
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dmb.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jm $$6 = jm.c.a.a($$3);
               jh $$7 = $$2.a($$6);
               dxn $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dkg.cK) || $$8.a(axu.ah))) {
                  kd<dke> $$9 = $$1.K_().e(mb.f);
                  Optional<dke> $$10 = $$9.f(this.f);
                  Optional<dke> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(doc.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk((dgz)DataFixUtils.orElse($$0.K_().e(mb.K).f(this.h), this));
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      int $$4 = Math.min(7, $$3.c(c) + bae.a($$0.A, 2, 5));
      dxn $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }
}
