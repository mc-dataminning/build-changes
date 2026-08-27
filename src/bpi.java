import com.google.common.collect.ImmutableMap;

public class bpi extends bmp<bla> {
   private final float c;

   public bpi(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(ama $$0, bla $$1) {
      return $$1.aX() && $$1.b(arh.a) > $$1.de() || $$1.bl();
   }

   protected boolean a(ama $$0, bla $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ama $$0, bla $$1, long $$2) {
      if ($$1.ef().i() < this.c) {
         $$1.K().a();
      }
   }
}
