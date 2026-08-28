import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record ddb(alj<fao> b, long c) implements ddf {
   private static final xc d = xc.c("item.container.loot_table.unknown");
   public static final Codec<ddb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(fao.a.fieldOf("loot_table").forGetter(ddb::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(ddb::b)).apply($$0, ddb::new)
   );

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      $$1.accept(d);
   }

   public alj<fao> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
