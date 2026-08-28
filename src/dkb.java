import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkb extends dff implements dmg {
   public static final MapCodec<dkb> a = b(dkb::new);
   public static final dsy b = dsx.C;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   protected dkb(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsh $$0, dsh $$1, jf $$2) {
      return $$1.a(dfh.ac) && $$2.o() == jf.a.b;
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eoc.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(b) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }
}
