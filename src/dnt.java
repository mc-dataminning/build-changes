import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnt extends dgf implements dfz {
   public static final MapCodec<dnt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akp.a(lu.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akp.a(lu.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akp.a(lu.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dnt::new)
   );
   public static final int b = 7;
   public static final dua c = dtq.av;
   protected static final float d = 1.0F;
   protected static final exp[] e = new exp[]{
      dfw.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dfw.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dfw.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dfw.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dfw.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dfw.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dfw.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dfw.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akp<dfw> f;
   private final akp<dfw> g;
   private final akp<cuj> h;

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   protected dnt(akp<dfw> $$0, akp<dfw> $$1, akp<cuj> $$2, dsz.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(dfy.cC);
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dhr.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ji $$6 = ji.c.a.a($$3);
               jd $$7 = $$2.a($$6);
               dta $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dfy.cC) || $$8.a(awd.af))) {
                  jz<dfw> $$9 = $$1.H_().d(lu.f);
                  Optional<dfw> $$10 = $$9.e(this.f);
                  Optional<dfw> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(djs.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo((dct)DataFixUtils.orElse($$0.H_().d(lu.K).e(this.h), this));
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayn.a($$0.z, 2, 5));
      dta $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }
}
