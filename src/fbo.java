import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbo extends fbu {
   public static final MapCodec<fbo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(fah.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, fbo::new)
   );
   private final fah.b b;

   public fbo(List<fdq> $$0, fah.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbw<fbo> b() {
      return fbx.B;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if ($$0.a(dac.vx) && $$1.c(this.b.a()) instanceof crx $$2) {
         $$0.b(kk.ak, new dcy($$2.gi()));
      }

      return $$0;
   }

   public static fbu.a<?> a(fah.b $$0) {
      return a($$1 -> new fbo($$1, $$0));
   }
}
