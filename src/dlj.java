import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dlj extends dgv implements dnx {
   public static final MapCodec<dlj> a = b(dlj::new);
   public static final int b = 15;
   public static final dva c = duq.aP;
   public static final dur d = duq.C;
   public static final ToIntFunction<dua> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return brk.b;
      } else {
         return brk.c;
      }
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return $$3.a(cvo.hC) ? eyu.b() : eyu.a();
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
      if ($$0.c(d)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(d) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cvl a(cvl $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kr.ae, cxw.a.a(c, $$1));
      }

      return $$0;
   }
}
