import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgl extends dek implements dlz {
   public static final MapCodec<dgl> a = b(dgl::new);
   public static final dss b = dsr.C;
   private static final int d = 3;
   protected static final ewj c = dey.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public dgl(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dps($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$2, dpi.z, $$0.B ? dps::a : dps::b);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.b;
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(b) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awu.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
