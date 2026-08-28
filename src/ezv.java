import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezv(ddh b) implements ezx {
   public static final MapCodec<ezv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddh.b.fieldOf("amount").forGetter(ezv::c)).apply($$0, ezv::new));

   @Override
   public float b(evs $$0) {
      int $$1 = $$0.b(eym.k);
      return this.b.a($$1);
   }

   @Override
   public ezw b() {
      return ezy.g;
   }

   public static ezv a(ddh $$0) {
      return new ezv($$0);
   }

   public ddh c() {
      return this.b;
   }
}
