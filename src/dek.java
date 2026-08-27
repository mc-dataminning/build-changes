import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dek extends cwy implements cws {
   public static final MapCodec<dek> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ahf.a(ke.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ahf.a(ke.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ahf.a(ke.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dek::new)
   );
   public static final int b = 7;
   public static final dkg c = djw.av;
   protected static final float d = 1.0F;
   protected static final eml[] e = new eml[]{
      cwp.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cwp.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cwp.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cwp.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cwp.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cwp.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cwp.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cwp.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ahf<cwp> f;
   private final ahf<cwp> g;
   private final ahf<cms> h;

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   protected dek(ahf<cwp> $$0, ahf<cwp> $$1, ahf<cms> $$2, djf.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(cwr.cC);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cyk.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ic $$6 = ic.c.a.a($$3);
               hx $$7 = $$2.a($$6);
               djg $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cwr.cC) || $$8.a(asg.af))) {
                  it<cwp> $$9 = $$1.I_().d(ke.f);
                  Optional<cwp> $$10 = $$9.d(this.f);
                  Optional<cwp> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(dak.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx((ctn)DataFixUtils.orElse($$0.I_().d(ke.F).d(this.h), this));
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      int $$4 = Math.min(7, $$3.c(c) + aun.a($$0.z, 2, 5));
      djg $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }
}
