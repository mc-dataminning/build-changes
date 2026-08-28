import com.google.common.collect.ImmutableMap;

public class cbn<T extends bxe> extends byt<T> {
   private final float c;

   public cbn(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static <T extends bxe> boolean a(T $$0) {
      return $$0.bj() && $$0.b(axh.a) > $$0.dp() || $$0.bw();
   }

   protected boolean a(arq $$0, bxe $$1) {
      return a($$1);
   }

   protected boolean a(arq $$0, bxe $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, bxe $$1, long $$2) {
      if ($$1.dY().i() < this.c) {
         $$1.N().a();
      }
   }
}
