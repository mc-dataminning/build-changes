import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bso {
   public static final Codec<bso> a = RecordCodecBuilder.create($$0 -> $$0.group(edt.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bso::new));
   private final edt b;

   public bso(edt $$0) {
      this.b = $$0;
   }

   public bso(long $$0, akv $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bso(long $$0, Optional<akv> $$1) {
      this(a($$0, $$1));
   }

   private static edt a(long $$0, Optional<akv> $$1) {
      edh.a $$2 = edh.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new edt($$2.a());
   }

   public static edh.a a(akv $$0) {
      return edh.a($$0.toString());
   }

   public azh a() {
      return this.b;
   }
}
