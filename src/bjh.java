import com.google.common.collect.ImmutableMap;

public class bjh extends bhr<bgb> {
   private final bdc c;
   private final float d;
   private final float e;
   private final float f;

   public bjh(bdc $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bpb.n, bpc.b, bpb.P, bpc.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aif $$0, bgb $$1, long $$2) {
      apf $$3 = $$1.ec();
      float $$4 = apa.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = apa.g($$1.dy() + 2.0F * $$3.i() * this.d - this.d);
      eei $$6 = eei.a($$4, $$5);
      $$1.dK().a(bpb.n, new bhu($$1.bm().e($$6)));
      $$1.dK().a(bpb.P, this.c.a($$3));
   }
}
