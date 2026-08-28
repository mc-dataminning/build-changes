import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dcl(alf<ezt> b, long c) implements dcp {
   private static final wy d = wy.c("item.container.loot_table.unknown");
   public static final Codec<dcl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ezt.a.fieldOf("loot_table").forGetter(dcl::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dcl::b)).apply($$0, dcl::new)
   );

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      $$1.accept(d);
   }

   public alf<ezt> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
