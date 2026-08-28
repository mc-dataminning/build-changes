import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgq extends dei {
   public static final MapCodec<dgq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgp.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgq::new));
   private final dfa c;

   @Override
   public MapCodec<dgq> a() {
      return b;
   }

   protected dgq(dfa $$0, dsc.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      this.a($$0, (dca)$$1, $$2);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dfc.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, enx.c, enx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
