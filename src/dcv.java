import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dcv extends cvj implements cvd {
   public static final MapCodec<dcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               agh.a(jz.e).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               agh.a(jz.e).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               agh.a(jz.E).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dcv::new)
   );
   public static final int b = 7;
   public static final dii c = dhy.av;
   protected static final float d = 1.0F;
   protected static final ekn[] e = new ekn[]{
      cva.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cva.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cva.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cva.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cva.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cva.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cva.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cva.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final agh<cva> f;
   private final agh<cva> g;
   private final agh<cle> h;

   @Override
   public MapCodec<dcv> a() {
      return a;
   }

   protected dcv(agh<cva> $$0, agh<cva> $$1, agh<cle> $$2, dhh.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(cvc.cC);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cwv.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               hx $$6 = hx.c.a.a($$3);
               ht $$7 = $$2.a($$6);
               dhi $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cvc.cC) || $$8.a(arg.af))) {
                  io<cva> $$9 = $$1.H_().d(jz.e);
                  Optional<cva> $$10 = $$9.d(this.f);
                  Optional<cva> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(cyv.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj((crz)DataFixUtils.orElse($$0.H_().d(jz.E).d(this.h), this));
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      int $$4 = Math.min(7, $$3.c(c) + atm.a($$0.z, 2, 5));
      dhi $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }
}
