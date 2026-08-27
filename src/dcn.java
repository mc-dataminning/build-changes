import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcn extends dch implements dcm {
   public static final MapCodec<dcn> a = b(dcn::new);

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   public dcn(dpx.d $$0) {
      super($$0);
   }

   @Override
   public cqw b() {
      return cqw.a;
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dmy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.o, dmy::a);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         if ($$1.c_($$2) instanceof dmy $$5) {
            $$3.a($$5);
            $$3.a(avj.ab);
         }

         return boq.b;
      }
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }
}
