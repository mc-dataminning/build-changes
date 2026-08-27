import com.google.common.collect.ImmutableMap;

public class bqg extends bnm<blx> {
   private final float c;

   public bqg(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(amp $$0, blx $$1) {
      return $$1.aZ() && $$1.b(arw.a) > $$1.df() || $$1.bn();
   }

   protected boolean a(amp $$0, blx $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(amp $$0, blx $$1, long $$2) {
      if ($$1.eg().i() < this.c) {
         $$1.M().a();
      }
   }
}
