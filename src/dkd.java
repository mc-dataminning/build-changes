import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends dch {
   public static final MapCodec<dkd> a = b(dkd::new);
   private static final wi d = wi.c("container.stonecutter");
   public static final dqc b = dgc.aE;
   protected static final etc c = dch.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c));
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auz.ay);
         return bof.b;
      }
   }

   @Nullable
   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      return new bop(($$2x, $$3, $$4) -> new coy($$2x, $$3, cnh.a($$1, $$2)), d);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
