import com.mojang.serialization.Codec;
import java.util.Optional;

public record cu(jw<czs> c) implements ea<czu> {
   public static final Codec<cu> a = kh.a(me.ad).xmap(cu::new, cu::b);

   @Override
   public kw<czu> a() {
      return kx.R;
   }

   public boolean a(cxy $$0, czu $$1) {
      Optional<js<czs>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cw a(jw<czs> $$0) {
      return new cu($$0);
   }

   public jw<czs> b() {
      return this.c;
   }
}
