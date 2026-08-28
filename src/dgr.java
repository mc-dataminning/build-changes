import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgr extends dek {
   public static final MapCodec<dgr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgp.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dgr::new));
   private final dfa e;
   protected static final float b = 6.0F;
   protected static final ewl c = dfa.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   protected dgr(dfa $$0, dsc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      this.a($$0, (dca)$$1, $$2);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
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

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }
}
