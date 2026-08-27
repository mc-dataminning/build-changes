import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpo implements dpp {
   public static final Codec<dpo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gv.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dpo::new)
   );
   private final Optional<gv> b;
   private final boolean c;

   private dpo(Optional<gv> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dpo a(gv $$0, boolean $$1) {
      return new dpo(Optional.of($$0), $$1);
   }

   public static dpo a() {
      return new dpo(Optional.empty(), false);
   }

   public Optional<gv> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
