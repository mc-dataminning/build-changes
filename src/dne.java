import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dne extends dfr implements dfl {
   public static final MapCodec<dne> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akj.a(lr.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akj.a(lr.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akj.a(lr.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dne::new)
   );
   public static final int b = 7;
   public static final dtl c = dtb.av;
   protected static final float d = 1.0F;
   protected static final exa[] e = new exa[]{
      dfi.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dfi.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dfi.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dfi.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dfi.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dfi.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dfi.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dfi.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akj<dfi> f;
   private final akj<dfi> g;
   private final akj<cty> h;

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   protected dne(akj<dfi> $$0, akj<dfi> $$1, akj<cty> $$2, dsk.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(dfk.cC);
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dhd.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jf $$6 = jf.c.a.a($$3);
               ja $$7 = $$2.a($$6);
               dsl $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dfk.cC) || $$8.a(avw.af))) {
                  jw<dfi> $$9 = $$1.H_().d(lr.f);
                  Optional<dfi> $$10 = $$9.e(this.f);
                  Optional<dfi> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(dje.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud((dcf)DataFixUtils.orElse($$0.H_().d(lr.K).e(this.h), this));
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayg.a($$0.z, 2, 5));
      dsl $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }
}
