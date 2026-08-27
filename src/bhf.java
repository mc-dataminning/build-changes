import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bhf {
   public static final Codec<bhf> a = RecordCodecBuilder.create($$0 -> $$0.group(dlv.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bhf::new));
   private final dlv b;

   public bhf(dlv $$0) {
      this.b = $$0;
   }

   public bhf(long $$0, aey $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bhf(long $$0, Optional<aey> $$1) {
      this(a($$0, $$1));
   }

   private static dlv a(long $$0, Optional<aey> $$1) {
      dlj.a $$2 = dlj.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dlv($$2.a());
   }

   public static dlj.a a(aey $$0) {
      return dlj.a($$0.toString());
   }

   public ase a() {
      return this.b;
   }
}
