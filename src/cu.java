import com.mojang.serialization.Codec;
import java.util.Optional;

public record cu(jv<cyl> c) implements ea<cyn> {
   public static final Codec<cu> a = kg.a(mc.ad).xmap(cu::new, cu::b);

   @Override
   public ku<cyn> a() {
      return kv.Q;
   }

   public boolean a(cwo $$0, cyn $$1) {
      Optional<jr<cyl>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cw a(jv<cyl> $$0) {
      return new cu($$0);
   }

   public jv<cyl> b() {
      return this.c;
   }
}
