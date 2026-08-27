import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class den extends dkt {
   public static final MapCodec<den> a = b(den::new);
   public static final drx b = drt.R;

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public den(drc.d $$0) {
      super($$0);
      this.k(this.n().a(b, it.c));
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new don($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return !$$0.B ? a($$2, dok.J, ($$0x, $$1x, $$2x, $$3) -> dwf.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
