import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dil extends dch implements dcb {
   public static final MapCodec<dil> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doo.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dil::new)
   );
   public static final dpz f = dpp.aU;
   protected static final float g = 6.0F;
   protected static final est h = dby.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final doo i;

   @Override
   public MapCodec<? extends dil> a() {
      return e;
   }

   protected dil(doo $$0, doy.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return h;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aps $$0, ib $$1, doz $$2, axr $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return true;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f);
   }
}
