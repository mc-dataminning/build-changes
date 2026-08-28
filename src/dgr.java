import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgr extends dej {
   public static final MapCodec<dgr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgq.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgr::new));
   private final dfb c;

   @Override
   public MapCodec<dgr> a() {
      return b;
   }

   protected dgr(dfb $$0, dsd.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      this.a($$0, (dcb)$$1, $$2);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dfd.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eny.c, eny.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
