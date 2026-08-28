import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgf extends dht {
   public static final MapCodec<dgf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axr.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgf::new)
   );
   private final axr b;

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   public dgf(axr $$0, drz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dsa $$0, dbc $$1, iz $$2) {
      return this.b.a();
   }
}
