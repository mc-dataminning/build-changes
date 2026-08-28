import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dee(ddy d) implements dei {
   public static final MapCodec<dee> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddy.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dee::new));

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      cxh $$5 = $$2.a();
      if ($$5.b(kv.d) && $$5.b(kv.e)) {
         are $$7 = $$2.c() instanceof are $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public ddy b() {
      return this.d;
   }
}
