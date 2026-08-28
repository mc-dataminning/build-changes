import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcr(fde b, eyy c) implements fci {
   public static final MapCodec<fcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdf.a.fieldOf("value").forGetter(fcr::c), eyy.a.fieldOf("range").forGetter(fcr::d)).apply($$0, fcr::new)
   );

   @Override
   public fcj b() {
      return fck.r;
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eyz $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fci.a a(fde $$0, eyy $$1) {
      return () -> new fcr($$0, $$1);
   }

   public fde c() {
      return this.b;
   }

   public eyy d() {
      return this.c;
   }
}
