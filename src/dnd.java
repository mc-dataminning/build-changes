import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnd extends dfq implements dfk {
   public static final MapCodec<dnd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akj.a(lr.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akj.a(lr.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akj.a(lr.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dnd::new)
   );
   public static final int b = 7;
   public static final dtk c = dta.av;
   protected static final float d = 1.0F;
   protected static final ewy[] e = new ewy[]{
      dfh.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dfh.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dfh.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dfh.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dfh.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dfh.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dfh.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dfh.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akj<dfh> f;
   private final akj<dfh> g;
   private final akj<ctx> h;

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   protected dnd(akj<dfh> $$0, akj<dfh> $$1, akj<ctx> $$2, dsj.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(dfj.cC);
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dhc.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jf $$6 = jf.c.a.a($$3);
               ja $$7 = $$2.a($$6);
               dsk $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dfj.cC) || $$8.a(avw.af))) {
                  jw<dfh> $$9 = $$1.H_().d(lr.f);
                  Optional<dfh> $$10 = $$9.e(this.f);
                  Optional<dfh> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(djd.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc((dce)DataFixUtils.orElse($$0.H_().d(lr.K).e(this.h), this));
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayg.a($$0.z, 2, 5));
      dsk $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }
}
