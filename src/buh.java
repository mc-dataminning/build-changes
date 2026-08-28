import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class buh {
   public static final Codec<buh> a = RecordCodecBuilder.create($$0 -> $$0.group(ehh.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, buh::new));
   private final ehh b;

   public buh(ehh $$0) {
      this.b = $$0;
   }

   public buh(long $$0, alg $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public buh(long $$0, Optional<alg> $$1) {
      this(a($$0, $$1));
   }

   private static ehh a(long $$0, Optional<alg> $$1) {
      egv.a $$2 = egv.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new ehh($$2.a());
   }

   public static egv.a a(alg $$0) {
      return egv.a($$0.toString());
   }

   public azv a() {
      return this.b;
   }
}
