import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class diq extends dkh implements dff, dmr {
   public static final MapCodec<diq> a = b(diq::new);
   private static final dtt c = dts.C;
   private final dki d = new dki(this);

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   public diq(dtb.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dtc> b(int $$0) {
      return $$1 -> dkh.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      return !$$1.n().a(cuk.hj) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return iw.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return $$0.u().c();
   }

   @Override
   public dki c() {
      return this.d;
   }
}
