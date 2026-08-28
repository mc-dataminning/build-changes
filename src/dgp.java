import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgp extends dei {
   public static final MapCodec<dgp> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgm.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dgp::new));
   private final dex f;

   @Override
   public MapCodec<dgp> a() {
      return e;
   }

   protected dgp(dex $$0, drz.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      this.a($$0, (dbx)$$1, $$2);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dez.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, enu.c, enu.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
