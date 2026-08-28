import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dei extends dfb implements dmc {
   public static final MapCodec<dei> a = b(dei::new);
   public static final dsv b = dsu.C;

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   protected dei(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.a;
   }

   @Override
   protected float d(dse $$0, dbg $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(b) ? eny.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eny.c));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   public cur a(@Nullable cmz $$0, dcb $$1, iz $$2, dse $$3) {
      return $$0 != null && $$0.f() ? dmc.super.a($$0, $$1, $$2, $$3) : cur.l;
   }

   @Override
   public boolean a(@Nullable cmz $$0, dbg $$1, iz $$2, dse $$3, enw $$4) {
      return $$0 != null && $$0.f() ? dmc.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
