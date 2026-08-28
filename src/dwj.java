import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwj extends dms {
   public static final MapCodec<dwj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxw.q.fieldOf("color").forGetter(dwj::b), t()).apply($$0, dwj::new));
   private final cxw c;

   @Override
   public MapCodec<dwj> a() {
      return b;
   }

   protected dwj(cxw $$0, dzy.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public cxw b() {
      return this.c;
   }
}
