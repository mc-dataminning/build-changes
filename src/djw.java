import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djw extends dfa implements dmb {
   public static final MapCodec<djw> a = b(djw::new);
   public static final dsu b = dst.C;

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   protected djw(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsd $$0, dsd $$1, je $$2) {
      return $$1.a(dfc.ac) && $$2.o() == je.a.b;
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enx.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(b) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }
}
