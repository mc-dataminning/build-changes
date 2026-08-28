import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dkt extends dmj implements dhm, dol {
   public static final MapCodec<dkt> a = b(dkt::new);
   private static final dvf c = dve.C;
   private final dmk d = new dmk(this);

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(dun.d $$0) {
      super($$0);
      this.l(this.o().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<duo> b(int $$0) {
      return $$1 -> dmj.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      return !$$1.n().a(cvt.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return jj.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(duo $$0) {
      return $$0.y().c();
   }

   @Override
   public dmk c() {
      return this.d;
   }
}
