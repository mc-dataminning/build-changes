import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcn extends ctt {
   public static final MapCodec<dcn> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(chz.q.fieldOf("color").forGetter(dcn::b), t()).apply($$0, dcn::new));
   private final chz d;

   @Override
   public MapCodec<dcn> a() {
      return c;
   }

   protected dcn(chz $$0, dfc.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public chz b() {
      return this.d;
   }
}
