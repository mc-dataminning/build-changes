import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esw(eti b, epg c) implements esn {
   public static final MapCodec<esw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(etj.a.fieldOf("value").forGetter(esw::c), epg.a.fieldOf("range").forGetter(esw::d)).apply($$0, esw::new)
   );

   @Override
   public eso b() {
      return esp.t;
   }

   @Override
   public Set<erw<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eph $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static esn.a a(eti $$0, epg $$1) {
      return () -> new esw($$0, $$1);
   }

   public eti c() {
      return this.b;
   }

   public epg d() {
      return this.c;
   }
}
