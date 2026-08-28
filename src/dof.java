import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dof extends dnn implements dmc {
   public static final MapCodec<dof> a = b(dof::new);
   public static final dsv c = dsu.C;

   @Override
   protected MapCodec<? extends dof> a() {
      return a;
   }

   protected dof(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(eny.c)));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }
}
