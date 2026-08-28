import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dee(ddy d) implements dei {
   public static final MapCodec<dee> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddy.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dee::new));

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      cxk $$5 = $$2.a();
      if ($$5.b(ku.d) && $$5.b(ku.e)) {
         asi $$7 = $$2.c() instanceof asi $$6 ? $$6 : null;
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
