import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eim implements eib {
   public static final Codec<eim> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emp.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), emp.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eim::new)
   );
   public final jr<emp> b;
   public final jr<emp> c;

   public eim(jr<emp> $$0, jr<emp> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<efj<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
