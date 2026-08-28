import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drk extends dno implements duz {
   public static final MapCodec<drk> a = b(drk::new);
   private static final ech b = ecg.I;
   private static final fgw c = dno.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<drk> a() {
      return a;
   }

   protected drk(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(b) ? eyb.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = super.a($$0);
      if ($$1 != null) {
         eya $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == eyb.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.d();
      ebq $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jc.a);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == jc.b && !this.a($$0, $$1, $$3)) {
         return dnq.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, eyb.c, eyb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
