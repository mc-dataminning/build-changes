import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fdy {
   private static final int a = -1;
   private final jb<fdx> b = new jb<>(32);
   private final Map<dcv, Set<drb<?>>> c = Maps.newHashMap();

   public static fdy a() {
      fdy $$0 = new fdy();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gaq.a($$1, $$0x.c(dfd.b) == dqu.a ? $$2.d() : $$2) : czs.a(), dcx.iI, dcx.iH);
      $$0.a(dfd.b, dcx.iI, dcx.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gaq.a($$1, $$2) : czs.a(), dcx.i, dcx.bu, dcx.bt, dcx.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gaq.a($$1, $$2) : czs.a();
         } else {
            return -1;
         }
      }, dcx.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> czo.a(), dcx.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> czo.b(), dcx.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gaq.b($$1, $$2) : czo.c(), dcx.aE, dcx.aH, dcx.aI, dcx.aK, dcx.ff, dcx.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gaq.c($$1, $$2) : -1, dcx.G, dcx.nd, dcx.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dix.b($$0x.c(dix.f)), dcx.cw);
      $$0.a(dix.f, dcx.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gaq.a($$1, $$2) : -1, dcx.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dcx.fc, dcx.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dkr.c);
         return axg.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dcx.fe, dcx.fd);
      $$0.a(dkr.c, dcx.fe, dcx.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dcx.fm);
      return $$0;
   }

   public int a(dpy $$0, czu $$1, im $$2) {
      fdx $$3 = this.b.a(lc.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         elv $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dpy $$0, @Nullable cyx $$1, @Nullable im $$2, int $$3) {
      fdx $$4 = this.b.a(lc.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fdx $$0, dcv... $$1) {
      for (dcv $$2 : $$1) {
         this.b.a($$0, lc.e.a($$2));
      }
   }

   private void a(Set<drb<?>> $$0, dcv... $$1) {
      for (dcv $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(drb<?> $$0, dcv... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<drb<?>> a(dcv $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
