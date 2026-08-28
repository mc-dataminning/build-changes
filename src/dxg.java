import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dxg extends djp {
   public static final MapCodec<dxg> a = b(dxg::new);
   public static final dyl<jm> b = dxi.a;
   public static final dyl<dyp> c = dxi.c;

   @Override
   public MapCodec<dxg> a() {
      return a;
   }

   public dxg(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dyp.a));
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return null;
   }

   public static duq a(jh $$0, dxo $$1, dxo $$2, jm $$3, boolean $$4, boolean $$5) {
      return new dxk($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.l, dxk::a);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         duq $$5 = $$1.c_($$2);
         if ($$5 instanceof dxk) {
            ((dxk)$$5).k();
         }
      }
   }

   @Override
   public void a(dha $$0, jh $$1, dxo $$2) {
      jh $$3 = $$1.a($$2.c(b).g());
      dxo $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dxh && $$4.c(dxh.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bta.c;
      } else {
         return bta.e;
      }
   }

   @Override
   protected List<cxg> a(dxo $$0, ewl.a $$1) {
      dxk $$2 = this.a($$1.a(), jh.a($$1.a(ezc.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return fci.a();
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      dxk $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fci.a();
   }

   @Nullable
   private dxk a(dge $$0, jh $$1) {
      duq $$2 = $$0.c_($$1);
      return $$2 instanceof dxk ? (dxk)$$2 : null;
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return cxg.j;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
