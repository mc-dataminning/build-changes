import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddg extends cws implements cwm, daz {
   public static final MapCodec<ddg> a = b(ddg::new);
   protected static final float b = 6.0F;
   protected static final emf c = cwj.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   protected ddg(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.d($$1, $$2, ic.b) && !$$0.a(cwl.kJ);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      return $$1.a(asg.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      dja $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return true;
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public eek c_(dja $$0) {
      return eel.c.a(false);
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      dja $$4 = cwl.bx.o();
      dja $$5 = $$4.a(deo.d, djw.a);
      hx $$6 = $$2.c();
      if ($$0.a_($$6).a(cwl.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cfb $$0, cso $$1, hx $$2, dja $$3, eej $$4) {
      return false;
   }

   @Override
   public boolean a(ctj $$0, hx $$1, dja $$2, eek $$3) {
      return false;
   }
}
