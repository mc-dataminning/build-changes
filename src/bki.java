import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bki {
   public static final Codec<bki> a = RecordCodecBuilder.create($$0 -> $$0.group(dpz.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bki::new));
   private final dpz b;

   public bki(dpz $$0) {
      this.b = $$0;
   }

   public bki(long $$0, ahh $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bki(long $$0, Optional<ahh> $$1) {
      this(a($$0, $$1));
   }

   private static dpz a(long $$0, Optional<ahh> $$1) {
      dpn.a $$2 = dpn.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dpz($$2.a());
   }

   public static dpn.a a(ahh $$0) {
      return dpn.a($$0.toString());
   }

   public auw a() {
      return this.b;
   }
}
