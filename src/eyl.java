import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class eyl {
   private static final int a = -1;
   private final ip<eyk> b = new ip<>(32);
   private final Map<cyo, Set<dmi<?>>> c = Maps.newHashMap();

   public static eyl a() {
      eyl $$0 = new eyl();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fuy.a($$1, $$0x.c(daw.b) == dmb.a ? $$2.d() : $$2) : cvl.a(), cyq.iI, cyq.iH);
      $$0.a(daw.b, cyq.iI, cyq.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fuy.a($$1, $$2) : cvl.a(), cyq.i, cyq.bu, cyq.bt, cyq.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fuy.a($$1, $$2) : cvl.a();
         } else {
            return -1;
         }
      }, cyq.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> cvh.a(), cyq.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cvh.b(), cyq.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fuy.b($$1, $$2) : cvh.c(), cyq.aE, cyq.aH, cyq.aI, cyq.aK, cyq.ff, cyq.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fuy.c($$1, $$2) : -1, cyq.G, cyq.nd, cyq.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dep.b($$0x.c(dep.f)), cyq.cw);
      $$0.a(dep.f, cyq.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fuy.a($$1, $$2) : -1, cyq.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cyq.fc, cyq.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dgj.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cyq.fe, cyq.fd);
      $$0.a(dgj.c, cyq.fe, cyq.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cyq.fm);
      return $$0;
   }

   public int a(dlf $$0, cvn $$1, hz $$2) {
      eyk $$3 = this.b.a(kf.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         egt $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dlf $$0, @Nullable cuq $$1, @Nullable hz $$2, int $$3) {
      eyk $$4 = this.b.a(kf.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(eyk $$0, cyo... $$1) {
      for (cyo $$2 : $$1) {
         this.b.a($$0, kf.e.a($$2));
      }
   }

   private void a(Set<dmi<?>> $$0, cyo... $$1) {
      for (cyo $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dmi<?> $$0, cyo... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dmi<?>> a(cyo $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
