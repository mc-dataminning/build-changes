import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cw(Optional<jt<ddk>> c, Optional<jt<ddm>> d) implements dy<ddj> {
   public static final Codec<cw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ke.a(ly.aX).optionalFieldOf("material").forGetter(cw::b), ke.a(ly.aY).optionalFieldOf("pattern").forGetter(cw::c)).apply($$0, cw::new)
   );

   @Override
   public ks<ddj> a() {
      return kt.T;
   }

   public boolean a(cvx $$0, ddj $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<jt<ddk>> b() {
      return this.c;
   }

   public Optional<jt<ddm>> c() {
      return this.d;
   }
}
