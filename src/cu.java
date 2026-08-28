import com.mojang.serialization.Codec;
import java.util.Optional;

public record cu(jv<cyn> c) implements ea<cyp> {
   public static final Codec<cu> a = kg.a(mc.ad).xmap(cu::new, cu::b);

   @Override
   public ku<cyp> a() {
      return kv.Q;
   }

   public boolean a(cwq $$0, cyp $$1) {
      Optional<jr<cyn>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cw a(jv<cyn> $$0) {
      return new cu($$0);
   }

   public jv<cyn> b() {
      return this.c;
   }
}
