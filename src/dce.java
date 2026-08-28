import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dce(alf<ezm> b, long c) implements dci {
   private static final wy d = wy.c("item.container.loot_table.unknown");
   public static final Codec<dce> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alf.a(mg.bq).fieldOf("loot_table").forGetter(dce::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dce::b)).apply($$0, dce::new)
   );

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      $$1.accept(d);
   }

   public alf<ezm> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
