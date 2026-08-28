import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends dey {
   public static final MapCodec<dmv> a = b(dmv::new);
   private static final xo d = xo.c("container.stonecutter");
   public static final dsv b = diu.aE;
   protected static final ewj c = dey.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.ay);
         return bqt.c;
      }
   }

   @Nullable
   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      return new brd(($$2x, $$3, $$4) -> new cru($$2x, $$3, cqe.a($$1, $$2)), d);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
