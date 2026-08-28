import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnv extends dgh implements dgb {
   public static final MapCodec<dnv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akq.a(lu.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akq.a(lu.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akq.a(lu.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dnv::new)
   );
   public static final int b = 7;
   public static final duc c = dts.av;
   protected static final float d = 1.0F;
   protected static final exv[] e = new exv[]{
      dfy.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dfy.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dfy.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dfy.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dfy.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dfy.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dfy.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dfy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akq<dfy> f;
   private final akq<dfy> g;
   private final akq<cul> h;

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   protected dnv(akq<dfy> $$0, akq<dfy> $$1, akq<cul> $$2, dtb.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.a(dga.cC);
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dht.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ji $$6 = ji.c.a.a($$3);
               jd $$7 = $$2.a($$6);
               dtc $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).i() && ($$8.a(dga.cC) || $$8.a(awe.ag))) {
                  jz<dfy> $$9 = $$1.H_().d(lu.f);
                  Optional<dfy> $$10 = $$9.e(this.f);
                  Optional<dfy> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(dju.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq((dcv)DataFixUtils.orElse($$0.H_().d(lu.K).e(this.h), this));
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayo.a($$0.z, 2, 5));
      dtc $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }
}
