import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgt extends dhm implements doo {
   public static final MapCodec<dgt> a = b(dgt::new);
   public static final dvj b = dvi.C;

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   protected dgt(dur.d $$0) {
      super($$0);
      this.l(this.n().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dus $$0) {
      return $$0.y().c();
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.a;
   }

   @Override
   protected float c(dus $$0, ddo $$1, jf $$2) {
      return 1.0F;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(b) ? equ.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      return this.n().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == equ.c));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   public cvs a(@Nullable cnx $$0, dek $$1, jf $$2, dus $$3) {
      return $$0 != null && $$0.f() ? doo.super.a($$0, $$1, $$2, $$3) : cvs.k;
   }

   @Override
   public boolean a(@Nullable cnx $$0, ddo $$1, jf $$2, dus $$3, eqs $$4) {
      return $$0 != null && $$0.f() ? doo.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
