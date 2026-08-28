import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcf(fcs b, eym c) implements fbw {
   public static final MapCodec<fcf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fct.a.fieldOf("value").forGetter(fcf::c), eym.a.fieldOf("range").forGetter(fcf::d)).apply($$0, fcf::new)
   );

   @Override
   public fbx b() {
      return fby.r;
   }

   @Override
   public Set<bav<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eyn $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fbw.a a(fcs $$0, eym $$1) {
      return () -> new fcf($$0, $$1);
   }

   public fcs c() {
      return this.b;
   }

   public eym d() {
      return this.c;
   }
}
