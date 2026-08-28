import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record ddl(alq<fay> b, long c) implements ddp {
   private static final xg d = xg.c("item.container.loot_table.unknown");
   public static final Codec<ddl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(fay.a.fieldOf("loot_table").forGetter(ddl::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(ddl::b)).apply($$0, ddl::new)
   );

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      $$1.accept(d);
   }

   public alq<fay> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
