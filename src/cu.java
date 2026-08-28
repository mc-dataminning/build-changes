import com.mojang.serialization.Codec;
import java.util.Optional;

public record cu(jv<cym> c) implements ea<cyo> {
   public static final Codec<cu> a = kg.a(mc.ad).xmap(cu::new, cu::b);

   @Override
   public ku<cyo> a() {
      return kv.Q;
   }

   public boolean a(cwp $$0, cyo $$1) {
      Optional<jr<cym>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cw a(jv<cym> $$0) {
      return new cu($$0);
   }

   public jv<cym> b() {
      return this.c;
   }
}
