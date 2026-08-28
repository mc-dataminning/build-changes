import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fgd {
   private static final int a = -1;
   private final jo<fgc> b = new jo<>(32);
   private final Map<deu, Set<dta<?>>> c = Maps.newHashMap();

   public static fgd a() {
      fgd $$0 = new fgd();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcv.a($$1, $$0x.c(dhc.b) == dst.a ? $$2.d() : $$2) : dbr.a(), dew.iI, dew.iH);
      $$0.a(dhc.b, dew.iI, dew.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcv.a($$1, $$2) : dbr.a(), dew.i, dew.bu, dew.bt, dew.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gcv.a($$1, $$2) : dbr.a();
         } else {
            return -1;
         }
      }, dew.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbn.a(), dew.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbn.b(), dew.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcv.b($$1, $$2) : dbn.c(), dew.aE, dew.aH, dew.aI, dew.aK, dew.ff, dew.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcv.c($$1, $$2) : -1, dew.G, dew.nd, dew.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dkw.b($$0x.c(dkw.f)), dew.cw);
      $$0.a(dkw.f, dew.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcv.a($$1, $$2) : -1, dew.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dew.fc, dew.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dmq.c);
         return aye.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dew.fe, dew.fd);
      $$0.a(dmq.c, dew.fe, dew.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dew.fm);
      return $$0;
   }

   public int a(drx $$0, dbt $$1, iz $$2) {
      fgc $$3 = this.b.a(lp.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         enu $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(drx $$0, @Nullable daw $$1, @Nullable iz $$2, int $$3) {
      fgc $$4 = this.b.a(lp.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fgc $$0, deu... $$1) {
      for (deu $$2 : $$1) {
         this.b.a($$0, lp.e.a($$2));
      }
   }

   private void a(Set<dta<?>> $$0, deu... $$1) {
      for (deu $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dta<?> $$0, deu... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dta<?>> a(deu $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
