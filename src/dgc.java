import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgc extends dgv implements dnx {
   public static final MapCodec<dgc> a = b(dgc::new);
   public static final dur b = duq.C;

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   protected dgc(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dua $$0) {
      return $$0.y().c();
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.a;
   }

   @Override
   protected float c(dua $$0, dcx $$1, je $$2) {
      return 1.0F;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(b) ? eqc.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eqc.c));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   public cvl a(@Nullable cnp $$0, ddt $$1, je $$2, dua $$3) {
      return $$0 != null && $$0.f() ? dnx.super.a($$0, $$1, $$2, $$3) : cvl.k;
   }

   @Override
   public boolean a(@Nullable cnp $$0, dcx $$1, je $$2, dua $$3, eqa $$4) {
      return $$0 != null && $$0.f() ? dnx.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
