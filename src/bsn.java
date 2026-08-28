import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bsn {
   public static final Codec<bsn> a = RecordCodecBuilder.create($$0 -> $$0.group(edt.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bsn::new));
   private final edt b;

   public bsn(edt $$0) {
      this.b = $$0;
   }

   public bsn(long $$0, aku $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bsn(long $$0, Optional<aku> $$1) {
      this(a($$0, $$1));
   }

   private static edt a(long $$0, Optional<aku> $$1) {
      edh.a $$2 = edh.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new edt($$2.a());
   }

   public static edh.a a(aku $$0) {
      return edh.a($$0.toString());
   }

   public azh a() {
      return this.b;
   }
}
