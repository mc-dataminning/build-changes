import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dns extends dej {
   public static final MapCodec<dns> a = b(dns::new);
   public static final dtd<drn> b = dsq.bz;
   public static final dsu c = dit.aE;
   public static final dsr d = dsq.bA;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(b, drn.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$0.e() || $$1.c(b) != drn.b) {
         return bqu.d;
      } else if ($$2 instanceof are $$7) {
         if ($$7.c_($$3) instanceof dri $$9) {
            dri.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqu.a;
         } else {
            return bqu.d;
         }
      } else {
         return bqu.b;
      }
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dri($$0, $$1);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$0 instanceof are $$3
         ? a($$2, dph.R, ($$1x, $$2x, $$3x, $$4) -> dri.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dph.R, ($$0x, $$1x, $$2x, $$3x) -> dri.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dsa a(dsa $$0, dlk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dld a_(dsa $$0) {
      return dld.c;
   }
}
