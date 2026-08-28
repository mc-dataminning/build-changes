import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmw extends dez {
   public static final MapCodec<dmw> a = b(dmw::new);
   private static final xp d = xp.c("container.stonecutter");
   public static final dsw b = div.aE;
   protected static final ewk c = dez.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.ay);
         return bqu.c;
      }
   }

   @Nullable
   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      return new bre(($$2x, $$3, $$4) -> new crv($$2x, $$3, cqf.a($$1, $$2)), d);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return c;
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
