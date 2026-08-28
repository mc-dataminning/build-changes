import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fah(fau b, ewo c) implements ezy {
   public static final MapCodec<fah> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fav.a.fieldOf("value").forGetter(fah::c), ewo.a.fieldOf("range").forGetter(fah::d)).apply($$0, fah::new)
   );

   @Override
   public ezz b() {
      return faa.r;
   }

   @Override
   public Set<bbn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ewp $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ezy.a a(fau $$0, ewo $$1) {
      return () -> new fah($$0, $$1);
   }

   public fau c() {
      return this.b;
   }

   public ewo d() {
      return this.c;
   }
}
