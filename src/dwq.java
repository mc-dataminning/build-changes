import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dwq implements dvw {
   public static final Codec<dwq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dvc.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               hz.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dwq::new)
   );
   private final boolean b;
   private final List<dvc.a> c;
   @Nullable
   private final hz d;

   public dwq(boolean $$0, List<dvc.a> $$1, @Nullable hz $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dwq(boolean $$0, List<dvc.a> $$1, Optional<hz> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dvc.a> b() {
      return this.c;
   }

   @Nullable
   public hz c() {
      return this.d;
   }
}
