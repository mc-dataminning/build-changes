import com.mojang.serialization.Codec;

public class edp extends edi {
   public static final Codec<edp> b = dqh.b.fieldOf("state").xmap(dqg.a::b, dde::n).xmap(edp::new, $$0 -> $$0.c).codec();
   private final dde c;

   public edp(dde $$0) {
      this.c = $$0;
   }

   @Override
   protected edj<?> a() {
      return edj.f;
   }

   @Override
   public dqh a(ayg $$0, in $$1) {
      is.a $$2 = is.a.a($$0);
      return this.c.n().a(djq.i, $$2);
   }
}
