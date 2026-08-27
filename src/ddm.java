import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddm extends cwy implements cws, dbf {
   public static final MapCodec<ddm> a = b(ddm::new);
   protected static final float b = 6.0F;
   protected static final eml c = cwp.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   protected ddm(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.d($$1, $$2, ic.b) && !$$0.a(cwr.kJ);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      return $$1.a(asl.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      djg $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return true;
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public eeq c_(djg $$0) {
      return eer.c.a(false);
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      djg $$4 = cwr.bx.o();
      djg $$5 = $$4.a(deu.d, dkc.a);
      hx $$6 = $$2.c();
      if ($$0.a_($$6).a(cwr.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cfh $$0, csu $$1, hx $$2, djg $$3, eep $$4) {
      return false;
   }

   @Override
   public boolean a(ctp $$0, hx $$1, djg $$2, eeq $$3) {
      return false;
   }
}
