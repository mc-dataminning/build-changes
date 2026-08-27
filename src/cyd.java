import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyd extends cxn implements cyp {
   public static final MapCodec<cyd> c = b(cyd::new);

   @Override
   public MapCodec<cyd> a() {
      return c;
   }

   protected cyd(dga.d $$0) {
      super($$0, hx.b, eiv.b(), true);
   }

   @Override
   protected cxo c() {
      return (cxo)cuc.mc;
   }

   @Override
   public ebe c_(dgb $$0) {
      return ebf.c.a(false);
   }

   @Override
   protected boolean h(dgb $$0) {
      return this.c().h($$0);
   }

   @Override
   public boolean a(@Nullable ccx $$0, cqf $$1, ht $$2, dgb $$3, ebd $$4) {
      return false;
   }

   @Override
   public boolean a(cra $$0, ht $$1, dgb $$2, ebe $$3) {
      return false;
   }
}
