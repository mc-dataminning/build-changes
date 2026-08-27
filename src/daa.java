import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daa extends cvf implements dcf {
   public static final MapCodec<daa> a = b(daa::new);
   public static final die b = did.C;

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   protected daa(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dhn $$0, dhn $$1, ib $$2) {
      return $$1.a(cvh.ac) && $$2.o() == ib.a.b;
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ecy.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(b) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }
}
