import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqa {
   public static final Codec<bqa> a = RecordCodecBuilder.create($$0 -> $$0.group(dxu.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqa::new));
   private final dxu b;

   public bqa(dxu $$0) {
      this.b = $$0;
   }

   public bqa(long $$0, akm $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqa(long $$0, Optional<akm> $$1) {
      this(a($$0, $$1));
   }

   private static dxu a(long $$0, Optional<akm> $$1) {
      dxi.a $$2 = dxi.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dxu($$2.a());
   }

   public static dxi.a a(akm $$0) {
      return dxi.a($$0.toString());
   }

   public ayk a() {
      return this.b;
   }
}
