import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dep extends dfi implements dmj {
   public static final MapCodec<dep> a = b(dep::new);
   public static final dtc b = dtb.C;

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   protected dep(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dsl $$0, dbm $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.a;
   }

   @Override
   protected float d(dsl $$0, dbm $$1, ja $$2) {
      return 1.0F;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(b) ? eok.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eok.c));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   public cud a(@Nullable cml $$0, dch $$1, ja $$2, dsl $$3) {
      return $$0 != null && $$0.f() ? dmj.super.a($$0, $$1, $$2, $$3) : cud.l;
   }

   @Override
   public boolean a(@Nullable cml $$0, dbm $$1, ja $$2, dsl $$3, eoi $$4) {
      return $$0 != null && $$0.f() ? dmj.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
