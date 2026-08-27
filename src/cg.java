import com.mojang.serialization.Codec;
import java.util.Optional;

public record cg(jb<cvn> c) implements dg<cvp> {
   public static final Codec<cg> a = jm.a(lf.Y).xmap(cg::new, cg::b);

   @Override
   public ka<cvp> a() {
      return kb.F;
   }

   public boolean a(cto $$0, cvp $$1) {
      Optional<ix<cvn>> $$2 = $$1.f();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static ci a(jb<cvn> $$0) {
      return new cg($$0);
   }

   public jb<cvn> b() {
      return this.c;
   }
}
