import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class eau {
   public static final MapCodec<eau> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(eau::b),
               Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(eau::c),
               Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(eau::d),
               Codec.STRING.lenientOptionalFieldOf("legacy_custom_options").stable().forGetter($$0x -> $$0x.f)
            )
            .apply($$0, $$0.stable(eau::new))
   );
   public static final eau b = new eau((long)"North Carolina".hashCode(), true, true);
   private final long c;
   private final boolean d;
   private final boolean e;
   private final Optional<String> f;

   public eau(long $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, Optional.empty());
   }

   public static eau a() {
      return new eau(f(), true, false);
   }

   private eau(long $$0, boolean $$1, boolean $$2, Optional<String> $$3) {
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

   public eau a(boolean $$0) {
      return new eau(this.c, this.d, $$0, this.f);
   }

   public eau b(boolean $$0) {
      return new eau(this.c, $$0, this.e, this.f);
   }

   public eau a(OptionalLong $$0) {
      return new eau($$0.orElse(f()), this.d, this.e, this.f);
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
      return azk.a().g();
   }
}
