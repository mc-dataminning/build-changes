import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgs extends der implements dmg {
   public static final MapCodec<dgs> a = b(dgs::new);
   public static final dsy b = dsx.C;
   private static final int d = 3;
   protected static final ews c = dff.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   public dgs(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.z, $$0.B ? dpz::a : dpz::b);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.b;
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(b) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awa.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
