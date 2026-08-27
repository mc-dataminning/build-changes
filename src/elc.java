import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record elc(ekz b, ekz c) implements ekz {
   public static final Codec<elc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ela.a.fieldOf("min").forGetter(elc::c), ela.a.fieldOf("max").forGetter(elc::d)).apply($$0, elc::new)
   );

   @Override
   public eky b() {
      return ela.c;
   }

   public static elc a(float $$0, float $$1) {
      return new elc(ekx.a($$0), ekx.a($$1));
   }

   @Override
   public int a(ehf $$0) {
      return aup.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ehf $$0) {
      return aup.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ejn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ekz c() {
      return this.b;
   }

   public ekz d() {
      return this.c;
   }
}
