import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgs extends del {
   public static final MapCodec<dgs> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgp.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dgs::new));
   private final dfa f;

   @Override
   public MapCodec<dgs> a() {
      return e;
   }

   protected dgs(dfa $$0, dsc.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      this.a($$0, (dca)$$1, $$2);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dfc.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, enx.c, enx.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
