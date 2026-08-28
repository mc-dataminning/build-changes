import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drh extends dsb implements djb {
   public static final MapCodec<drh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvk.q.fieldOf("color").forGetter(drh::b), t()).apply($$0, drh::new));
   private final cvk c;

   @Override
   public MapCodec<drh> a() {
      return a;
   }

   public drh(cvk $$0, dwu.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cvk b() {
      return this.c;
   }
}
