import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diw extends dea implements dlb {
   public static final MapCodec<diw> a = b(diw::new);
   public static final dru b = drt.C;

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   protected diw(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(drd $$0, drd $$1, it $$2) {
      return $$1.a(dec.ac) && $$2.o() == it.a.b;
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emx.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(b) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }
}
