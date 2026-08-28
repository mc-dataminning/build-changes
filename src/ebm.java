import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class ebm {
   public static final MapCodec<ebm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(ebm::b),
               Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(ebm::c),
               Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(ebm::d),
               Codec.STRING.lenientOptionalFieldOf("legacy_custom_options").stable().forGetter($$0x -> $$0x.f)
            )
            .apply($$0, $$0.stable(ebm::new))
   );
   public static final ebm b = new ebm((long)"North Carolina".hashCode(), true, true);
   private final long c;
   private final boolean d;
   private final boolean e;
   private final Optional<String> f;

   public ebm(long $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, Optional.empty());
   }

   public static ebm a() {
      return new ebm(f(), true, false);
   }

   private ebm(long $$0, boolean $$1, boolean $$2, Optional<String> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public long b() {
      return this.c;
   }

   public boolean c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.f.isPresent();
   }

   public ebm a(boolean $$0) {
      return new ebm(this.c, this.d, $$0, this.f);
   }

   public ebm b(boolean $$0) {
      return new ebm(this.c, $$0, this.e, this.f);
   }

   public ebm a(OptionalLong $$0) {
      return new ebm($$0.orElse(f()), this.d, this.e, this.f);
   }

   public static OptionalLong a(String $$0) {
      $$0 = $$0.trim();
      if (StringUtils.isEmpty($$0)) {
         return OptionalLong.empty();
      } else {
         try {
            return OptionalLong.of(Long.parseLong($$0));
         } catch (NumberFormatException var2) {
            return OptionalLong.of((long)$$0.hashCode());
         }
      }
   }

   public static long f() {
      return azn.a().g();
   }
}
