import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drj extends dsd implements djd {
   public static final MapCodec<drj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvm.q.fieldOf("color").forGetter(drj::b), t()).apply($$0, drj::new));
   private final cvm c;

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   public drj(cvm $$0, dww.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cvm b() {
      return this.c;
   }
}
