import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpz implements dqa {
   public static final Codec<dpz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gw.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dpz::new)
   );
   private final Optional<gw> b;
   private final boolean c;

   private dpz(Optional<gw> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dpz a(gw $$0, boolean $$1) {
      return new dpz(Optional.of($$0), $$1);
   }

   public static dpz a() {
      return new dpz(Optional.empty(), false);
   }

   public Optional<gw> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
