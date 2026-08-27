import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class ddf extends cys implements dfs {
   public static final MapCodec<ddf> a = b(ddf::new);
   public static final int b = 15;
   public static final dmj c = dlz.aP;
   public static final dma d = dlz.C;
   public static final ToIntFunction<dlj> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   public ddf(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if (!$$1.B && $$3.gq()) {
         $$1.a($$2, $$0.a(c), 2);
         return blw.a;
      } else {
         return blw.b;
      }
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return $$3.a(cpg.hB) ? eop.b() : eop.a();
   }

   @Override
   protected boolean a_(dlj $$0, cux $$1, hz $$2) {
      return true;
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.a;
   }

   @Override
   protected float d(dlj $$0, cux $$1, hz $$2) {
      return 1.0F;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(d) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cpd a(cpd $$0, int $$1) {
      if ($$1 != 15) {
         sw $$2 = new sw();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
