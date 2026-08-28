import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eju implements ejv {
   public static final Codec<eju> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jj.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eju::new)
   );
   private final Optional<jj> b;
   private final boolean c;

   private eju(Optional<jj> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eju a(jj $$0, boolean $$1) {
      return new eju(Optional.of($$0), $$1);
   }

   public static eju a() {
      return new eju(Optional.empty(), false);
   }

   public Optional<jj> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
