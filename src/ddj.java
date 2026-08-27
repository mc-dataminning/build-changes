import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddj extends cwc implements ddq {
   public static final MapCodec<ddj> a = b(ddj::new);
   public static final djy b = djx.F;
   public static final djy c = djx.C;
   public static final djy d = djx.G;
   protected static final emm e = cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ic.a.b);

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   public ddj(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, blv $$3) {
      if ($$0 instanceof and $$4) {
         ane $$5 = dic.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dgx.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if ($$1 instanceof and $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dgx.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dgx.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return e;
   }

   @Override
   public emm f(djh $$0, csv $$1, hx $$2) {
      return e;
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dic($$0, $$1);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ees.c));
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, cmy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bjd.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return !$$0.B ? cwc.a($$2, dgx.L, ($$0x, $$1x, $$2x, $$3) -> doa.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }
}
