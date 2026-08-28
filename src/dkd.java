import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends dfh implements dmi {
   public static final MapCodec<dkd> a = b(dkd::new);
   public static final dtb b = dta.C;

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   protected dkd(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsk $$0, dsk $$1, jf $$2) {
      return $$1.a(dfj.ac) && $$2.o() == jf.a.b;
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eoi.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(b) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }
}
