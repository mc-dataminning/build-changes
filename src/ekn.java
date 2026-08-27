import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekn(ekz b, ehe c) implements eke {
   public static final Codec<ekn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ela.a.fieldOf("value").forGetter(ekn::c), ehe.a.fieldOf("range").forGetter(ekn::d)).apply($$0, ekn::new)
   );

   @Override
   public ekf b() {
      return ekg.s;
   }

   @Override
   public Set<ejn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ehf $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eke.a a(ekz $$0, ehe $$1) {
      return () -> new ekn($$0, $$1);
   }

   public ekz c() {
      return this.b;
   }

   public ehe d() {
      return this.c;
   }
}
