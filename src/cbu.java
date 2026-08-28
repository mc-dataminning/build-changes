import com.google.common.collect.ImmutableMap;

public class cbu<T extends bxl> extends bza<T> {
   private final float c;

   public cbu(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static <T extends bxl> boolean a(T $$0) {
      return $$0.bh() && $$0.b(axh.a) > $$0.do() || $$0.bu();
   }

   protected boolean a(arq $$0, bxl $$1) {
      return a($$1);
   }

   protected boolean a(arq $$0, bxl $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, bxl $$1, long $$2) {
      if ($$1.dX().i() < this.c) {
         $$1.N().a();
      }
   }
}
