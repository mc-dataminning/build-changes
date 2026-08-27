import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cuh extends cva implements dca {
   public static final MapCodec<cuh> a = b(cuh::new);
   public static final dhz b = dhy.C;

   @Override
   public MapCodec<cuh> a() {
      return a;
   }

   protected cuh(dhh.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return true;
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.a;
   }

   @Override
   public float d(dhi $$0, crg $$1, ht $$2) {
      return 1.0F;
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

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ect.c));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public clj a(@Nullable cdu $$0, csb $$1, ht $$2, dhi $$3) {
      return $$0 != null && $$0.f() ? dca.super.a($$0, $$1, $$2, $$3) : clj.b;
   }

   @Override
   public boolean a(@Nullable cdu $$0, crg $$1, ht $$2, dhi $$3, ecr $$4) {
      return $$0 != null && $$0.f() ? dca.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
