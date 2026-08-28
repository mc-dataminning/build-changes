import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class eeh {
   public static final MapCodec<eeh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(eeh::c),
               Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(eeh::d),
               Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(eeh::e),
               Codec.STRING.lenientOptionalFieldOf("legacy_custom_options").stable().forGetter($$0x -> $$0x.f)
            )
            .apply($$0, $$0.stable(eeh::new))
   );
   public static final eeh b = new eeh((long)"North Carolina".hashCode(), true, true);
   private final long c;
   private final boolean d;
   private final boolean e;
   private final Optional<String> f;

   public eeh(long $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, Optional.empty());
   }

   public static eeh a() {
      return new eeh(g(), true, false);
   }

   public static eeh b() {
      return new eeh(g(), false, false);
   }

   private eeh(long $$0, boolean $$1, boolean $$2, Optional<String> $$3) {
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

   public eeh a(boolean $$0) {
      return new eeh(this.c, this.d, $$0, this.f);
   }

   public eeh b(boolean $$0) {
      return new eeh(this.c, $$0, this.e, this.f);
   }

   public eeh a(OptionalLong $$0) {
      return new eeh($$0.orElse(g()), this.d, this.e, this.f);
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
      return bac.a().g();
   }
}
