import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhz extends cyr {
   public static final MapCodec<dhz> a = b(dhz::new);
   public static final dnh<dlr> b = dmu.bz;
   public static final dmy c = dda.aE;

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   public dhz(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ih.c).a(b, dlr.a));
   }

   @Override
   public bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$0.b() || $$1.c(b) != dlr.b) {
         return bmn.d;
      } else if ($$2 instanceof apa $$7) {
         if ($$7.c_($$3) instanceof dlm $$9) {
            dlm.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bmn.a;
         } else {
            return bmn.d;
         }
      } else {
         return bmn.b;
      }
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new dlm($$0, $$1);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0 instanceof apa $$3
         ? a($$2, djn.R, ($$1x, $$2x, $$3x, $$4) -> dlm.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, djn.R, ($$0x, $$1x, $$2x, $$3x) -> dlm.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dme a(dme $$0, dfr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dfk b_(dme $$0) {
      return dfk.c;
   }
}
