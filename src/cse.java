import java.util.List;
import javax.annotation.Nullable;

public class cse extends csu {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cse(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      if (!$$1.B) {
         csz $$2 = $$0.n();
         etp $$3 = $$0.l();
         is $$4 = $$0.k();
         clu $$5 = new clu($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bpm.a($$1.B);
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      if ($$1.fC()) {
         csz $$3 = $$1.b($$2);
         if (!$$0.B) {
            clu $$4 = new clu($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avm.c.b(this));
         }

         return bpn.a($$1.b($$2), $$0.x_());
      } else {
         return bpn.c($$1.b($$2));
      }
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      cvr $$4 = $$0.a(ka.R);
      if ($$4 != null) {
         $$4.a($$2::add, $$3);
      }
   }
}
