import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqw {
   public static final Codec<bqw> a = RecordCodecBuilder.create($$0 -> $$0.group(dzw.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqw::new));
   private final dzw b;

   public bqw(dzw $$0) {
      this.b = $$0;
   }

   public bqw(long $$0, akq $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqw(long $$0, Optional<akq> $$1) {
      this(a($$0, $$1));
   }

   private static dzw a(long $$0, Optional<akq> $$1) {
      dzk.a $$2 = dzk.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dzw($$2.a());
   }

   public static dzk.a a(akq $$0) {
      return dzk.a($$0.toString());
   }

   public ayv a() {
      return this.b;
   }
}
