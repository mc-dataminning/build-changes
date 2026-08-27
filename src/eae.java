import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eae extends eal {
   public static final Codec<eae> a = RecordCodecBuilder.create($$0 -> $$0.group(dqo.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eae::new));
   private final dqo.a c;

   private eae(dqo.a $$0) {
      this.c = $$0;
   }

   public static eae a(dqo.a $$0) {
      return new eae($$0);
   }

   @Override
   public Stream<hz> a_(eaj $$0, awo $$1, hz $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new hz($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eam<?> b() {
      return eam.k;
   }
}
