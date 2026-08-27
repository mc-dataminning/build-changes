import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhu extends dbm {
   public static final MapCodec<dhu> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpo.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dhu::new)
   );
   public static final dpq f = dpp.w;

   @Override
   public MapCodec<dhu> a() {
      return e;
   }

   protected dhu(dpo $$0, doy.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(doz $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected doz a(doz $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cyx $$0, ib $$1) {
      Class<? extends bpv> $$2 = switch (this.d.f()) {
         case a -> bpv.class;
         case b -> bqo.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f);
   }
}
