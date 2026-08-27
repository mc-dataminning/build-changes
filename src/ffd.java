import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ffd {
   private static final int a = -1;
   private final jd<ffc> b = new jd<>(32);
   private final Map<ddy, Set<dse<?>>> c = Maps.newHashMap();

   public static ffd a() {
      ffd $$0 = new ffd();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.a($$1, $$0x.c(dgg.b) == drx.a ? $$2.d() : $$2) : dav.a(), dea.iI, dea.iH);
      $$0.a(dgg.b, dea.iI, dea.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.a($$1, $$2) : dav.a(), dea.i, dea.bu, dea.bt, dea.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gbw.a($$1, $$2) : dav.a();
         } else {
            return -1;
         }
      }, dea.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dar.a(), dea.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dar.b(), dea.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.b($$1, $$2) : dar.c(), dea.aE, dea.aH, dea.aI, dea.aK, dea.ff, dea.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.c($$1, $$2) : -1, dea.G, dea.nd, dea.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dka.b($$0x.c(dka.f)), dea.cw);
      $$0.a(dka.f, dea.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.a($$1, $$2) : -1, dea.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dea.fc, dea.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dlu.c);
         return axo.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dea.fe, dea.fd);
      $$0.a(dlu.c, dea.fe, dea.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dea.fm);
      return $$0;
   }

   public int a(drb $$0, dax $$1, io $$2) {
      ffc $$3 = this.b.a(le.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         emy $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(drb $$0, @Nullable daa $$1, @Nullable io $$2, int $$3) {
      ffc $$4 = this.b.a(le.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(ffc $$0, ddy... $$1) {
      for (ddy $$2 : $$1) {
         this.b.a($$0, le.e.a($$2));
      }
   }

   private void a(Set<dse<?>> $$0, ddy... $$1) {
      for (ddy $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dse<?> $$0, ddy... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dse<?>> a(ddy $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
