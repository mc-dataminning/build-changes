import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diw extends dgv implements dol {
   public static final MapCodec<diw> a = b(diw::new);
   public static final dvf b = dve.C;
   private static final int d = 3;
   protected static final ezm c = dhj.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dse($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.z, $$0.B ? dse::a : dse::b);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.b;
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(b) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      return this.o().b(b, Boolean.valueOf($$1.a(awz.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
