import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ewv {
   private static final int a = -1;
   private final in<ewu> b = new in<>(32);
   private final Map<cwy, Set<dks<?>>> c = Maps.newHashMap();

   public static ewv a() {
      ewv $$0 = new ewv();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ftf.a($$1, $$0x.c(czg.b) == dkl.a ? $$2.d() : $$2) : ctv.a(), cxa.iI, cxa.iH);
      $$0.a(czg.b, cxa.iI, cxa.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ftf.a($$1, $$2) : ctv.a(), cxa.i, cxa.bu, cxa.bt, cxa.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? ftf.a($$1, $$2) : ctv.a();
         } else {
            return -1;
         }
      }, cxa.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> ctr.a(), cxa.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> ctr.b(), cxa.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ftf.b($$1, $$2) : ctr.c(), cxa.aE, cxa.aH, cxa.aI, cxa.aK, cxa.ff, cxa.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ftf.c($$1, $$2) : -1, cxa.G, cxa.nd, cxa.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dcz.b($$0x.c(dcz.f)), cxa.cw);
      $$0.a(dcz.f, cxa.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ftf.a($$1, $$2) : -1, cxa.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cxa.fc, cxa.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(det.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cxa.fe, cxa.fd);
      $$0.a(det.c, cxa.fe, cxa.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cxa.fm);
      return $$0;
   }

   public int a(djp $$0, ctx $$1, hx $$2) {
      ewu $$3 = this.b.a(kd.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         efd $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(djp $$0, @Nullable cta $$1, @Nullable hx $$2, int $$3) {
      ewu $$4 = this.b.a(kd.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(ewu $$0, cwy... $$1) {
      for (cwy $$2 : $$1) {
         this.b.a($$0, kd.e.a($$2));
      }
   }

   private void a(Set<dks<?>> $$0, cwy... $$1) {
      for (cwy $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dks<?> $$0, cwy... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dks<?>> a(cwy $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
