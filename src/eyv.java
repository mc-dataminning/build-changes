import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyv(eyy b) implements eyy {
   public static final MapCodec<eyv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eyy.e.fieldOf("term").forGetter(eyv::c)).apply($$0, eyv::new));

   @Override
   public eyz b() {
      return eza.a;
   }

   public boolean a(evp $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bah<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(evv $$0) {
      eyy.super.a($$0);
      this.b.a($$0);
   }

   public static eyy.a a(eyy.a $$0) {
      eyv $$1 = new eyv($$0.build());
      return () -> $$1;
   }

   public eyy c() {
      return this.b;
   }
}
