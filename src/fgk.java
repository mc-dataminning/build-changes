import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fgk {
   private static final int a = -1;
   private final jo<fgj> b = new jo<>(32);
   private final Map<dfb, Set<dth<?>>> c = Maps.newHashMap();

   public static fgk a() {
      fgk $$0 = new fgk();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdc.a($$1, $$0x.c(dhj.b) == dta.a ? $$2.d() : $$2) : dby.a(), dfd.iI, dfd.iH);
      $$0.a(dhj.b, dfd.iI, dfd.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdc.a($$1, $$2) : dby.a(), dfd.i, dfd.bu, dfd.bt, dfd.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gdc.a($$1, $$2) : dby.a();
         } else {
            return -1;
         }
      }, dfd.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbu.a(), dfd.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbu.b(), dfd.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdc.b($$1, $$2) : dbu.c(), dfd.aE, dfd.aH, dfd.aI, dfd.aK, dfd.ff, dfd.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdc.c($$1, $$2) : -1, dfd.G, dfd.nd, dfd.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dld.b($$0x.c(dld.f)), dfd.cw);
      $$0.a(dld.f, dfd.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdc.a($$1, $$2) : -1, dfd.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dfd.fc, dfd.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dmx.c);
         return ayj.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dfd.fe, dfd.fd);
      $$0.a(dmx.c, dfd.fe, dfd.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dfd.fm);
      return $$0;
   }

   public int a(dse $$0, dca $$1, iz $$2) {
      fgj $$3 = this.b.a(lp.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eob $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dse $$0, @Nullable dbd $$1, @Nullable iz $$2, int $$3) {
      fgj $$4 = this.b.a(lp.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fgj $$0, dfb... $$1) {
      for (dfb $$2 : $$1) {
         this.b.a($$0, lp.e.a($$2));
      }
   }

   private void a(Set<dth<?>> $$0, dfb... $$1) {
      for (dfb $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dth<?> $$0, dfb... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dth<?>> a(dfb $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
