import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ded(ddx d) implements deh {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddx.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, ded::new));

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      cxg $$5 = $$2.a();
      if ($$5.b(ku.d) && $$5.b(ku.e)) {
         ary $$7 = $$2.c() instanceof ary $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ddx b() {
      return this.d;
   }
}
