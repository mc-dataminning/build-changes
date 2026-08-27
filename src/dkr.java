import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dkr extends dde implements dcy {
   public static final MapCodec<dkr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ake.a(ld.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ake.a(ld.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ake.a(ld.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dkr::new)
   );
   public static final int b = 7;
   public static final dqy c = dqo.av;
   protected static final float d = 1.0F;
   protected static final ety[] e = new ety[]{
      dcv.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dcv.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dcv.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dcv.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dcv.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dcv.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dcv.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dcv.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ake<dcv> f;
   private final ake<dcv> g;
   private final ake<cry> h;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   protected dkr(ake<dcv> $$0, ake<dcv> $$1, ake<cry> $$2, dpx.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(dcx.cC);
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = deq.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ir $$6 = ir.c.a.a($$3);
               im $$7 = $$2.a($$6);
               dpy $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dcx.cC) || $$8.a(avo.af))) {
                  ji<dcv> $$9 = $$1.H_().d(ld.f);
                  Optional<dcv> $$10 = $$9.e(this.f);
                  Optional<dcv> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().n());
                     $$1.b($$2, $$11.get().n().a(dgr.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd((czt)DataFixUtils.orElse($$0.H_().d(ld.G).e(this.h), this));
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      int $$4 = Math.min(7, $$3.c(c) + axw.a($$0.z, 2, 5));
      dpy $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }
}
