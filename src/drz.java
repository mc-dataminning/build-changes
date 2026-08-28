import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drz extends div {
   public static final MapCodec<drz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuy.q.fieldOf("color").forGetter(drz::b), t()).apply($$0, drz::new));
   private final cuy d;

   @Override
   public MapCodec<drz> a() {
      return c;
   }

   protected drz(cuy $$0, dvi.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cuy b() {
      return this.d;
   }
}
