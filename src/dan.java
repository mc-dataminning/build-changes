import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dan extends dcb {
   public static final MapCodec<dan> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(avg.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dan::new)
   );
   private final avg b;

   @Override
   public MapCodec<dan> a() {
      return a;
   }

   public dan(avg $$0, dmd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dme $$0, cvk $$1, ib $$2) {
      return this.b.a();
   }
}
