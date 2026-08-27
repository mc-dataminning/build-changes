import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class dso {
   public static final MapCodec<dso> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(dso::b),
               Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(dso::c),
               Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(dso::d),
               Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter($$0x -> $$0x.f)
            )
            .apply($$0, $$0.stable(dso::new))
   );
   public static final dso b = new dso((long)"North Carolina".hashCode(), true, true);
   private final long c;
   private final boolean d;
   private final boolean e;
   private final Optional<String> f;

   public dso(long $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, Optional.empty());
   }

   public static dso a() {
      return new dso(f(), true, false);
   }

   private dso(long $$0, boolean $$1, boolean $$2, Optional<String> $$3) {
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

   public dso a(boolean $$0) {
      return new dso(this.c, this.d, $$0, this.f);
   }

   public dso b(boolean $$0) {
      return new dso(this.c, $$0, this.e, this.f);
   }

   public dso a(OptionalLong $$0) {
      return new dso($$0.orElse(f()), this.d, this.e, this.f);
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
      return awt.a().g();
   }
}
