import com.mojang.serialization.MapCodec;

public class dge extends dgr {
   public static final MapCodec<dge> a = b(dge::new);

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   public dge(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(aE);
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(aE, $$0.g().g());
   }
}
