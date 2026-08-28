import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgo extends deh {
   public static final MapCodec<dgo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgm.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dgo::new));
   private final dex e;
   protected static final float b = 6.0F;
   protected static final ewi c = dex.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   protected dgo(dex $$0, drz.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      this.a($$0, (dbx)$$1, $$2);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dez.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, enu.c, enu.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }
}
