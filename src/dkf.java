import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dkf extends dlv implements dgy, dnx {
   public static final MapCodec<dkf> a = b(dkf::new);
   private static final dur c = duq.C;
   private final dlw d = new dlw(this);

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dua> b(int $$0) {
      return $$1 -> dlv.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, cyw $$1) {
      return !$$1.n().a(cvo.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return jj.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dua $$0) {
      return $$0.y().c();
   }

   @Override
   public dlw c() {
      return this.d;
   }
}
