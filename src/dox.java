import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dox extends dis implements dim {
   public static final MapCodec<dox> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvd.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dox::new)
   );
   public static final dwn f = dwe.aU;
   protected static final float g = 6.0F;
   protected static final fal h = dij.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dvd i;

   @Override
   public MapCodec<? extends dox> a() {
      return e;
   }

   protected dox(dvd $$0, dvn.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return h;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arq $$0, jh $$1, dvo $$2, azv $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return true;
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(f);
   }
}
