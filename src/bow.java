import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bow {
   public static final Codec<bow> a = RecordCodecBuilder.create($$0 -> $$0.group(dwr.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bow::new));
   private final dwr b;

   public bow(dwr $$0) {
      this.b = $$0;
   }

   public bow(long $$0, akf $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bow(long $$0, Optional<akf> $$1) {
      this(a($$0, $$1));
   }

   private static dwr a(long $$0, Optional<akf> $$1) {
      dwf.a $$2 = dwf.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dwr($$2.a());
   }

   public static dwf.a a(akf $$0) {
      return dwf.a($$0.toString());
   }

   public ayd a() {
      return this.b;
   }
}
