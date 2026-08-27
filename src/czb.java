import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czb extends dfg {
   public static final MapCodec<czb> a = b(czb::new);
   public static final dlz b = dlv.R;

   @Override
   public MapCodec<czb> a() {
      return a;
   }

   public czb(dle.d $$0) {
      super($$0);
      this.k(this.o().a(b, ie.c));
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new diy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return !$$0.B ? a($$2, div.J, ($$0x, $$1x, $$2x, $$3) -> dpy.c.a($$0x, $$3.gi(), $$3.gj())) : null;
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
