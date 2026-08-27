import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class euk {
   private static final int a = -1;
   private final im<euj> b = new im<>(32);
   private final Map<cvf, Set<diq<?>>> c = Maps.newHashMap();

   public static euk a() {
      euk $$0 = new euk();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fql.a($$1, $$0x.c(cxn.b) == dij.a ? $$2.d() : $$2) : csd.a(), cvh.iI, cvh.iH);
      $$0.a(cxn.b, cvh.iI, cvh.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fql.a($$1, $$2) : csd.a(), cvh.i, cvh.bu, cvh.bt, cvh.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fql.a($$1, $$2) : csd.a();
         } else {
            return -1;
         }
      }, cvh.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> crz.a(), cvh.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> crz.b(), cvh.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fql.b($$1, $$2) : crz.c(), cvh.aE, cvh.aH, cvh.aI, cvh.aK, cvh.ff, cvh.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fql.c($$1, $$2) : -1, cvh.G, cvh.nd, cvh.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbg.b($$0x.c(dbg.f)), cvh.cw);
      $$0.a(dbg.f, cvh.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fql.a($$1, $$2) : -1, cvh.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cvh.fc, cvh.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dda.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cvh.fe, cvh.fd);
      $$0.a(dda.c, cvh.fe, cvh.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cvh.fm);
      return $$0;
   }

   public int a(dhn $$0, csf $$1, hx $$2) {
      euj $$3 = this.b.a(kc.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         edb $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dhn $$0, @Nullable cri $$1, @Nullable hx $$2, int $$3) {
      euj $$4 = this.b.a(kc.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(euj $$0, cvf... $$1) {
      for (cvf $$2 : $$1) {
         this.b.a($$0, kc.f.a($$2));
      }
   }

   private void a(Set<diq<?>> $$0, cvf... $$1) {
      for (cvf $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(diq<?> $$0, cvf... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<diq<?>> a(cvf $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
