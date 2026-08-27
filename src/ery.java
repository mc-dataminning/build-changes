import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ery {
   private static final int a = -1;
   private final hm<erx> b = new hm<>(32);
   private final Map<csx, Set<dgo<?>>> c = Maps.newHashMap();

   public static ery a() {
      ery $$0 = new ery();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fns.a($$1, $$0x.c(cvb.a) == dgh.a ? $$2.d() : $$2) : cpv.a(), csy.iI, csy.iH);
      $$0.a(cvb.a, csy.iI, csy.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fns.a($$1, $$2) : cpv.a(), csy.i, csy.bu, csy.bt, csy.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fns.a($$1, $$2) : cpv.a();
         } else {
            return -1;
         }
      }, csy.rA);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpr.a(), csy.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpr.b(), csy.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fns.b($$1, $$2) : cpr.c(), csy.aE, csy.aH, csy.aI, csy.aK, csy.ff, csy.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fns.c($$1, $$2) : -1, csy.G, csy.nd, csy.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> cyy.b($$0x.c(cyy.e)), csy.cw);
      $$0.a(cyy.e, csy.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fns.a($$1, $$2) : -1, csy.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, csy.fc, csy.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dat.b);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, csy.fe, csy.fd);
      $$0.a(dat.b, csy.fe, csy.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, csy.fm);
      return $$0;
   }

   public int a(dfl $$0, cpx $$1, gw $$2) {
      erx $$3 = this.b.a(jd.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eas $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dfl $$0, @Nullable cpa $$1, @Nullable gw $$2, int $$3) {
      erx $$4 = this.b.a(jd.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(erx $$0, csx... $$1) {
      for (csx $$2 : $$1) {
         this.b.a($$0, jd.f.a($$2));
      }
   }

   private void a(Set<dgo<?>> $$0, csx... $$1) {
      for (csx $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dgo<?> $$0, csx... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dgo<?>> a(csx $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
