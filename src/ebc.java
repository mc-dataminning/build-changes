import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ebc implements eai {
   public static final Codec<ebc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dzo.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               id.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ebc::new)
   );
   private final boolean b;
   private final List<dzo.a> c;
   @Nullable
   private final id d;

   public ebc(boolean $$0, List<dzo.a> $$1, @Nullable id $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ebc(boolean $$0, List<dzo.a> $$1, Optional<id> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dzo.a> b() {
      return this.c;
   }

   @Nullable
   public id c() {
      return this.d;
   }
}
