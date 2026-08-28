import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djx extends dfb implements dmc {
   public static final MapCodec<djx> a = b(djx::new);
   public static final dsv b = dsu.C;

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   protected djx(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dse $$0, dse $$1, je $$2) {
      return $$1.a(dfd.ac) && $$2.o() == je.a.b;
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eny.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(b) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }
}
