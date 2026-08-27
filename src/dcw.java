import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcw extends ddq implements cuw {
   public static final MapCodec<dcw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckc.q.fieldOf("color").forGetter(dcw::b), u()).apply($$0, dcw::new));
   private final ckc c;

   @Override
   public MapCodec<dcw> a() {
      return a;
   }

   public dcw(ckc $$0, dhm.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public ckc b() {
      return this.c;
   }
}
