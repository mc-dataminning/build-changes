import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dev extends cyy implements dbg {
   public static final MapCodec<dev> c = b(dev::new);
   public static final dkf<dkd> d = cyy.b;
   protected static final float e = 6.0F;
   protected static final emm f = cwq.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dev> a() {
      return c;
   }

   public dev(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return f;
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.d($$1, $$2, ic.b) && !$$0.a(cws.kJ);
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(cws.bw);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = super.a($$0);
      if ($$1 != null) {
         eer $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(asm.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      if ($$0.c(d) == dkd.a) {
         djh $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dkd.b;
      } else {
         eer $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(asm.a) && $$4.e() == 8;
      }
   }

   @Override
   public eer c_(djh $$0) {
      return ees.c.a(false);
   }

   @Override
   public boolean a(@Nullable cfi $$0, csv $$1, hx $$2, djh $$3, eeq $$4) {
      return false;
   }

   @Override
   public boolean a(ctq $$0, hx $$1, djh $$2, eer $$3) {
      return false;
   }
}
