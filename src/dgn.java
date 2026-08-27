import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgn extends daj implements dad {
   public static final MapCodec<dgn> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmo.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dgn::new)
   );
   public static final dnz f = dnp.aU;
   protected static final float g = 6.0F;
   protected static final eqk h = daa.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dmo i;

   @Override
   public MapCodec<? extends dgn> a() {
      return e;
   }

   protected dgn(dmo $$0, dmy.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return h;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(apf $$0, ib $$1, dmz $$2, axd $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return true;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(f);
   }
}
