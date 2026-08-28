import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dil extends dkb implements dfe, dmc {
   public static final MapCodec<dil> a = b(dil::new);
   private static final dsv c = dsu.C;
   private final dkc d = new dkc(this);

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dse> b(int $$0) {
      return $$1 -> dkb.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, cyc $$1) {
      return !$$1.n().a(cuu.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return je.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   public dkc c() {
      return this.d;
   }
}
