import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgq extends dhj implements dol {
   public static final MapCodec<dgq> a = b(dgq::new);
   public static final dvf b = dve.C;

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   protected dgq(dun.d $$0) {
      super($$0);
      this.l(this.o().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(duo $$0) {
      return $$0.y().c();
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.a;
   }

   @Override
   protected float c(duo $$0, ddl $$1, je $$2) {
      return 1.0F;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(b) ? eqq.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      return this.o().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eqq.c));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   public cvp a(@Nullable cnu $$0, deh $$1, je $$2, duo $$3) {
      return $$0 != null && $$0.f() ? dol.super.a($$0, $$1, $$2, $$3) : cvp.k;
   }

   @Override
   public boolean a(@Nullable cnu $$0, ddl $$1, je $$2, duo $$3, eqo $$4) {
      return $$0 != null && $$0.f() ? dol.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
