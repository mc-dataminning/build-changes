import com.mojang.serialization.Codec;
import java.util.Optional;

public record cu(jv<cyk> c) implements ea<cym> {
   public static final Codec<cu> a = kg.a(mc.ad).xmap(cu::new, cu::b);

   @Override
   public ku<cym> a() {
      return kv.Q;
   }

   public boolean a(cwn $$0, cym $$1) {
      Optional<jr<cyk>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cw a(jv<cyk> $$0) {
      return new cu($$0);
   }

   public jv<cyk> b() {
      return this.c;
   }
}
