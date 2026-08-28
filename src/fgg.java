import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fgg {
   private static final int a = -1;
   private final jo<fgf> b = new jo<>(32);
   private final Map<dex, Set<dtd<?>>> c = Maps.newHashMap();

   public static fgg a() {
      fgg $$0 = new fgg();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcy.a($$1, $$0x.c(dhf.b) == dsw.a ? $$2.d() : $$2) : dbu.a(), dez.iI, dez.iH);
      $$0.a(dhf.b, dez.iI, dez.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcy.a($$1, $$2) : dbu.a(), dez.i, dez.bu, dez.bt, dez.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gcy.a($$1, $$2) : dbu.a();
         } else {
            return -1;
         }
      }, dez.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbq.a(), dez.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbq.b(), dez.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcy.b($$1, $$2) : dbq.c(), dez.aE, dez.aH, dez.aI, dez.aK, dez.ff, dez.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcy.c($$1, $$2) : -1, dez.G, dez.nd, dez.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dkz.b($$0x.c(dkz.f)), dez.cw);
      $$0.a(dkz.f, dez.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gcy.a($$1, $$2) : -1, dez.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dez.fc, dez.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dmt.c);
         return ayh.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dez.fe, dez.fd);
      $$0.a(dmt.c, dez.fe, dez.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dez.fm);
      return $$0;
   }

   public int a(dsa $$0, dbw $$1, iz $$2) {
      fgf $$3 = this.b.a(lp.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         enx $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dsa $$0, @Nullable daz $$1, @Nullable iz $$2, int $$3) {
      fgf $$4 = this.b.a(lp.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fgf $$0, dex... $$1) {
      for (dex $$2 : $$1) {
         this.b.a($$0, lp.e.a($$2));
      }
   }

   private void a(Set<dtd<?>> $$0, dex... $$1) {
      for (dex $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dtd<?> $$0, dex... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dtd<?>> a(dex $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
