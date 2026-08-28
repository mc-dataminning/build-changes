import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fgq {
   private static final int a = -1;
   private final jp<fgp> b = new jp<>(32);
   private final Map<dff, Set<dtk<?>>> c = Maps.newHashMap();

   public static fgq a() {
      fgq $$0 = new fgq();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdj.a($$1, $$0x.c(dhn.b) == dtd.a ? $$2.d() : $$2) : dcb.a(), dfh.iI, dfh.iH);
      $$0.a(dhn.b, dfh.iI, dfh.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdj.a($$1, $$2) : dcb.a(), dfh.i, dfh.bu, dfh.bt, dfh.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gdj.a($$1, $$2) : dcb.a();
         } else {
            return -1;
         }
      }, dfh.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbx.a(), dfh.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbx.b(), dfh.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdj.b($$1, $$2) : dbx.c(), dfh.aE, dfh.aH, dfh.aI, dfh.aK, dfh.ff, dfh.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdj.c($$1, $$2) : -1, dfh.G, dfh.nd, dfh.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dlh.b($$0x.c(dlh.f)), dfh.cw);
      $$0.a(dlh.f, dfh.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdj.a($$1, $$2) : -1, dfh.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dfh.fc, dfh.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dnb.c);
         return axo.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dfh.fe, dfh.fd);
      $$0.a(dnb.c, dfh.fe, dfh.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dfh.fm);
      return $$0;
   }

   public int a(dsh $$0, dcd $$1, ja $$2) {
      fgp $$3 = this.b.a(lq.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eof $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dsh $$0, @Nullable dbg $$1, @Nullable ja $$2, int $$3) {
      fgp $$4 = this.b.a(lq.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fgp $$0, dff... $$1) {
      for (dff $$2 : $$1) {
         this.b.a($$0, lq.e.a($$2));
      }
   }

   private void a(Set<dtk<?>> $$0, dff... $$1) {
      for (dff $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dtk<?> $$0, dff... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dtk<?>> a(dff $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
