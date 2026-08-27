import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fei {
   private static final int a = -1;
   private final jc<feh> b = new jc<>(32);
   private final Map<dde, Set<drk<?>>> c = Maps.newHashMap();

   public static fei a() {
      fei $$0 = new fei();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gba.a($$1, $$0x.c(dfm.b) == drd.a ? $$2.d() : $$2) : dab.a(), ddg.iI, ddg.iH);
      $$0.a(dfm.b, ddg.iI, ddg.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gba.a($$1, $$2) : dab.a(), ddg.i, ddg.bu, ddg.bt, ddg.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gba.a($$1, $$2) : dab.a();
         } else {
            return -1;
         }
      }, ddg.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> czx.a(), ddg.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> czx.b(), ddg.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gba.b($$1, $$2) : czx.c(), ddg.aE, ddg.aH, ddg.aI, ddg.aK, ddg.ff, ddg.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gba.c($$1, $$2) : -1, ddg.G, ddg.nd, ddg.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> djg.b($$0x.c(djg.f)), ddg.cw);
      $$0.a(djg.f, ddg.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gba.a($$1, $$2) : -1, ddg.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, ddg.fc, ddg.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dla.c);
         return axj.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, ddg.fe, ddg.fd);
      $$0.a(dla.c, ddg.fe, ddg.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, ddg.fm);
      return $$0;
   }

   public int a(dqh $$0, dad $$1, in $$2) {
      feh $$3 = this.b.a(ld.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eme $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dqh $$0, @Nullable czg $$1, @Nullable in $$2, int $$3) {
      feh $$4 = this.b.a(ld.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(feh $$0, dde... $$1) {
      for (dde $$2 : $$1) {
         this.b.a($$0, ld.e.a($$2));
      }
   }

   private void a(Set<drk<?>> $$0, dde... $$1) {
      for (dde $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(drk<?> $$0, dde... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<drk<?>> a(dde $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
