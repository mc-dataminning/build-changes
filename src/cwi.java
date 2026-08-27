import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwi extends cwc implements cwh {
   public static final MapCodec<cwi> a = b(cwi::new);

   @Override
   public MapCodec<cwi> a() {
      return a;
   }

   public cwi(djg.d $$0) {
      super($$0);
   }

   @Override
   public clm b() {
      return clm.a;
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dgq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$2, dgx.o, dgq::a);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         dgv $$6 = $$1.c_($$2);
         if ($$6 instanceof dgq) {
            $$3.a((dgq)$$6);
            $$3.a(asc.ab);
         }

         return bkb.b;
      }
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof dgq) {
            ((dgq)$$5).a($$4.y());
         }
      }
   }
}
