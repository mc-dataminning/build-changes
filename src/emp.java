import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emp implements emr {
   public static final Codec<emp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, emp::new)
   );
   private final Optional<iw> b;
   private final boolean c;

   private emp(Optional<iw> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static emp a(iw $$0, boolean $$1) {
      return new emp(Optional.of($$0), $$1);
   }

   public static emp a() {
      return new emp(Optional.empty(), false);
   }

   public Optional<iw> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
