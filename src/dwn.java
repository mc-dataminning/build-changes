import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwn extends dmo {
   public static final MapCodec<dwn> a = b(dwn::new);
   public static final ech<eaq> b = ebu.bC;
   public static final ecc<jb> c = drd.e;
   public static final ebv d = ebu.bE;

   @Override
   public MapCodec<dwn> a() {
      return a;
   }

   public dwn(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jb.c).b(b, eaq.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if (!$$0.f() && $$1.c(b) == eaq.b) {
         if ($$2 instanceof ars $$7) {
            if (!($$7.c_($$3) instanceof eal $$8)) {
               return bur.f;
            }

            eal.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return bur.b;
      } else {
         return bur.f;
      }
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new eal($$0, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0 instanceof ars $$3
         ? a($$2, dye.S, ($$1x, $$2x, $$3x, $$4) -> eal.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, dye.S, ($$0x, $$1x, $$2x, $$3x) -> eal.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public ebe a(ebe $$0, dtw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
