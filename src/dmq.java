import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmq extends dfd implements dex {
   public static final MapCodec<dmq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ala.a(lq.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ala.a(lq.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ala.a(lq.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dmq::new)
   );
   public static final int b = 7;
   public static final dsx c = dsn.av;
   protected static final float d = 1.0F;
   protected static final ewf[] e = new ewf[]{
      deu.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      deu.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      deu.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      deu.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      deu.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      deu.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      deu.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      deu.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ala<deu> f;
   private final ala<deu> g;
   private final ala<cuf> h;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   protected dmq(ala<deu> $$0, ala<deu> $$1, ala<cuf> $$2, drw.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(dew.cC);
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dgp.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               je $$6 = je.c.a.a($$3);
               iz $$7 = $$2.a($$6);
               drx $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dew.cC) || $$8.a(awl.af))) {
                  jv<deu> $$9 = $$1.H_().d(lq.f);
                  Optional<deu> $$10 = $$9.e(this.f);
                  Optional<deu> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().n());
                     $$1.b($$2, $$11.get().n().a(diq.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk((dbs)DataFixUtils.orElse($$0.H_().d(lq.G).e(this.h), this));
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayu.a($$0.z, 2, 5));
      drx $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }
}
