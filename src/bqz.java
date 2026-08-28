import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqz {
   public static final Codec<bqz> a = RecordCodecBuilder.create($$0 -> $$0.group(dyu.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqz::new));
   private final dyu b;

   public bqz(dyu $$0) {
      this.b = $$0;
   }

   public bqz(long $$0, ale $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqz(long $$0, Optional<ale> $$1) {
      this(a($$0, $$1));
   }

   private static dyu a(long $$0, Optional<ale> $$1) {
      dyi.a $$2 = dyi.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dyu($$2.a());
   }

   public static dyi.a a(ale $$0) {
      return dyi.a($$0.toString());
   }

   public azg a() {
      return this.b;
   }
}
