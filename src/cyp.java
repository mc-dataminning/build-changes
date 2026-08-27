import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class cyp extends dae implements cvi, dcf {
   public static final MapCodec<cyp> a = b(cyp::new);
   private static final die c = did.C;
   private final daf d = new daf(this);

   @Override
   public MapCodec<cyp> a() {
      return a;
   }

   public cyp(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dhn> b(int $$0) {
      return $$1 -> dae.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      return !$$1.n().a(clr.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return ib.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(c) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public daf c() {
      return this.d;
   }
}
