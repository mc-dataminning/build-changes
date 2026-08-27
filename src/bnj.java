import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bnj {
   public static final Codec<bnj> a = RecordCodecBuilder.create($$0 -> $$0.group(dtp.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bnj::new));
   private final dtp b;

   public bnj(dtp $$0) {
      this.b = $$0;
   }

   public bnj(long $$0, ajh $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bnj(long $$0, Optional<ajh> $$1) {
      this(a($$0, $$1));
   }

   private static dtp a(long $$0, Optional<ajh> $$1) {
      dtd.a $$2 = dtd.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dtp($$2.a());
   }

   public static dtd.a a(ajh $$0) {
      return dtd.a($$0.toString());
   }

   public axd a() {
      return this.b;
   }
}
