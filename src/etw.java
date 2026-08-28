import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etw(eui b, eqc c) implements etn {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euj.a.fieldOf("value").forGetter(etw::c), eqc.a.fieldOf("range").forGetter(etw::d)).apply($$0, etw::new)
   );

   @Override
   public eto b() {
      return etp.t;
   }

   @Override
   public Set<esw<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eqd $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static etn.a a(eui $$0, eqc $$1) {
      return () -> new etw($$0, $$1);
   }

   public eui c() {
      return this.b;
   }

   public eqc d() {
      return this.c;
   }
}
