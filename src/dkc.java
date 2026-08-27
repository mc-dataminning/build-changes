import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dkc extends dcq implements dck {
   public static final MapCodec<dkc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aju.a(ku.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               aju.a(ku.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               aju.a(ku.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dkc::new)
   );
   public static final int b = 7;
   public static final dqi c = dpy.av;
   protected static final float d = 1.0F;
   protected static final etc[] e = new etc[]{
      dch.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dch.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dch.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dch.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dch.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dch.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dch.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dch.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final aju<dch> f;
   private final aju<dch> g;
   private final aju<crn> h;

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   protected dkc(aju<dch> $$0, aju<dch> $$1, aju<crn> $$2, dph.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.a(dcj.cC);
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dec.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ij $$6 = ij.c.a.a($$3);
               id $$7 = $$2.a($$6);
               dpi $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dcj.cC) || $$8.a(ave.af))) {
                  ja<dch> $$9 = $$1.H_().d(ku.f);
                  Optional<dch> $$10 = $$9.e(this.f);
                  Optional<dch> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().n());
                     $$1.b($$2, $$11.get().n().a(dgc.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs((czf)DataFixUtils.orElse($$0.H_().d(ku.G).e(this.h), this));
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      int $$4 = Math.min(7, $$3.c(c) + axm.a($$0.z, 2, 5));
      dpi $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }
}
