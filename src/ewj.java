import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ewj {
   private static final int a = -1;
   private final in<ewi> b = new in<>(32);
   private final Map<cwp, Set<dkj<?>>> c = Maps.newHashMap();

   public static ewj a() {
      ewj $$0 = new ewj();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsr.a($$1, $$0x.c(cyx.b) == dkc.a ? $$2.d() : $$2) : ctm.a(), cwr.iI, cwr.iH);
      $$0.a(cyx.b, cwr.iI, cwr.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsr.a($$1, $$2) : ctm.a(), cwr.i, cwr.bu, cwr.bt, cwr.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fsr.a($$1, $$2) : ctm.a();
         } else {
            return -1;
         }
      }, cwr.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> cti.a(), cwr.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cti.b(), cwr.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsr.b($$1, $$2) : cti.c(), cwr.aE, cwr.aH, cwr.aI, cwr.aK, cwr.ff, cwr.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsr.c($$1, $$2) : -1, cwr.G, cwr.nd, cwr.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dcq.b($$0x.c(dcq.f)), cwr.cw);
      $$0.a(dcq.f, cwr.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsr.a($$1, $$2) : -1, cwr.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cwr.fc, cwr.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dek.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cwr.fe, cwr.fd);
      $$0.a(dek.c, cwr.fe, cwr.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cwr.fm);
      return $$0;
   }

   public int a(djg $$0, cto $$1, hx $$2) {
      ewi $$3 = this.b.a(kd.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eeu $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(djg $$0, @Nullable csr $$1, @Nullable hx $$2, int $$3) {
      ewi $$4 = this.b.a(kd.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(ewi $$0, cwp... $$1) {
      for (cwp $$2 : $$1) {
         this.b.a($$0, kd.e.a($$2));
      }
   }

   private void a(Set<dkj<?>> $$0, cwp... $$1) {
      for (cwp $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dkj<?> $$0, cwp... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dkj<?>> a(cwp $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
