import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgp extends deh {
   public static final MapCodec<dgp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgo.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgp::new));
   private final dez c;

   @Override
   public MapCodec<dgp> a() {
      return b;
   }

   protected dgp(dez $$0, dsb.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      this.a($$0, (dbz)$$1, $$2);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dfb.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, enw.c, enw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
