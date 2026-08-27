import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eve(evq b, ero c) implements euu {
   public static final Codec<eve> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(evr.a.fieldOf("value").forGetter(eve::c), ero.a.fieldOf("range").forGetter(eve::d)).apply($$0, eve::new)
   );

   @Override
   public euv b() {
      return euw.t;
   }

   @Override
   public Set<eud<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(erp $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static euu.a a(evq $$0, ero $$1) {
      return () -> new eve($$0, $$1);
   }

   public evq c() {
      return this.b;
   }

   public ero d() {
      return this.c;
   }
}
