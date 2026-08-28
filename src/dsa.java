import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsa extends dno implements duz {
   public static final MapCodec<dsa> a = b(dsa::new);
   public static final ech b = ecg.m;
   public static final ech c = ecg.I;
   private static final fgw d = fgt.a(dno.b(4.0, 7.0, 9.0), dno.b(6.0, 0.0, 7.0));
   private static final fgw e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   public dsa(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());

      for (jc $$2 : $$0.f()) {
         if ($$2.o() == jc.a.b) {
            ebq $$3 = this.m().b(b, Boolean.valueOf($$2 == jc.b));
            if ($$3.a((dkm)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == eyb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      jc $$3 = o($$0).g();
      return dno.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jc o(ebq $$0) {
      return $$0.c(b) ? jc.a : jc.b;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(c) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
