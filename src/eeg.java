import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class eeg {
   public static final MapCodec<eeg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(eeg::c),
               Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(eeg::d),
               Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(eeg::e),
               Codec.STRING.lenientOptionalFieldOf("legacy_custom_options").stable().forGetter($$0x -> $$0x.f)
            )
            .apply($$0, $$0.stable(eeg::new))
   );
   public static final eeg b = new eeg((long)"North Carolina".hashCode(), true, true);
   private final long c;
   private final boolean d;
   private final boolean e;
   private final Optional<String> f;

   public eeg(long $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, Optional.empty());
   }

   public static eeg a() {
      return new eeg(g(), true, false);
   }

   public static eeg b() {
      return new eeg(g(), false, false);
   }

   private eeg(long $$0, boolean $$1, boolean $$2, Optional<String> $$3) {
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

   public eeg a(boolean $$0) {
      return new eeg(this.c, this.d, $$0, this.f);
   }

   public eeg b(boolean $$0) {
      return new eeg(this.c, $$0, this.e, this.f);
   }

   public eeg a(OptionalLong $$0) {
      return new eeg($$0.orElse(g()), this.d, this.e, this.f);
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
