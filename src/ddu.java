import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ddu extends cwi implements cwc {
   public static final MapCodec<ddu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ags.a(kc.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ags.a(kc.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ags.a(kc.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, ddu::new)
   );
   public static final int b = 7;
   public static final djp c = djf.av;
   protected static final float d = 1.0F;
   protected static final elu[] e = new elu[]{
      cvz.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cvz.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cvz.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cvz.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cvz.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cvz.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cvz.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cvz.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ags<cvz> f;
   private final ags<cvz> g;
   private final ags<cmc> h;

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   protected ddu(ags<cvz> $$0, ags<cvz> $$1, ags<cmc> $$2, dio.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(cwb.cC);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cxu.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ia $$6 = ia.c.a.a($$3);
               hv $$7 = $$2.a($$6);
               dip $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cwb.cC) || $$8.a(arr.af))) {
                  ir<cvz> $$9 = $$1.I_().d(kc.f);
                  Optional<cvz> $$10 = $$9.d(this.f);
                  Optional<cvz> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(czu.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh((csx)DataFixUtils.orElse($$0.I_().d(kc.F).d(this.h), this));
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      int $$4 = Math.min(7, $$3.c(c) + aty.a($$0.z, 2, 5));
      dip $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }
}
