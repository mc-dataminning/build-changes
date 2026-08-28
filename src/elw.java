import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elw implements elx {
   public static final Codec<elw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, elw::new)
   );
   private final Optional<iv> b;
   private final boolean c;

   private elw(Optional<iv> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static elw a(iv $$0, boolean $$1) {
      return new elw(Optional.of($$0), $$1);
   }

   public static elw a() {
      return new elw(Optional.empty(), false);
   }

   public Optional<iv> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
