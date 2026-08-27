import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fhn {
   private static final int a = -1;
   private final jg<fhm> b = new jg<>(32);
   private final Map<dfc, Set<duf<?>>> c = Maps.newHashMap();

   public static fhn a() {
      fhn $$0 = new fhn();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ges.a($$1, $$0x.c(dhl.b) == dty.a ? $$2.d() : $$2) : dby.a(), dfe.jC, dfe.jB);
      $$0.a(dhl.b, dfe.jC, dfe.jB);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ges.a($$1, $$2) : dby.a(), dfe.j, dfe.ce, dfe.cd, dfe.gU);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? ges.a($$1, $$2) : dby.a();
         } else {
            return -1;
         }
      }, dfe.tY);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbu.a(), dfe.bn);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbu.b(), dfe.bo);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ges.b($$1, $$2) : dbu.c(), dfe.tH, dfe.bm, dfe.bp, dfe.bq, dfe.bs, dfe.fX, dfe.bt);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ges.c($$1, $$2) : -1, dfe.al, dfe.ob, dfe.gm);
      $$0.a(($$0x, $$1, $$2, $$3) -> dls.b($$0x.c(dls.f)), dfe.dh);
      $$0.a(dls.f, dfe.dh);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ges.a($$1, $$2) : -1, dfe.eG);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dfe.fU, dfe.fT);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dnm.c);
         return axw.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dfe.fW, dfe.fV);
      $$0.a(dnm.c, dfe.fW, dfe.fV);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dfe.ge);
      return $$0;
   }

   public int a(dtc $$0, dca $$1, ir $$2) {
      fhm $$3 = this.b.a(lh.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         epi $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.al : -1;
      }
   }

   public int a(dtc $$0, @Nullable dbd $$1, @Nullable ir $$2, int $$3) {
      fhm $$4 = this.b.a(lh.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fhm $$0, dfc... $$1) {
      for (dfc $$2 : $$1) {
         this.b.a($$0, lh.e.a($$2));
      }
   }

   private void a(Set<duf<?>> $$0, dfc... $$1) {
      for (dfc $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(duf<?> $$0, dfc... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<duf<?>> a(dfc $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
