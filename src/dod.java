import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends deu {
   public static final MapCodec<dod> a = b(dod::new);
   public static final dto<dry> b = dtb.bz;
   public static final dtf c = dje.aE;
   public static final dtc d = dtb.bA;

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   public dod(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, jf.c).a(b, dry.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$0.e() || $$1.c(b) != dry.b) {
         return bqj.d;
      } else if ($$2 instanceof aqm $$7) {
         if ($$7.c_($$3) instanceof drt $$9) {
            drt.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqj.a;
         } else {
            return bqj.d;
         }
      } else {
         return bqj.b;
      }
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new drt($$0, $$1);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$0 instanceof aqm $$3
         ? a($$2, dps.R, ($$1x, $$2x, $$3x, $$4) -> drt.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dps.R, ($$0x, $$1x, $$2x, $$3x) -> drt.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dsl a(dsl $$0, dlv $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dlo a_(dsl $$0) {
      return dlo.c;
   }
}
