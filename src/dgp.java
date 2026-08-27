import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgp extends dal implements daf {
   public static final MapCodec<dgp> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmq.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dgp::new)
   );
   public static final dob f = dnr.aU;
   protected static final float g = 6.0F;
   protected static final eqm h = dac.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dmq i;

   @Override
   public MapCodec<? extends dgp> a() {
      return e;
   }

   protected dgp(dmq $$0, dna.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return h;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(apf $$0, ib $$1, dnb $$2, axd $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return true;
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(f);
   }
}
