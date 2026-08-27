import com.mojang.serialization.Codec;
import java.util.Optional;

public record cf(iz<cua> c) implements de<cuc> {
   public static final Codec<cf> a = jk.a(ld.Y).xmap(cf::new, cf::b);

   @Override
   public jy<cuc> a() {
      return jz.x;
   }

   public boolean a(csd $$0, cuc $$1) {
      Optional<iv<cua>> $$2 = $$1.f();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static ch a(iz<cua> $$0) {
      return new cf($$0);
   }

   public iz<cua> b() {
      return this.c;
   }
}
