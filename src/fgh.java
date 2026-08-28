import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fgh {
   private static final int a = -1;
   private final jo<fgg> b = new jo<>(32);
   private final Map<dey, Set<dte<?>>> c = Maps.newHashMap();

   public static fgh a() {
      fgh $$0 = new fgh();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcz.a($$1, $$0x.c(dhg.b) == dsx.a ? $$2.d() : $$2) : dbv.a(), dfa.iI, dfa.iH);
      $$0.a(dhg.b, dfa.iI, dfa.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcz.a($$1, $$2) : dbv.a(), dfa.i, dfa.bu, dfa.bt, dfa.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gcz.a($$1, $$2) : dbv.a();
         } else {
            return -1;
         }
      }, dfa.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbr.a(), dfa.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbr.b(), dfa.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcz.b($$1, $$2) : dbr.c(), dfa.aE, dfa.aH, dfa.aI, dfa.aK, dfa.ff, dfa.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcz.c($$1, $$2) : -1, dfa.G, dfa.nd, dfa.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dla.b($$0x.c(dla.f)), dfa.cw);
      $$0.a(dla.f, dfa.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcz.a($$1, $$2) : -1, dfa.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dfa.fc, dfa.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dmu.c);
         return ayi.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dfa.fe, dfa.fd);
      $$0.a(dmu.c, dfa.fe, dfa.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dfa.fm);
      return $$0;
   }

   public int a(dsb $$0, dbx $$1, iz $$2) {
      fgg $$3 = this.b.a(lp.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eny $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dsb $$0, @Nullable dba $$1, @Nullable iz $$2, int $$3) {
      fgg $$4 = this.b.a(lp.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fgg $$0, dey... $$1) {
      for (dey $$2 : $$1) {
         this.b.a($$0, lp.e.a($$2));
      }
   }

   private void a(Set<dte<?>> $$0, dey... $$1) {
      for (dey $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dte<?> $$0, dey... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dte<?>> a(dey $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
