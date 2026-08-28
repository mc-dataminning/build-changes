import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmv extends dfi implements dfc {
   public static final MapCodec<dmv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a(lq.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ale.a(lq.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ale.a(lq.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dmv::new)
   );
   public static final int b = 7;
   public static final dtc c = dss.av;
   protected static final float d = 1.0F;
   protected static final ewk[] e = new ewk[]{
      dez.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dez.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dez.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dez.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dez.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dez.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dez.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dez.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ale<dez> f;
   private final ale<dez> g;
   private final ale<cuk> h;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   protected dmv(ale<dez> $$0, ale<dez> $$1, ale<cuk> $$2, dsb.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(dfb.cC);
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dgu.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               je $$6 = je.c.a.a($$3);
               iz $$7 = $$2.a($$6);
               dsc $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dfb.cC) || $$8.a(awp.af))) {
                  jv<dez> $$9 = $$1.H_().d(lq.f);
                  Optional<dez> $$10 = $$9.e(this.f);
                  Optional<dez> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(div.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup((dbx)DataFixUtils.orElse($$0.H_().d(lq.G).e(this.h), this));
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayz.a($$0.z, 2, 5));
      dsc $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }
}
