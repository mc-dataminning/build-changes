import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyd extends cwc implements ddq {
   public static final MapCodec<cyd> a = b(cyd::new);
   public static final djy b = djx.C;
   private static final int d = 3;
   protected static final emm c = cwq.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cyd> a() {
      return a;
   }

   public cyd(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$2, dgx.z, $$0.B ? dhh::a : dhh::b);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.b;
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(b) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof dgq) {
            ((dgq)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(asm.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
