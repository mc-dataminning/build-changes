import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fgw {
   private static final int a = -1;
   private final jp<fgv> b = new jp<>(32);
   private final Map<dfh, Set<dtn<?>>> c = Maps.newHashMap();

   public static fgw a() {
      fgw $$0 = new fgw();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdp.a($$1, $$0x.c(dhp.b) == dtg.a ? $$2.d() : $$2) : dcd.a(), dfj.iI, dfj.iH);
      $$0.a(dhp.b, dfj.iI, dfj.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdp.a($$1, $$2) : dcd.a(), dfj.i, dfj.bu, dfj.bt, dfj.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gdp.a($$1, $$2) : dcd.a();
         } else {
            return -1;
         }
      }, dfj.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbz.a(), dfj.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbz.b(), dfj.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdp.b($$1, $$2) : dbz.c(), dfj.aE, dfj.aH, dfj.aI, dfj.aK, dfj.ff, dfj.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdp.c($$1, $$2) : -1, dfj.G, dfj.nd, dfj.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dlj.b($$0x.c(dlj.f)), dfj.cw);
      $$0.a(dlj.f, dfj.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdp.a($$1, $$2) : -1, dfj.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dfj.fc, dfj.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dnd.c);
         return axq.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dfj.fe, dfj.fd);
      $$0.a(dnd.c, dfj.fe, dfj.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dfj.fm);
      return $$0;
   }

   public int a(dsk $$0, dcf $$1, ja $$2) {
      fgv $$3 = this.b.a(lq.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eol $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dsk $$0, @Nullable dbi $$1, @Nullable ja $$2, int $$3) {
      fgv $$4 = this.b.a(lq.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fgv $$0, dfh... $$1) {
      for (dfh $$2 : $$1) {
         this.b.a($$0, lq.e.a($$2));
      }
   }

   private void a(Set<dtn<?>> $$0, dfh... $$1) {
      for (dfh $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dtn<?> $$0, dfh... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dtn<?>> a(dfh $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
