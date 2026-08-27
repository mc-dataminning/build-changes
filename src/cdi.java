import javax.annotation.Nullable;

public class cdi {
   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2, int $$3, euk $$4, double $$5) {
      euk $$6 = $$4.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$7 = cdk.a($$0, $$1);
      return cdn.a($$0, () -> {
         io $$7x = cdh.a($$0, $$1, $$2, $$3, $$6.c, $$6.e, $$5, $$7);
         return $$7x != null && !cdk.a($$0, $$7x) ? $$7x : null;
      });
   }
}
