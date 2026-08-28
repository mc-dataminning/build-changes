import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends dek {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final dte<dro> b = dsr.bz;
   public static final dsv c = diu.aE;
   public static final dss d = dsr.bA;

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(b, dro.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$0.e() || $$1.c(b) != dro.b) {
         return bqv.d;
      } else if ($$2 instanceof are $$7) {
         if ($$7.c_($$3) instanceof drj $$9) {
            drj.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqv.a;
         } else {
            return bqv.d;
         }
      } else {
         return bqv.b;
      }
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new drj($$0, $$1);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0 instanceof are $$3
         ? a($$2, dpi.R, ($$1x, $$2x, $$3x, $$4) -> drj.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dpi.R, ($$0x, $$1x, $$2x, $$3x) -> drj.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dsb a(dsb $$0, dll $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dle a_(dsb $$0) {
      return dle.c;
   }
}
