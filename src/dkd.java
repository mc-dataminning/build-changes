import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends dic implements dpr {
   public static final MapCodec<dkd> a = b(dkd::new);
   public static final dwm b = dwl.C;
   private static final int d = 3;
   protected static final fas c = diq.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.z, $$0.C ? dtk::a : dtk::b);
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.b;
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(b) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axi.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
