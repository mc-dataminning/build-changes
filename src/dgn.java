import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgn extends def {
   public static final MapCodec<dgn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgm.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgn::new));
   private final dex c;

   @Override
   public MapCodec<dgn> a() {
      return b;
   }

   protected dgn(dex $$0, drz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      this.a($$0, (dbx)$$1, $$2);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
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
}
