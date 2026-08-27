import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwn extends cum implements dca {
   public static final MapCodec<cwn> a = b(cwn::new);
   public static final dhz b = dhy.C;
   private static final int d = 3;
   protected static final ekn c = cva.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cwn> a() {
      return a;
   }

   public cwn(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$2, dff.z, $$0.B ? dfp::a : dfp::b);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.b;
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(b) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof dey) {
            ((dey)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(arl.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
