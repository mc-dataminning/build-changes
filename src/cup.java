import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cup extends cso implements dab {
   public static final MapCodec<cup> a = b(cup::new);
   public static final dfu b = dft.C;
   private static final int d = 3;
   protected static final eia c = ctc.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cup> a() {
      return a;
   }

   public cup(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.z, $$0.B ? ddl::a : ddl::b);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.b;
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(b) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof dcu) {
            ((dcu)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(aqa.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
