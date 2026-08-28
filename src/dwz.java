import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwz extends dna {
   public static final MapCodec<dwz> a = b(dwz::new);
   public static final ect<ebc> b = ecg.bC;
   public static final eco<jc> c = drp.e;
   public static final ech d = ecg.bE;

   @Override
   public MapCodec<dwz> a() {
      return a;
   }

   public dwz(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jc.c).b(b, ebc.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if (!$$0.f() && $$1.c(b) == ebc.b) {
         if ($$2 instanceof asb $$7) {
            if (!($$7.c_($$3) instanceof eax $$8)) {
               return bvc.f;
            }

            eax.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return bvc.b;
      } else {
         return bvc.f;
      }
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eax($$0, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0 instanceof asb $$3
         ? a($$2, dyq.S, ($$1x, $$2x, $$3x, $$4) -> eax.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, dyq.S, ($$0x, $$1x, $$2x, $$3x) -> eax.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public ebq a(ebq $$0, dui $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
