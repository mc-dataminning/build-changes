import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnc extends dff {
   public static final MapCodec<dnc> a = b(dnc::new);
   private static final wu d = wu.c("container.stonecutter");
   public static final dtb b = djb.aE;
   protected static final ews c = dff.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avp.ay);
         return bqd.c;
      }
   }

   @Nullable
   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      return new bqn(($$2x, $$3, $$4) -> new crg($$2x, $$3, cpq.a($$1, $$2)), d);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
