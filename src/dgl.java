import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgl extends cya {
   public static final MapCodec<dgl> c = b(dgl::new);

   @Override
   public MapCodec<dgl> a() {
      return c;
   }

   protected dgl(dmd.d $$0) {
      super($$0);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$0, $$2, djn.B);
   }

   @Override
   protected void a(cwe $$0, ib $$1, cia $$2) {
      djl $$3 = $$0.c_($$1);
      if ($$3 instanceof dkx) {
         $$2.a((bmp)$$3);
         $$2.a(atz.at);
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, atp.xD, atq.e, 1.0F, 1.0F, false);
         }

         $$1.a(kb.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
