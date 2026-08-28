import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fjn {
   private static final int a = -1;
   private final jt<fjm> b = new jt<>(32);
   private final Map<dhj, Set<dvr<?>>> c = Maps.newHashMap();

   public static fjn a() {
      fjn $$0 = new fjn();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggm.a($$1, $$0x.c(djr.b) == dvk.a ? $$2.e() : $$2) : dee.a(), dhl.iI, dhl.iH);
      $$0.a(djr.b, dhl.iI, dhl.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggm.a($$1, $$2) : dee.a(), dhl.i, dhl.bu, dhl.bt, dhl.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? ggm.a($$1, $$2) : dee.a();
         } else {
            return -1;
         }
      }, dhl.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dea.a(), dhl.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dea.b(), dhl.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggm.b($$1, $$2) : dea.c(), dhl.aE, dhl.aH, dhl.aI, dhl.aK, dhl.ff, dhl.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggm.c($$1, $$2) : -1, dhl.G, dhl.nd, dhl.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dnm.b($$0x.c(dnm.f)), dhl.cw);
      $$0.a(dnm.f, dhl.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggm.a($$1, $$2) : -1, dhl.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dhl.fc, dhl.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dpg.c);
         return axo.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dhl.fe, dhl.fd);
      $$0.a(dpg.c, dhl.fe, dhl.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dhl.fm);
      return $$0;
   }

   public int a(duo $$0, deg $$1, je $$2) {
      fjm $$3 = this.b.a(lu.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eqt $$4 = $$0.a((ddl)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(duo $$0, @Nullable ddi $$1, @Nullable je $$2, int $$3) {
      fjm $$4 = this.b.a(lu.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fjm $$0, dhj... $$1) {
      for (dhj $$2 : $$1) {
         this.b.a($$0, lu.e.a($$2));
      }
   }

   private void a(Set<dvr<?>> $$0, dhj... $$1) {
      for (dhj $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dvr<?> $$0, dhj... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dvr<?>> a(dhj $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
