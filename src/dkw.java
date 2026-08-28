import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dkw extends dmm implements dhp, doo {
   public static final MapCodec<dkw> a = b(dkw::new);
   private static final dvj c = dvi.C;
   private final dmn d = new dmn(this);

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   public dkw(dur.d $$0) {
      super($$0);
      this.l(this.n().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dus> b(int $$0) {
      return $$1 -> dmm.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      return !$$1.n().a(cvw.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return jk.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dus $$0) {
      return $$0.y().c();
   }

   @Override
   public dmn c() {
      return this.d;
   }
}
