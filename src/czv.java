import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czv extends cva implements dca {
   public static final MapCodec<czv> a = b(czv::new);
   public static final dhz b = dhy.C;

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   protected czv(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dhi $$0, dhi $$1, hx $$2) {
      return $$1.a(cvc.ac) && $$2.o() == hx.a.b;
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ect.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(b) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }
}
