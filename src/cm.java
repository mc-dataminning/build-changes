import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cm(Optional<bf<cxh, cv>> c) implements ea<czx> {
   public static final Codec<cm> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cv.a).optionalFieldOf("items").forGetter(cm::b)).apply($$0, cm::new));

   @Override
   public ku<czx> a() {
      return kv.an;
   }

   public boolean a(cxh $$0, czx $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bf<cxh, cv>> b() {
      return this.c;
   }
}
