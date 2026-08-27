import com.mojang.serialization.Codec;

public class dvv extends dvn {
   public static final Codec<dvv> a = anl.a(jc.e).fieldOf("tag").xmap(dvv::new, $$0 -> $$0.b).codec();
   private final anl<cpn> b;

   public dvv(anl<cpn> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dcb $$0, apf $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dvo<?> a() {
      return dvo.d;
   }
}
