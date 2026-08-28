import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dbz(alf<eze> b, long c) implements dcd {
   private static final wy d = wy.c("item.container.loot_table.unknown");
   public static final Codec<dbz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alf.a(mg.bp).fieldOf("loot_table").forGetter(dbz::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dbz::b)).apply($$0, dbz::new)
   );

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      $$1.accept(d);
   }

   public alf<eze> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
