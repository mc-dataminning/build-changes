import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlw extends dfr implements dfl {
   public static final MapCodec<dlw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsa.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dlw::new)
   );
   public static final dtl f = dtb.aU;
   protected static final float g = 6.0F;
   protected static final exa h = dfi.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dsa i;

   @Override
   public MapCodec<? extends dlw> a() {
      return e;
   }

   protected dlw(dsa $$0, dsk.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return h;
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aqm $$0, ja $$1, dsl $$2, ayo $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return true;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(f);
   }
}
