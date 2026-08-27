import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dva implements dug {
   public static final Codec<dva> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dtm.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               hx.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dva::new)
   );
   private final boolean b;
   private final List<dtm.a> c;
   @Nullable
   private final hx d;

   public dva(boolean $$0, List<dtm.a> $$1, @Nullable hx $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dva(boolean $$0, List<dtm.a> $$1, Optional<hx> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dtm.a> b() {
      return this.c;
   }

   @Nullable
   public hx c() {
      return this.d;
   }
}
