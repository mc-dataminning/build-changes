import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsy implements dse {
   public static final Codec<dsy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               drk.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               hx.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dsy::new)
   );
   private final boolean b;
   private final List<drk.a> c;
   @Nullable
   private final hx d;

   public dsy(boolean $$0, List<drk.a> $$1, @Nullable hx $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dsy(boolean $$0, List<drk.a> $$1, Optional<hx> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<drk.a> b() {
      return this.c;
   }

   @Nullable
   public hx c() {
      return this.d;
   }
}
