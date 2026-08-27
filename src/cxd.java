import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxd extends csq implements csw {
   public static final dge a = dfu.aP;
   protected final eaf b;
   private final List<eah> e;
   public static final eib c = csq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<hc> d = ImmutableList.of(hc.a, hc.d, hc.c, hc.f, hc.e);

   protected cxd(eaf $$0, dfd.d $$1) {
      super($$1);
      this.b = $$0;
      this.e = Lists.newArrayList();
      this.e.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.e.add($$0.a(8 - $$2, false));
      }

      this.e.add($$0.a(8, true));
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return $$3.a(c, $$2, true) && $$0.c(a) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? c : ehy.a();
   }

   @Override
   public boolean e_(dfe $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dfe $$0, cow $$1, gw $$2) {
      return false;
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return !this.b.a(apt.b);
   }

   @Override
   public eah c_(dfe $$0) {
      int $$1 = $$0.c(a);
      return this.e.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dfe $$0, dfe $$1, hc $$2) {
      return $$1.u().a().a(this.b);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.a;
   }

   @Override
   public List<cja> a(dfe $$0, ecr.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return ehy.a();
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpt)$$1));
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.b.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpt)$$1));
      }
   }

   private boolean a(cpq $$0, gw $$1, dfe $$2) {
      if (this.b.a(apt.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(csr.dY);
         UnmodifiableIterator var5 = d.iterator();

         while (var5.hasNext()) {
            hc $$4 = (hc)var5.next();
            gw $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(apt.a)) {
               csq $$6 = $$0.b_($$1).b() ? csr.co : csr.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(csr.mW)) {
               $$0.b($$1, csr.dZ.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cpr $$0, gw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public cja a(@Nullable cbp $$0, cpr $$1, gw $$2, dfe $$3) {
      if ($$3.c(a) == 0) {
         $$1.a($$2, csr.a.n(), 11);
         return new cja(this.b.a());
      } else {
         return cja.b;
      }
   }

   @Override
   public Optional<aoy> al_() {
      return this.b.j();
   }
}
