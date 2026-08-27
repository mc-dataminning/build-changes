import com.google.common.collect.ImmutableMap;

public class bqw extends boc<bmn> {
   private final float c;

   public bqw(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(and $$0, bmn $$1) {
      return $$1.aZ() && $$1.b(asm.a) > $$1.df() || $$1.bn();
   }

   protected boolean a(and $$0, bmn $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(and $$0, bmn $$1, long $$2) {
      if ($$1.eg().i() < this.c) {
         $$1.M().a();
      }
   }
}
