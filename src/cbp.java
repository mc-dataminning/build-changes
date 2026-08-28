import com.google.common.collect.ImmutableMap;

public class cbp<T extends bxg> extends byv<T> {
   private final float c;

   public cbp(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static <T extends bxg> boolean a(T $$0) {
      return $$0.bj() && $$0.b(axh.a) > $$0.dp() || $$0.bw();
   }

   protected boolean a(arq $$0, bxg $$1) {
      return a($$1);
   }

   protected boolean a(arq $$0, bxg $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, bxg $$1, long $$2) {
      if ($$1.dY().i() < this.c) {
         $$1.N().a();
      }
   }
}
