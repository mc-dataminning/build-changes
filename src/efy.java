import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efy(egk b, ecp c) implements efp {
   public static final Codec<efy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egl.a.fieldOf("value").forGetter(efy::c), ecp.a.fieldOf("range").forGetter(efy::d)).apply($$0, efy::new)
   );

   @Override
   public efq b() {
      return efr.s;
   }

   @Override
   public Set<eey<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ecq $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static efp.a a(egk $$0, ecp $$1) {
      return () -> new efy($$0, $$1);
   }

   public egk c() {
      return this.b;
   }

   public ecp d() {
      return this.c;
   }
}
