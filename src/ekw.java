import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ekw implements ekx {
   public static final Codec<ekw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iu.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, ekw::new)
   );
   private final Optional<iu> b;
   private final boolean c;

   private ekw(Optional<iu> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ekw a(iu $$0, boolean $$1) {
      return new ekw(Optional.of($$0), $$1);
   }

   public static ekw a() {
      return new ekw(Optional.empty(), false);
   }

   public Optional<iu> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
