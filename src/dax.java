import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dax extends ctc {
   public static final MapCodec<dax> a = b(dax::new);
   private static final tl d = tl.c("container.stonecutter");
   public static final dfx b = cww.aE;
   protected static final eia c = ctc.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dax> a() {
      return a;
   }

   public dax(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c));
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apq.ay);
         return bhe.b;
      }
   }

   @Nullable
   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      return new bhm(($$2x, $$3, $$4) -> new cgn($$2x, $$3, cfc.a($$1, $$2)), d);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
