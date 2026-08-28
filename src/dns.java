import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dns extends dnr {
   public static final MapCodec<dns> h = b(dns::new);
   public static final dvm i = dli.aF;
   public static final dvj j = dnr.d;

   @Override
   public MapCodec<dns> a() {
      return h;
   }

   protected dns(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jk.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return dqp.o($$0);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return dqp.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dho.a.n() : $$0;
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = dho.cq.a($$0);
      return $$1 == null ? null : this.n().b(i, $$1.c(i));
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(j)) {
         jk $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lj.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dej $$0, jf $$1, dus $$2) {
      jk $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected esb a(dej $$0, dus $$1) {
      return erx.a($$0, $$1.c(i).g(), jk.b);
   }
}
