import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dad extends dac {
   public static final MapCodec<dad> h = b(dad::new);
   public static final dgv i = cxu.aE;
   public static final dgs j = dac.d;

   @Override
   public MapCodec<dad> a() {
      return h;
   }

   protected dad(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, hx.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return dcx.h($$0);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return cuc.cq.a($$0, $$1, $$2);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return cuc.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = cuc.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$0.c(j)) {
         hx $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jm.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cqz $$0, ht $$1, dgb $$2) {
      hx $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return cuc.cq.a($$0, $$1);
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return cuc.cq.a($$0, $$1);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(i, j);
   }
}
