import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlw extends dej implements ded {
   public static final MapCodec<dlw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akm.a(lf.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akm.a(lf.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akm.a(lf.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dlw::new)
   );
   public static final int b = 7;
   public static final dsd c = drt.av;
   protected static final float d = 1.0F;
   protected static final evf[] e = new evf[]{
      dea.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dea.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dea.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dea.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dea.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dea.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dea.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dea.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akm<dea> f;
   private final akm<dea> g;
   private final akm<ctl> h;

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   protected dlw(akm<dea> $$0, akm<dea> $$1, akm<ctl> $$2, drc.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(dec.cC);
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dfv.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               it $$6 = it.c.a.a($$3);
               io $$7 = $$2.a($$6);
               drd $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dec.cC) || $$8.a(avx.af))) {
                  jk<dea> $$9 = $$1.H_().d(lf.f);
                  Optional<dea> $$10 = $$9.e(this.f);
                  Optional<dea> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().n());
                     $$1.b($$2, $$11.get().n().a(dhw.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq((day)DataFixUtils.orElse($$0.H_().d(lf.G).e(this.h), this));
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayf.a($$0.z, 2, 5));
      drd $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }
}
