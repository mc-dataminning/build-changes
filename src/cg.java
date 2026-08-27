import com.mojang.serialization.Codec;
import java.util.Optional;

public record cg(ja<cuw> c) implements df<cuy> {
   public static final Codec<cg> a = jl.a(le.Y).xmap(cg::new, cg::b);

   @Override
   public jz<cuy> a() {
      return ka.E;
   }

   public boolean a(csz $$0, cuy $$1) {
      Optional<iw<cuw>> $$2 = $$1.f();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static ci a(ja<cuw> $$0) {
      return new cg($$0);
   }

   public ja<cuw> b() {
      return this.c;
   }
}
