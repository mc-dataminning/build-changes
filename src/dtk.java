import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class dtk {
   public static final MapCodec<dtk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(dtk::b),
               Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(dtk::c),
               Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(dtk::d),
               Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter($$0x -> $$0x.f)
            )
            .apply($$0, $$0.stable(dtk::new))
   );
   public static final dtk b = new dtk((long)"North Carolina".hashCode(), true, true);
   private final long c;
   private final boolean d;
   private final boolean e;
   private final Optional<String> f;

   public dtk(long $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, Optional.empty());
   }

   public static dtk a() {
      return new dtk(f(), true, false);
   }

   private dtk(long $$0, boolean $$1, boolean $$2, Optional<String> $$3) {
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

   public dtk a(boolean $$0) {
      return new dtk(this.c, this.d, $$0, this.f);
   }

   public dtk b(boolean $$0) {
      return new dtk(this.c, $$0, this.e, this.f);
   }

   public dtk a(OptionalLong $$0) {
      return new dtk($$0.orElse(f()), this.d, this.e, this.f);
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
      return axd.a().g();
   }
}
