import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bka {
   public static final Codec<bka> a = RecordCodecBuilder.create($$0 -> $$0.group(dpk.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bka::new));
   private final dpk b;

   public bka(dpk $$0) {
      this.b = $$0;
   }

   public bka(long $$0, ahd $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bka(long $$0, Optional<ahd> $$1) {
      this(a($$0, $$1));
   }

   private static dpk a(long $$0, Optional<ahd> $$1) {
      doy.a $$2 = doy.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dpk($$2.a());
   }

   public static doy.a a(ahd $$0) {
      return doy.a($$0.toString());
   }

   public aup a() {
      return this.b;
   }
}
