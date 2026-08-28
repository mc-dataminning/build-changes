import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dee extends dex implements dly {
   public static final MapCodec<dee> a = b(dee::new);
   public static final dsr b = dsq.C;

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   protected dee(drz.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.a;
   }

   @Override
   protected float d(dsa $$0, dbc $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(b) ? enu.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == enu.c));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   public cun a(@Nullable cmv $$0, dbx $$1, iz $$2, dsa $$3) {
      return $$0 != null && $$0.f() ? dly.super.a($$0, $$1, $$2, $$3) : cun.l;
   }

   @Override
   public boolean a(@Nullable cmv $$0, dbc $$1, iz $$2, dsa $$3, ens $$4) {
      return $$0 != null && $$0.f() ? dly.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
