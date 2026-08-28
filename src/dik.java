import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dik extends dka implements dfd, dmb {
   public static final MapCodec<dik> a = b(dik::new);
   private static final dsu c = dst.C;
   private final dkb d = new dkb(this);

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dsd> b(int $$0) {
      return $$1 -> dka.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, cyb $$1) {
      return !$$1.n().a(cut.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return je.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(c) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   public dkb c() {
      return this.d;
   }
}
