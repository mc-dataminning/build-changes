import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqg {
   public static final Codec<bqg> a = RecordCodecBuilder.create($$0 -> $$0.group(dzv.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqg::new));
   private final dzv b;

   public bqg(dzv $$0) {
      this.b = $$0;
   }

   public bqg(long $$0, akt $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqg(long $$0, Optional<akt> $$1) {
      this(a($$0, $$1));
   }

   private static dzv a(long $$0, Optional<akt> $$1) {
      dzj.a $$2 = dzj.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dzv($$2.a());
   }

   public static dzj.a a(akt $$0) {
      return dzj.a($$0.toString());
   }

   public ayt a() {
      return this.b;
   }
}
