import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqm {
   public static final Codec<bqm> a = RecordCodecBuilder.create($$0 -> $$0.group(dzg.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqm::new));
   private final dzg b;

   public bqm(dzg $$0) {
      this.b = $$0;
   }

   public bqm(long $$0, akk $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqm(long $$0, Optional<akk> $$1) {
      this(a($$0, $$1));
   }

   private static dzg a(long $$0, Optional<akk> $$1) {
      dyu.a $$2 = dyu.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dzg($$2.a());
   }

   public static dyu.a a(akk $$0) {
      return dyu.a($$0.toString());
   }

   public ayo a() {
      return this.b;
   }
}
