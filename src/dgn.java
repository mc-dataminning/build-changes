import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgn extends dib {
   public static final MapCodec<dgn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awx.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgn::new)
   );
   private final awx b;

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public dgn(awx $$0, dsg.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dsh $$0, dbj $$1, ja $$2) {
      return this.b.a();
   }
}
