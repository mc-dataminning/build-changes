import java.util.Optional;

public record aif(Optional<jf<bvk>> b, Optional<jf<bvk>> c) implements zf<agp> {
   public static final yw<wj, aif> a = yw.a(bvk.b.a(yu::a), aif::b, bvk.b.a(yu::a), aif::e, aif::new);

   @Override
   public zh<aif> a() {
      return agn.cb;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public Optional<jf<bvk>> e() {
      return this.c;
   }
}
