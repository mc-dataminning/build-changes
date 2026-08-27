import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class erq {
   private static final int a = -1;
   private final hk<erp> b = new hk<>(32);
   private final Map<ctc, Set<dgg<?>>> c = Maps.newHashMap();

   public static erq a() {
      erq $$0 = new erq();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnm.a($$1, $$0x.c(cvi.b) == dfz.a ? $$2.d() : $$2) : cpz.a(), cte.iI, cte.iH);
      $$0.a(cvi.b, cte.iI, cte.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnm.a($$1, $$2) : cpz.a(), cte.i, cte.bu, cte.bt, cte.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fnm.a($$1, $$2) : cpz.a();
         } else {
            return -1;
         }
      }, cte.rA);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpv.a(), cte.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpv.b(), cte.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnm.b($$1, $$2) : cpv.c(), cte.aE, cte.aH, cte.aI, cte.aK, cte.ff, cte.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnm.c($$1, $$2) : -1, cte.G, cte.nd, cte.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> czc.b($$0x.c(czc.f)), cte.cw);
      $$0.a(czc.f, cte.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnm.a($$1, $$2) : -1, cte.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cte.fc, cte.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(daw.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cte.fe, cte.fd);
      $$0.a(daw.c, cte.fe, cte.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cte.fm);
      return $$0;
   }

   public int a(dfd $$0, cqb $$1, gw $$2) {
      erp $$3 = this.b.a(jb.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eak $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dfd $$0, @Nullable cpe $$1, @Nullable gw $$2, int $$3) {
      erp $$4 = this.b.a(jb.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(erp $$0, ctc... $$1) {
      for (ctc $$2 : $$1) {
         this.b.a($$0, jb.f.a($$2));
      }
   }

   private void a(Set<dgg<?>> $$0, ctc... $$1) {
      for (ctc $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dgg<?> $$0, ctc... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dgg<?>> a(ctc $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
