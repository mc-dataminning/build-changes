import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqx {
   public static final Codec<bqx> a = RecordCodecBuilder.create($$0 -> $$0.group(dzz.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqx::new));
   private final dzz b;

   public bqx(dzz $$0) {
      this.b = $$0;
   }

   public bqx(long $$0, akr $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqx(long $$0, Optional<akr> $$1) {
      this(a($$0, $$1));
   }

   private static dzz a(long $$0, Optional<akr> $$1) {
      dzn.a $$2 = dzn.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dzz($$2.a());
   }

   public static dzn.a a(akr $$0) {
      return dzn.a($$0.toString());
   }

   public ayw a() {
      return this.b;
   }
}
