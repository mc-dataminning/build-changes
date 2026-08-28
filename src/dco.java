import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dco(alf<ezy> b, long c) implements dcs {
   private static final wy d = wy.c("item.container.loot_table.unknown");
   public static final Codec<dco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ezy.a.fieldOf("loot_table").forGetter(dco::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dco::b)).apply($$0, dco::new)
   );

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      $$1.accept(d);
   }

   public alf<ezy> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
