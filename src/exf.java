import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exf(exs b, etk c) implements eww {
   public static final MapCodec<exf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ext.a.fieldOf("value").forGetter(exf::c), etk.a.fieldOf("range").forGetter(exf::d)).apply($$0, exf::new)
   );

   @Override
   public ewx b() {
      return ewy.r;
   }

   @Override
   public Set<ewe<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(etl $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eww.a a(exs $$0, etk $$1) {
      return () -> new exf($$0, $$1);
   }

   public exs c() {
      return this.b;
   }

   public etk d() {
      return this.c;
   }
}
