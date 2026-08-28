import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exw(eyj b, eub c) implements exn {
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyk.a.fieldOf("value").forGetter(exw::c), eub.a.fieldOf("range").forGetter(exw::d)).apply($$0, exw::new)
   );

   @Override
   public exo b() {
      return exp.r;
   }

   @Override
   public Set<ewv<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(euc $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static exn.a a(eyj $$0, eub $$1) {
      return () -> new exw($$0, $$1);
   }

   public eyj c() {
      return this.b;
   }

   public eub d() {
      return this.c;
   }
}
