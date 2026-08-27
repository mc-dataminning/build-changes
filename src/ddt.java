import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddt extends cyx implements cws, ddp {
   public static final MapCodec<ddt> c = b(ddt::new);
   private static final djx g = djw.C;
   public static final dka d = djw.R;
   protected static final float e = 6.0F;
   protected static final eml f = cwp.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<ddt> a() {
      return c;
   }

   public ddt(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkc.b).a(g, Boolean.valueOf(false)).a(d, ic.c));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return f;
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(asg.bw) || $$1.b_($$2.c()).a(eer.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if (!$$0.y_()) {
         hx $$5 = $$1.c();
         djg $$6 = cyx.c($$0, $$5, this.o().a(b, dkc.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(g) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      if ($$0.c(b) == dkc.a) {
         return super.a($$0, $$1, $$2);
      } else {
         hx $$3 = $$2.d();
         djg $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, g, d);
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
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      if ($$3.c(cyx.b) == dkc.b) {
         hx $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cwm.a($$0, $$1, $$2, $$3.c(d));
      } else {
         hx $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float av_() {
      return 0.1F;
   }
}
