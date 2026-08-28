import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlv extends dfq implements dfk {
   public static final MapCodec<dlv> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drz.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dlv::new)
   );
   public static final dtk f = dta.aU;
   protected static final float g = 6.0F;
   protected static final ewy h = dfh.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final drz i;

   @Override
   public MapCodec<? extends dlv> a() {
      return e;
   }

   protected dlv(drz $$0, dsj.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return h;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aqm $$0, ja $$1, dsk $$2, ayo $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return true;
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(f);
   }
}
