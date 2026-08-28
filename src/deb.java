import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deb extends deu implements dlv {
   public static final MapCodec<deb> a = b(deb::new);
   public static final dso b = dsn.C;

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   protected deb(drw.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return true;
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.a;
   }

   @Override
   protected float d(drx $$0, daz $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(b) ? enr.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == enr.c));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   public cuk a(@Nullable cms $$0, dbu $$1, iz $$2, drx $$3) {
      return $$0 != null && $$0.f() ? dlv.super.a($$0, $$1, $$2, $$3) : cuk.l;
   }

   @Override
   public boolean a(@Nullable cms $$0, daz $$1, iz $$2, drx $$3, enp $$4) {
      return $$0 != null && $$0.f() ? dlv.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
