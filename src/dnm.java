import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnm extends dfl implements dff {
   public static final MapCodec<dnm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aks.a(li.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               aks.a(li.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               aks.a(li.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dnm::new)
   );
   public static final int b = 7;
   public static final duc c = dts.av;
   protected static final float d = 1.0F;
   protected static final exn[] e = new exn[]{
      dfc.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dfc.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dfc.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dfc.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dfc.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dfc.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dfc.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dfc.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final aks<dfc> f;
   private final aks<dfc> g;
   private final aks<cuc> h;

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   protected dnm(aks<dfc> $$0, aks<dfc> $$1, aks<cuc> $$2, dtb.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(dfe.dn) || $$0.a(dfe.do);
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dgy.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               iw $$6 = iw.c.a.a($$3);
               ir $$7 = $$2.a($$6);
               dtc $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dfe.dn) || $$8.a(awe.ag) || $$8.a(dfe.do))) {
                  jn<dfc> $$9 = $$1.I_().d(li.f);
                  Optional<dfc> $$10 = $$9.e(this.f);
                  Optional<dfc> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().n());
                     $$1.b($$2, $$11.get().n().a(djc.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh((dbz)DataFixUtils.orElse($$0.I_().d(li.G).e(this.h), this));
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      int $$4 = Math.min(7, $$3.c(c) + aym.a($$0.A, 2, 5));
      dtc $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }
}
