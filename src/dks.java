import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dks extends dbk {
   public static final MapCodec<dks> a = b(dks::new);
   public static final dqc<dom> b = dpp.bz;
   public static final dpt c = dft.aE;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ih.c).a(b, dom.a));
   }

   @Override
   public boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$0.d() || $$1.c(b) != dom.b) {
         return boc.d;
      } else if ($$2 instanceof aps $$7) {
         if ($$7.c_($$3) instanceof doh $$9) {
            doh.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return boc.a;
         } else {
            return boc.d;
         }
      } else {
         return boc.b;
      }
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new doh($$0, $$1);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0 instanceof aps $$3
         ? a($$2, dmh.R, ($$1x, $$2x, $$3x, $$4) -> doh.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dmh.R, ($$0x, $$1x, $$2x, $$3x) -> doh.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(c, $$0.g().g());
   }

   @Override
   public doz a(doz $$0, dik $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public did b_(doz $$0) {
      return did.c;
   }
}
