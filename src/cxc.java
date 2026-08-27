import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxc extends cwj {
   public static final MapCodec<cxc> a = b(cxc::new);
   private static final vd b = vd.c("container.cartography_table");

   @Override
   public MapCodec<cxc> a() {
      return a;
   }

   protected cxc(diz.d $$0) {
      super($$0);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arw.aw);
         return bjv.b;
      }
   }

   @Nullable
   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      return new bke(($$2x, $$3, $$4) -> new cia($$2x, $$3, cif.a($$1, $$2)), b);
   }
}
