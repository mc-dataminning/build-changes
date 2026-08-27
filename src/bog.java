import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bog {
   public static final Codec<bog> a = RecordCodecBuilder.create($$0 -> $$0.group(dvs.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bog::new));
   private final dvs b;

   public bog(dvs $$0) {
      this.b = $$0;
   }

   public bog(long $$0, ajt $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bog(long $$0, Optional<ajt> $$1) {
      this(a($$0, $$1));
   }

   private static dvs a(long $$0, Optional<ajt> $$1) {
      dvg.a $$2 = dvg.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dvs($$2.a());
   }

   public static dvg.a a(ajt $$0) {
      return dvg.a($$0.toString());
   }

   public axr a() {
      return this.b;
   }
}
