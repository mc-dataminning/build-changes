import com.google.common.collect.ImmutableMap;

public class byo extends bwx<bvg> {
   private final brm c;
   private final float d;
   private final float e;
   private final float f;

   public byo(brm $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cei.n, cej.b, cei.Q, cej.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arq $$0, bvg $$1, long $$2) {
      azv $$3 = $$1.eb();
      float $$4 = azn.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azn.h($$1.dO() + 2.0F * $$3.i() * this.d - this.d);
      ezr $$6 = ezr.a($$4, $$5);
      $$1.ee().a(cei.n, new bxa($$1.bH().e($$6)));
      $$1.ee().a(cei.Q, this.c.a($$3));
   }
}
