import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnb extends dfo implements dfi {
   public static final MapCodec<dnb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akj.a(lr.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akj.a(lr.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akj.a(lr.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dnb::new)
   );
   public static final int b = 7;
   public static final dth c = dsx.av;
   protected static final float d = 1.0F;
   protected static final ews[] e = new ews[]{
      dff.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dff.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dff.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dff.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dff.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dff.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dff.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dff.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akj<dff> f;
   private final akj<dff> g;
   private final akj<ctv> h;

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   protected dnb(akj<dff> $$0, akj<dff> $$1, akj<ctv> $$2, dsg.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(dfh.cC);
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dha.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jf $$6 = jf.c.a.a($$3);
               ja $$7 = $$2.a($$6);
               dsh $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dfh.cC) || $$8.a(avu.af))) {
                  jw<dff> $$9 = $$1.H_().d(lr.f);
                  Optional<dff> $$10 = $$9.e(this.f);
                  Optional<dff> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(djb.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua((dcc)DataFixUtils.orElse($$0.H_().d(lr.K).e(this.h), this));
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      int $$4 = Math.min(7, $$3.c(c) + aye.a($$0.z, 2, 5));
      dsh $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }
}
