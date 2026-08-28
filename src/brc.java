import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class brc {
   public static final Codec<brc> a = RecordCodecBuilder.create($$0 -> $$0.group(dyx.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, brc::new));
   private final dyx b;

   public brc(dyx $$0) {
      this.b = $$0;
   }

   public brc(long $$0, alf $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public brc(long $$0, Optional<alf> $$1) {
      this(a($$0, $$1));
   }

   private static dyx a(long $$0, Optional<alf> $$1) {
      dyl.a $$2 = dyl.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dyx($$2.a());
   }

   public static dyl.a a(alf $$0) {
      return dyl.a($$0.toString());
   }

   public azh a() {
      return this.b;
   }
}
