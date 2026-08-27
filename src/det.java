import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class det extends cxh implements cxb {
   public static final MapCodec<det> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ahg.a(ke.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ahg.a(ke.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ahg.a(ke.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, det::new)
   );
   public static final int b = 7;
   public static final dkp c = dkf.av;
   protected static final float d = 1.0F;
   protected static final emv[] e = new emv[]{
      cwy.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cwy.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cwy.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cwy.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cwy.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cwy.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cwy.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cwy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ahg<cwy> f;
   private final ahg<cwy> g;
   private final ahg<cnb> h;

   @Override
   public MapCodec<det> a() {
      return a;
   }

   protected det(ahg<cwy> $$0, ahg<cwy> $$1, ahg<cnb> $$2, djo.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(cxa.cC);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cyt.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ic $$6 = ic.c.a.a($$3);
               hx $$7 = $$2.a($$6);
               djp $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cxa.cC) || $$8.a(asi.af))) {
                  it<cwy> $$9 = $$1.I_().d(ke.f);
                  Optional<cwy> $$10 = $$9.d(this.f);
                  Optional<cwy> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(dat.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng((ctw)DataFixUtils.orElse($$0.I_().d(ke.F).d(this.h), this));
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      int $$4 = Math.min(7, $$3.c(c) + aup.a($$0.z, 2, 5));
      djp $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }
}
