import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfy(dfs d) implements dgc {
   public static final MapCodec<dfy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfs.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dfy::new));

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      cyy $$5 = $$2.a();
      if ($$5.c(kj.d) && $$5.c(kj.e)) {
         arr $$7 = $$2.c() instanceof arr $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   public dfs b() {
      return this.d;
   }
}
