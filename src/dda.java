import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dda extends cvo implements cvi {
   public static final MapCodec<dda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               agl.a(kd.e).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               agl.a(kd.e).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               agl.a(kd.E).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dda::new)
   );
   public static final int b = 7;
   public static final din c = did.av;
   protected static final float d = 1.0F;
   protected static final eks[] e = new eks[]{
      cvf.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cvf.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cvf.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cvf.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cvf.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cvf.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cvf.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cvf.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final agl<cvf> f;
   private final agl<cvf> g;
   private final agl<clj> h;

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   protected dda(agl<cvf> $$0, agl<cvf> $$1, agl<clj> $$2, dhm.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(cvh.cC);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cxa.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ib $$6 = ib.c.a.a($$3);
               hx $$7 = $$2.a($$6);
               dhn $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cvh.cC) || $$8.a(ark.af))) {
                  is<cvf> $$9 = $$1.I_().d(kd.e);
                  Optional<cvf> $$10 = $$9.d(this.f);
                  Optional<cvf> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(cza.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo((cse)DataFixUtils.orElse($$0.I_().d(kd.E).d(this.h), this));
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      int $$4 = Math.min(7, $$3.c(c) + atq.a($$0.z, 2, 5));
      dhn $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }
}
