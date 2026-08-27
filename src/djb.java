import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djb extends dcs {
   public static final MapCodec<djb> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, djb::new)
   );
   public static final dqy f = dqx.w;

   @Override
   public MapCodec<djb> a() {
      return e;
   }

   protected djb(dqw $$0, dqg.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dqh $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dqh a(dqh $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dad $$0, in $$1) {
      Class<? extends brh> $$2 = switch (this.d.f()) {
         case a -> brh.class;
         case b -> bsa.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f);
   }
}
