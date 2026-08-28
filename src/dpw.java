import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpw extends dqq implements dhv {
   public static final MapCodec<dpw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuy.q.fieldOf("color").forGetter(dpw::b), t()).apply($$0, dpw::new));
   private final cuy c;

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   public dpw(cuy $$0, dvi.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cuy b() {
      return this.c;
   }
}
