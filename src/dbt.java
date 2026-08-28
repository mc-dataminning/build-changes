import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dbt(ald<eys> b, long c) implements dbx {
   private static final ww d = ww.c("item.container.loot_table.unknown");
   public static final Codec<dbt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a(mg.bo).fieldOf("loot_table").forGetter(dbt::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dbt::b)).apply($$0, dbt::new)
   );

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      $$1.accept(d);
   }

   public ald<eys> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
