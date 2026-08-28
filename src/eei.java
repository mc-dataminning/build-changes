import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eei implements edo {
   public static final Codec<eei> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               ecu.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               ja.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, eei::new)
   );
   private final boolean b;
   private final List<ecu.a> c;
   @Nullable
   private final ja d;

   public eei(boolean $$0, List<ecu.a> $$1, @Nullable ja $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private eei(boolean $$0, List<ecu.a> $$1, Optional<ja> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<ecu.a> b() {
      return this.c;
   }

   @Nullable
   public ja c() {
      return this.d;
   }
}
