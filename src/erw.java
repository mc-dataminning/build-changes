import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class erw {
   private static final int a = -1;
   private final hk<erv> b = new hk<>(32);
   private final Map<csv, Set<dgm<?>>> c = Maps.newHashMap();

   public static erw a() {
      erw $$0 = new erw();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnq.a($$1, $$0x.c(cuz.a) == dgf.a ? $$2.d() : $$2) : cpt.a(), csw.iI, csw.iH);
      $$0.a(cuz.a, csw.iI, csw.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnq.a($$1, $$2) : cpt.a(), csw.i, csw.bu, csw.bt, csw.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fnq.a($$1, $$2) : cpt.a();
         } else {
            return -1;
         }
      }, csw.rA);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpp.a(), csw.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpp.b(), csw.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnq.b($$1, $$2) : cpp.c(), csw.aE, csw.aH, csw.aI, csw.aK, csw.ff, csw.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnq.c($$1, $$2) : -1, csw.G, csw.nd, csw.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> cyw.b($$0x.c(cyw.e)), csw.cw);
      $$0.a(cyw.e, csw.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fnq.a($$1, $$2) : -1, csw.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, csw.fc, csw.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dar.b);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, csw.fe, csw.fd);
      $$0.a(dar.b, csw.fe, csw.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, csw.fm);
      return $$0;
   }

   public int a(dfj $$0, cpv $$1, gw $$2) {
      erv $$3 = this.b.a(jb.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eaq $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dfj $$0, @Nullable coy $$1, @Nullable gw $$2, int $$3) {
      erv $$4 = this.b.a(jb.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(erv $$0, csv... $$1) {
      for (csv $$2 : $$1) {
         this.b.a($$0, jb.f.a($$2));
      }
   }

   private void a(Set<dgm<?>> $$0, csv... $$1) {
      for (csv $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dgm<?> $$0, csv... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dgm<?>> a(csv $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
