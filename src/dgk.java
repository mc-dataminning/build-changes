import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgk extends dib {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axg.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgk::new)
   );
   private final axg b;

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dgk(axg $$0, dtb.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dtc $$0, dbg $$1, ir $$2) {
      return this.b.a();
   }
}
