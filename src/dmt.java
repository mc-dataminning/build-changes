import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmt extends dfg implements dfa {
   public static final MapCodec<dmt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ald.a(lq.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ald.a(lq.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ald.a(lq.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dmt::new)
   );
   public static final int b = 7;
   public static final dta c = dsq.av;
   protected static final float d = 1.0F;
   protected static final ewi[] e = new ewi[]{
      dex.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dex.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dex.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dex.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dex.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dex.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dex.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dex.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ald<dex> f;
   private final ald<dex> g;
   private final ald<cui> h;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(ald<dex> $$0, ald<dex> $$1, ald<cui> $$2, drz.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.a(dez.cC);
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dgs.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               je $$6 = je.c.a.a($$3);
               iz $$7 = $$2.a($$6);
               dsa $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dez.cC) || $$8.a(awo.af))) {
                  jv<dex> $$9 = $$1.H_().d(lq.f);
                  Optional<dex> $$10 = $$9.e(this.f);
                  Optional<dex> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(dit.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun((dbv)DataFixUtils.orElse($$0.H_().d(lq.G).e(this.h), this));
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayx.a($$0.z, 2, 5));
      dsa $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }
}
