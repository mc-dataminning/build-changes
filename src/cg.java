import com.mojang.serialization.Codec;
import java.util.Optional;

public record cg(jb<cvp> c) implements dg<cvr> {
   public static final Codec<cg> a = jm.a(lf.Y).xmap(cg::new, cg::b);

   @Override
   public ka<cvr> a() {
      return kb.F;
   }

   public boolean a(ctq $$0, cvr $$1) {
      Optional<ix<cvp>> $$2 = $$1.f();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static ci a(jb<cvp> $$0) {
      return new cg($$0);
   }

   public jb<cvp> b() {
      return this.c;
   }
}
