import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fdc {
   private static final int a = -1;
   private final it<fdb> b = new it<>(32);
   private final Map<dch, Set<dql<?>>> c = Maps.newHashMap();

   public static fdc a() {
      fdc $$0 = new fdc();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzu.a($$1, $$0x.c(dep.b) == dqe.a ? $$2.d() : $$2) : cze.a(), dcj.iI, dcj.iH);
      $$0.a(dep.b, dcj.iI, dcj.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzu.a($$1, $$2) : cze.a(), dcj.i, dcj.bu, dcj.bt, dcj.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fzu.a($$1, $$2) : cze.a();
         } else {
            return -1;
         }
      }, dcj.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> cza.a(), dcj.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cza.b(), dcj.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzu.b($$1, $$2) : cza.c(), dcj.aE, dcj.aH, dcj.aI, dcj.aK, dcj.ff, dcj.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzu.c($$1, $$2) : -1, dcj.G, dcj.nd, dcj.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dii.b($$0x.c(dii.f)), dcj.cw);
      $$0.a(dii.f, dcj.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzu.a($$1, $$2) : -1, dcj.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dcj.fc, dcj.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dkc.c);
         return aww.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dcj.fe, dcj.fd);
      $$0.a(dkc.c, dcj.fe, dcj.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dcj.fm);
      return $$0;
   }

   public int a(dpi $$0, czg $$1, id $$2) {
      fdb $$3 = this.b.a(kt.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         elf $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dpi $$0, @Nullable cyj $$1, @Nullable id $$2, int $$3) {
      fdb $$4 = this.b.a(kt.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fdb $$0, dch... $$1) {
      for (dch $$2 : $$1) {
         this.b.a($$0, kt.e.a($$2));
      }
   }

   private void a(Set<dql<?>> $$0, dch... $$1) {
      for (dch $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dql<?> $$0, dch... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dql<?>> a(dch $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
