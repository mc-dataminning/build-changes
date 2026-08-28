import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dcz(alh<fam> b, long c) implements ddd {
   private static final xa d = xa.c("item.container.loot_table.unknown");
   public static final Codec<dcz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(fam.a.fieldOf("loot_table").forGetter(dcz::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dcz::b)).apply($$0, dcz::new)
   );

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      $$1.accept(d);
   }

   public alh<fam> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
