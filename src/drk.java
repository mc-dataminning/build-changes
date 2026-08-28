import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drk extends dse implements dje {
   public static final MapCodec<drk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvn.q.fieldOf("color").forGetter(drk::b), t()).apply($$0, drk::new));
   private final cvn c;

   @Override
   public MapCodec<drk> a() {
      return a;
   }

   public drk(cvn $$0, dwx.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cvn b() {
      return this.c;
   }
}
