import com.mojang.serialization.MapCodec;

public class dew extends cxm {
   public static final MapCodec<dew> n = b(dew::new);

   @Override
   public MapCodec<dew> a() {
      return n;
   }

   public dew(diz.d $$0) {
      super($$0, () -> dgq.c);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dig($$0, $$1);
   }

   @Override
   protected art<ahd> c() {
      return arw.i.b(arw.ai);
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return aui.a(dgv.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
