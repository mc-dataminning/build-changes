import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class ddm extends dfb implements daf, dhc {
   public static final MapCodec<ddm> a = b(ddm::new);
   private static final dns c = dnr.C;
   private final dfc d = new dfc(this);

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   public ddm(dna.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dnb> b(int $$0) {
      return $$1 -> dfb.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, csu $$1) {
      return !$$1.n().a(cqp.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return ih.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return $$0.u().c();
   }

   @Override
   public dfc c() {
      return this.d;
   }
}
