import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqy {
   public static final Codec<bqy> a = RecordCodecBuilder.create($$0 -> $$0.group(dyt.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqy::new));
   private final dyt b;

   public bqy(dyt $$0) {
      this.b = $$0;
   }

   public bqy(long $$0, ale $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqy(long $$0, Optional<ale> $$1) {
      this(a($$0, $$1));
   }

   private static dyt a(long $$0, Optional<ale> $$1) {
      dyh.a $$2 = dyh.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dyt($$2.a());
   }

   public static dyh.a a(ale $$0) {
      return dyh.a($$0.toString());
   }

   public azf a() {
      return this.b;
   }
}
