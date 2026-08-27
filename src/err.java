import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class err {
   private static final int a = -1;
   private final hm<erq> b = new hm<>(32);
   private final Map<csq, Set<dgh<?>>> c = Maps.newHashMap();

   public static err a() {
      err $$0 = new err();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnl.a($$1, $$0x.c(cuu.a) == dga.a ? $$2.d() : $$2) : cpo.a(), csr.iI, csr.iH);
      $$0.a(cuu.a, csr.iI, csr.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnl.a($$1, $$2) : cpo.a(), csr.i, csr.bu, csr.bt, csr.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fnl.a($$1, $$2) : cpo.a();
         } else {
            return -1;
         }
      }, csr.rA);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpk.a(), csr.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpk.b(), csr.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnl.b($$1, $$2) : cpk.c(), csr.aE, csr.aH, csr.aI, csr.aK, csr.ff, csr.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnl.c($$1, $$2) : -1, csr.G, csr.nd, csr.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> cyr.b($$0x.c(cyr.e)), csr.cw);
      $$0.a(cyr.e, csr.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnl.a($$1, $$2) : -1, csr.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, csr.fc, csr.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dam.b);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, csr.fe, csr.fd);
      $$0.a(dam.b, csr.fe, csr.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, csr.fm);
      return $$0;
   }

   public int a(dfe $$0, cpq $$1, gw $$2) {
      erq $$3 = this.b.a(jd.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eal $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dfe $$0, @Nullable cot $$1, @Nullable gw $$2, int $$3) {
      erq $$4 = this.b.a(jd.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(erq $$0, csq... $$1) {
      for (csq $$2 : $$1) {
         this.b.a($$0, jd.f.a($$2));
      }
   }

   private void a(Set<dgh<?>> $$0, csq... $$1) {
      for (csq $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dgh<?> $$0, csq... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dgh<?>> a(csq $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
