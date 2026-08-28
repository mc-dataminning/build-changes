import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class eeo {
   public static final MapCodec<eeo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(eeo::c),
               Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(eeo::d),
               Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(eeo::e),
               Codec.STRING.lenientOptionalFieldOf("legacy_custom_options").stable().forGetter($$0x -> $$0x.f)
            )
            .apply($$0, $$0.stable(eeo::new))
   );
   public static final eeo b = new eeo((long)"North Carolina".hashCode(), true, true);
   private final long c;
   private final boolean d;
   private final boolean e;
   private final Optional<String> f;

   public eeo(long $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, Optional.empty());
   }

   public static eeo a() {
      return new eeo(g(), true, false);
   }

   public static eeo b() {
      return new eeo(g(), false, false);
   }

   private eeo(long $$0, boolean $$1, boolean $$2, Optional<String> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public long c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f.isPresent();
   }

   public eeo a(boolean $$0) {
      return new eeo(this.c, this.d, $$0, this.f);
   }

   public eeo b(boolean $$0) {
      return new eeo(this.c, $$0, this.e, this.f);
   }

   public eeo a(OptionalLong $$0) {
      return new eeo($$0.orElse(g()), this.d, this.e, this.f);
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

   public static long g() {
      return bam.a().g();
   }
}
