import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcu extends diz {
   public static final MapCodec<dcu> a = b(dcu::new);
   public static final dqc b = dpy.R;

   @Override
   public MapCodec<dcu> a() {
      return a;
   }

   public dcu(dph.d $$0) {
      super($$0);
      this.k(this.n().a(b, ij.c));
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return !$$0.B ? a($$2, dmq.J, ($$0x, $$1x, $$2x, $$3) -> duk.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
