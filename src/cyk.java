import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class cyk extends czz implements cvd, dca {
   public static final MapCodec<cyk> a = b(cyk::new);
   private static final dhz c = dhy.C;
   private final daa d = new daa(this);

   @Override
   public MapCodec<cyk> a() {
      return a;
   }

   public cyk(dhh.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dhi> b(int $$0) {
      return $$1 -> czz.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      return !$$1.n().a(clm.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return hx.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(c) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return $$0.u().c();
   }

   @Override
   public daa c() {
      return this.d;
   }
}
