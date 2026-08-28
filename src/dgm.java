import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgm extends dki {
   public static final MapCodec<dgm> a = b(dgm::new);
   public static final dvm b = dli.aF;
   private static final ezq c = dhm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ezq d = dhm.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ezq e = dhm.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ezq f = dhm.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ezq g = dhm.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ezq h = dhm.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ezq i = dhm.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ezq j = ezn.a(c, d, e, f);
   private static final ezq k = ezn.a(c, g, h, i);
   private static final xe l = xe.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c));
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, $$0.g().h());
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awq.aC);
      }

      return brs.a;
   }

   @Nullable
   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      return new bsa(($$2x, $$3, $$4) -> new crc($$2x, $$3, crm.a($$1, $$2)), l);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      jk $$4 = $$0.c(b);
      return $$4.o() == jk.a.a ? j : k;
   }

   @Override
   protected void a(ckg $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, dus $$3, ckg $$4) {
      if (!$$4.ba()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dej $$0, jf $$1, ckg $$2) {
      if (!$$2.ba()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bsj a(btr $$0) {
      return $$0.dT().b($$0);
   }

   @Nullable
   public static dus e(dus $$0) {
      if ($$0.a(dho.gS)) {
         return dho.gT.n().b(b, $$0.c(b));
      } else {
         return $$0.a(dho.gT) ? dho.gU.n().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   public int b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
