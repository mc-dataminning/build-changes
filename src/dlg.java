import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlg extends dlm {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final eax<ja> b = eap.R;
   public static final eaq c = eap.y;

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1 instanceof arq $$5 && $$1.c_($$2) instanceof dwp $$6) {
         $$3.a($$6);
         $$3.a(awx.ar);
         cpo.a($$5, $$3, true);
      }

      return bub.a;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      dwx $$4 = $$1.c_($$2);
      if ($$4 instanceof dwp) {
         ((dwp)$$4).k();
      }
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dwp($$0, $$1);
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return cuq.a($$1.c_($$2));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
