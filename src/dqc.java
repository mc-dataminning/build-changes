import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dqc implements dpq {
   public static final Codec<dqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dqc::new, dpg.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), duc.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dpg> b;
   public final he<duc> c;

   public dqc(List<dpg> $$0, he<duc> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dmz<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
