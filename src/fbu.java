import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fbu(fbq b, fbq c) implements fbq {
   public static final MapCodec<fbu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fbr.a.fieldOf("min").forGetter(fbu::c), fbr.a.fieldOf("max").forGetter(fbu::d)).apply($$0, fbu::new)
   );

   @Override
   public fbp b() {
      return fbr.c;
   }

   public static fbu a(float $$0, float $$1) {
      return new fbu(fbn.a($$0), fbn.a($$1));
   }

   @Override
   public int a(exl $$0) {
      return azk.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(exl $$0) {
      return azk.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bat<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fbq c() {
      return this.b;
   }

   public fbq d() {
      return this.c;
   }
}
