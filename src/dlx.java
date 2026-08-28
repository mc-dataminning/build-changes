import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlx extends dmd {
   public static final MapCodec<dlx> a = b(dlx::new);
   public static final ebr<jb> b = ebj.R;
   public static final ebk c = ebj.y;

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   public dlx(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1 instanceof arq $$5 && $$1.c_($$2) instanceof dxj $$6) {
         $$3.a($$6);
         $$3.a(awx.ar);
         cqc.a($$5, $$3, true);
      }

      return bug.a;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      dxr $$4 = $$1.c_($$2);
      if ($$4 instanceof dxj) {
         ((dxj)$$4).k();
      }
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxj($$0, $$1);
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return cvf.a($$1.c_($$2));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
