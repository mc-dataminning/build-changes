import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dhv extends daj implements dad {
   public static final MapCodec<dhv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajg.a(kj.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ajg.a(kj.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ajg.a(kj.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dhv::new)
   );
   public static final int b = 7;
   public static final dnz c = dnp.av;
   protected static final float d = 1.0F;
   protected static final eqk[] e = new eqk[]{
      daa.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      daa.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      daa.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      daa.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      daa.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      daa.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      daa.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      daa.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ajg<daa> f;
   private final ajg<daa> g;
   private final ajg<cqf> h;

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   protected dhv(ajg<daa> $$0, ajg<daa> $$1, ajg<cqf> $$2, dmy.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(dac.cC);
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dbv.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ih $$6 = ih.c.a.a($$3);
               ib $$7 = $$2.a($$6);
               dmz $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dac.cC) || $$8.a(aun.af))) {
                  iy<daa> $$9 = $$1.H_().d(kj.f);
                  Optional<daa> $$10 = $$9.e(this.f);
                  Optional<daa> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(ddv.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk((cwy)DataFixUtils.orElse($$0.H_().d(kj.F).e(this.h), this));
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      int $$4 = Math.min(7, $$3.c(c) + aww.a($$0.z, 2, 5));
      dmz $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }
}
