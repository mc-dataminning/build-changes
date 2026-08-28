import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlt extends dfo implements dfi {
   public static final MapCodec<dlt> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drw.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dlt::new)
   );
   public static final dth f = dsx.aU;
   protected static final float g = 6.0F;
   protected static final ews h = dff.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final drw i;

   @Override
   public MapCodec<? extends dlt> a() {
      return e;
   }

   protected dlt(drw $$0, dsg.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return h;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aqk $$0, ja $$1, dsh $$2, aym $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return true;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(f);
   }
}
