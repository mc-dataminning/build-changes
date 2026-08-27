import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dcp extends dee implements czi, dgf {
   public static final MapCodec<dcp> a = b(dcp::new);
   private static final dmv c = dmu.C;
   private final def d = new def(this);

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public dcp(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dme> b(int $$0) {
      return $$1 -> dee.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, crx $$1) {
      return !$$1.n().a(cpt.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return ih.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(c) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return $$0.u().c();
   }

   @Override
   public def c() {
      return this.d;
   }
}
