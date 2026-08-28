import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emb implements emc {
   public static final Codec<emb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, emb::new)
   );
   private final Optional<iv> b;
   private final boolean c;

   private emb(Optional<iv> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static emb a(iv $$0, boolean $$1) {
      return new emb(Optional.of($$0), $$1);
   }

   public static emb a() {
      return new emb(Optional.empty(), false);
   }

   public Optional<iv> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
