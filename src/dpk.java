import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpk extends dhm {
   public static final MapCodec<dpk> a = b(dpk::new);
   private static final xe d = xe.c("container.stonecutter");
   public static final dvm b = dli.aF;
   protected static final ezq c = dhm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   public dpk(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c));
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, $$0.g().g());
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awq.ay);
      }

      return brs.a;
   }

   @Nullable
   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      return new bsa(($$2x, $$3, $$4) -> new ctc($$2x, $$3, crm.a($$1, $$2)), d);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
