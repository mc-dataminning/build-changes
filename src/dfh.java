import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfh extends dch {
   public static final MapCodec<dfh> a = b(dfh::new);
   protected static final ety b = dcv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<im> c = im.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(im::i).toList();

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   protected dfh(dpx.d $$0) {
      super($$0);
   }

   public static boolean a(czu $$0, im $$1, im $$2) {
      return $$0.a_($$1.a((jq)$$2)).a(avo.cp) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(avo.cq);
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (im $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               kw.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0.B ? a($$2, dnf.m, dnx::a) : null;
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return boq.b;
      }
   }

   @Nullable
   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      dnd $$3 = $$1.c_($$2);
      if ($$3 instanceof dnx) {
         ws $$4 = ((bov)$$3).O_();
         return new bpa(($$2x, $$3x, $$4x) -> new cob($$2x, $$3x, cns.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
