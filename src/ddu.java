import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddu extends cyy implements cwt, ddq {
   public static final MapCodec<ddu> c = b(ddu::new);
   private static final djy g = djx.C;
   public static final dkb d = djx.R;
   protected static final float e = 6.0F;
   protected static final emm f = cwq.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<ddu> a() {
      return c;
   }

   public ddu(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkd.b).a(g, Boolean.valueOf(false)).a(d, ic.c));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return f;
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(ash.bw) || $$1.b_($$2.c()).a(ees.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if (!$$0.y_()) {
         hx $$5 = $$1.c();
         djh $$6 = cyy.c($$0, $$5, this.o().a(b, dkd.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(g) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      if ($$0.c(b) == dkd.a) {
         return super.a($$0, $$1, $$2);
      } else {
         hx $$3 = $$2.d();
         djh $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return true;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      if ($$3.c(cyy.b) == dkd.b) {
         hx $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cwn.a($$0, $$1, $$2, $$3.c(d));
      } else {
         hx $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float av_() {
      return 0.1F;
   }
}
