import com.mojang.serialization.Codec;
import java.util.Optional;

public record cu(jv<czc> c) implements ea<cze> {
   public static final Codec<cu> a = kg.a(mc.ad).xmap(cu::new, cu::b);

   @Override
   public ku<cze> a() {
      return kv.R;
   }

   public boolean a(cxh $$0, cze $$1) {
      Optional<jr<czc>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cw a(jv<czc> $$0) {
      return new cu($$0);
   }

   public jv<czc> b() {
      return this.c;
   }
}
