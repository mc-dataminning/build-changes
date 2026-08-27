import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class eys {
   private static final int a = -1;
   private final ip<eyr> b = new ip<>(32);
   private final Map<cys, Set<dmm<?>>> c = Maps.newHashMap();

   public static eys a() {
      eys $$0 = new eys();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fvf.a($$1, $$0x.c(dba.b) == dmf.a ? $$2.d() : $$2) : cvp.a(), cyu.iI, cyu.iH);
      $$0.a(dba.b, cyu.iI, cyu.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fvf.a($$1, $$2) : cvp.a(), cyu.i, cyu.bu, cyu.bt, cyu.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fvf.a($$1, $$2) : cvp.a();
         } else {
            return -1;
         }
      }, cyu.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> cvl.a(), cyu.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cvl.b(), cyu.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fvf.b($$1, $$2) : cvl.c(), cyu.aE, cyu.aH, cyu.aI, cyu.aK, cyu.ff, cyu.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fvf.c($$1, $$2) : -1, cyu.G, cyu.nd, cyu.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> det.b($$0x.c(det.f)), cyu.cw);
      $$0.a(det.f, cyu.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fvf.a($$1, $$2) : -1, cyu.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cyu.fc, cyu.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dgn.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cyu.fe, cyu.fd);
      $$0.a(dgn.c, cyu.fe, cyu.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cyu.fm);
      return $$0;
   }

   public int a(dlj $$0, cvr $$1, hz $$2) {
      eyr $$3 = this.b.a(kf.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eha $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dlj $$0, @Nullable cuu $$1, @Nullable hz $$2, int $$3) {
      eyr $$4 = this.b.a(kf.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(eyr $$0, cys... $$1) {
      for (cys $$2 : $$1) {
         this.b.a($$0, kf.e.a($$2));
      }
   }

   private void a(Set<dmm<?>> $$0, cys... $$1) {
      for (cys $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dmm<?> $$0, cys... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dmm<?>> a(cys $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
