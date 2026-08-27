import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class djt extends dch implements dcb {
   public static final MapCodec<djt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajs.a(ks.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ajs.a(ks.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ajs.a(ks.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, djt::new)
   );
   public static final int b = 7;
   public static final dpz c = dpp.av;
   protected static final float d = 1.0F;
   protected static final est[] e = new est[]{
      dby.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dby.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dby.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dby.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dby.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dby.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dby.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dby.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ajs<dby> f;
   private final ajs<dby> g;
   private final ajs<cre> h;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   protected djt(ajs<dby> $$0, ajs<dby> $$1, ajs<cre> $$2, doy.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(dca.cC);
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = ddt.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ih $$6 = ih.c.a.a($$3);
               ib $$7 = $$2.a($$6);
               doz $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dca.cC) || $$8.a(avc.af))) {
                  iy<dby> $$9 = $$1.H_().d(ks.f);
                  Optional<dby> $$10 = $$9.e(this.f);
                  Optional<dby> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().n());
                     $$1.b($$2, $$11.get().n().a(dft.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj((cyw)DataFixUtils.orElse($$0.H_().d(ks.F).e(this.h), this));
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      int $$4 = Math.min(7, $$3.c(c) + axk.a($$0.z, 2, 5));
      doz $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }
}
