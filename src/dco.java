import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dco extends cvc implements cuw {
   public static final MapCodec<dco> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               agf.a(jz.e).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               agf.a(jz.e).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               agf.a(jz.E).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dco::new)
   );
   public static final int b = 7;
   public static final dhw c = dhm.av;
   protected static final float d = 1.0F;
   protected static final ekb[] e = new ekb[]{
      cut.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cut.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cut.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cut.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cut.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cut.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cut.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cut.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final agf<cut> f;
   private final agf<cut> g;
   private final agf<ckw> h;

   @Override
   public MapCodec<dco> a() {
      return a;
   }

   protected dco(agf<cut> $$0, agf<cut> $$1, agf<ckw> $$2, dgv.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(cuv.cC);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cwn.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               hx $$6 = hx.c.a.a($$3);
               ht $$7 = $$2.a($$6);
               dgw $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cuv.cC) || $$8.a(arc.af))) {
                  io<cut> $$9 = $$1.H_().d(jz.e);
                  Optional<cut> $$10 = $$9.d(this.f);
                  Optional<cut> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(cyo.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb((crr)DataFixUtils.orElse($$0.H_().d(jz.E).d(this.h), this));
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ati.a($$0.z, 2, 5));
      dgw $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }
}
