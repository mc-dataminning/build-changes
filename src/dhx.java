import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dhx extends dal implements daf {
   public static final MapCodec<dhx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajg.a(kj.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ajg.a(kj.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ajg.a(kj.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dhx::new)
   );
   public static final int b = 7;
   public static final dob c = dnr.av;
   protected static final float d = 1.0F;
   protected static final eqm[] e = new eqm[]{
      dac.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dac.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dac.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dac.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dac.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dac.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dac.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dac.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ajg<dac> f;
   private final ajg<dac> g;
   private final ajg<cqh> h;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   protected dhx(ajg<dac> $$0, ajg<dac> $$1, ajg<cqh> $$2, dna.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(dae.cC);
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dbx.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ih $$6 = ih.c.a.a($$3);
               ib $$7 = $$2.a($$6);
               dnb $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dae.cC) || $$8.a(aun.af))) {
                  iy<dac> $$9 = $$1.H_().d(kj.f);
                  Optional<dac> $$10 = $$9.e(this.f);
                  Optional<dac> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(ddx.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm((cxa)DataFixUtils.orElse($$0.H_().d(kj.F).e(this.h), this));
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      int $$4 = Math.min(7, $$3.c(c) + aww.a($$0.z, 2, 5));
      dnb $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }
}
