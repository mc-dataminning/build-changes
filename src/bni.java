import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bni {
   public static final Codec<bni> a = RecordCodecBuilder.create($$0 -> $$0.group(dtn.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bni::new));
   private final dtn b;

   public bni(dtn $$0) {
      this.b = $$0;
   }

   public bni(long $$0, ajh $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bni(long $$0, Optional<ajh> $$1) {
      this(a($$0, $$1));
   }

   private static dtn a(long $$0, Optional<ajh> $$1) {
      dtb.a $$2 = dtb.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dtn($$2.a());
   }

   public static dtb.a a(ajh $$0) {
      return dtb.a($$0.toString());
   }

   public axd a() {
      return this.b;
   }
}
