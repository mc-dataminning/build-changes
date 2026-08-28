import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhw extends dic {
   public static final MapCodec<dhw> a = b(dhw::new);
   public static final dws<jm> b = dwl.P;
   public static final dwm c = dwl.u;

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public dhw(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$1 instanceof arp $$5 && $$1.c_($$2) instanceof dsr $$6) {
         $$3.a($$6);
         $$3.a(awx.ar);
         cnj.a($$5, $$3, true);
      }

      return bsk.a;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      dsy $$4 = $$1.c_($$2);
      if ($$4 instanceof dsr) {
         ((dsr)$$4).k();
      }
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dsr($$0, $$1);
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return crz.a($$1.c_($$2));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
