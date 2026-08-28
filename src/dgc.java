import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgc extends dhq {
   public static final MapCodec<dgc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axo.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgc::new)
   );
   private final axo b;

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   public dgc(axo $$0, drw.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(drx $$0, daz $$1, iz $$2) {
      return this.b.a();
   }
}
