import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfs(dfm d) implements dfw {
   public static final MapCodec<dfs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfm.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dfs::new));

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      cys $$5 = $$2.a();
      if ($$5.c(kj.d) && $$5.c(kj.e)) {
         arp $$7 = $$2.c() instanceof arp $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   public dfm b() {
      return this.d;
   }
}
