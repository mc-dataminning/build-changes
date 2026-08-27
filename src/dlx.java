import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlx extends dea {
   public static final MapCodec<dlx> a = b(dlx::new);
   private static final wx d = wx.c("container.stonecutter");
   public static final drx b = dhw.aE;
   protected static final evf c = dea.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   public dlx(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c));
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avs.ay);
         return bpw.b;
      }
   }

   @Nullable
   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      return new bqg(($$2x, $$3, $$4) -> new cqw($$2x, $$3, cpg.a($$1, $$2)), d);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
