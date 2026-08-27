import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxi extends csv implements ctb {
   public static final dgj a = dfz.aP;
   protected final eak b;
   private final List<eam> e;
   public static final eig c = csv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ha> d = ImmutableList.of(ha.a, ha.d, ha.c, ha.f, ha.e);

   protected cxi(eak $$0, dfi.d $$1) {
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
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return $$3.a(c, $$2, true) && $$0.c(a) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? c : eid.a();
   }

   @Override
   public boolean e_(dfj $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dfj $$0, cpb $$1, gw $$2) {
      return false;
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return !this.b.a(apx.b);
   }

   @Override
   public eam c_(dfj $$0) {
      int $$1 = $$0.c(a);
      return this.e.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dfj $$0, dfj $$1, ha $$2) {
      return $$1.u().a().a(this.b);
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.a;
   }

   @Override
   public List<cjf> a(dfj $$0, ecw.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return eid.a();
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpy)$$1));
      }
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.b.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpy)$$1));
      }
   }

   private boolean a(cpv $$0, gw $$1, dfj $$2) {
      if (this.b.a(apx.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(csw.dY);
         UnmodifiableIterator var5 = d.iterator();

         while (var5.hasNext()) {
            ha $$4 = (ha)var5.next();
            gw $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(apx.a)) {
               csv $$6 = $$0.b_($$1).b() ? csw.co : csw.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(csw.mW)) {
               $$0.b($$1, csw.dZ.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cpw $$0, gw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public cjf a(@Nullable cbu $$0, cpw $$1, gw $$2, dfj $$3) {
      if ($$3.c(a) == 0) {
         $$1.a($$2, csw.a.n(), 11);
         return new cjf(this.b.a());
      } else {
         return cjf.b;
      }
   }

   @Override
   public Optional<apc> aq_() {
      return this.b.j();
   }
}
