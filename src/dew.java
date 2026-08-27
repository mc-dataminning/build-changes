import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dew extends csd {
   public static final dfy a = dey.a;
   public static final dgc<dgg> b = dey.b;

   public dew(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, dgg.a));
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return null;
   }

   public static dcq a(gw $$0, dfe $$1, dfe $$2, hc $$3, boolean $$4, boolean $$5) {
      return new dfa($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.k, dfa::a);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcq $$5 = $$1.c_($$2);
         if ($$5 instanceof dfa) {
            ((dfa)$$5).j();
         }
      }
   }

   @Override
   public void a(cpr $$0, gw $$1, dfe $$2) {
      gw $$3 = $$1.a($$2.c(a).g());
      dfe $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dex && $$4.c(dex.b)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bgt.b;
      } else {
         return bgt.d;
      }
   }

   @Override
   public List<cja> a(dfe $$0, ecr.a $$1) {
      dfa $$2 = this.a($$1.a(), gw.a($$1.a(eew.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return ehy.a();
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      dfa $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ehy.a();
   }

   @Nullable
   private dfa a(cow $$0, gw $$1) {
      dcq $$2 = $$0.c_($$1);
      return $$2 instanceof dfa ? (dfa)$$2 : null;
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return cja.b;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
