import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fct {
   private static final int a = -1;
   private final ir<fcs> b = new ir<>(32);
   private final Map<dby, Set<dqc<?>>> c = Maps.newHashMap();

   public static fct a() {
      fct $$0 = new fct();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzl.a($$1, $$0x.c(deg.b) == dpv.a ? $$2.d() : $$2) : cyv.a(), dca.iI, dca.iH);
      $$0.a(deg.b, dca.iI, dca.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzl.a($$1, $$2) : cyv.a(), dca.i, dca.bu, dca.bt, dca.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fzl.a($$1, $$2) : cyv.a();
         } else {
            return -1;
         }
      }, dca.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> cyr.a(), dca.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cyr.b(), dca.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzl.b($$1, $$2) : cyr.c(), dca.aE, dca.aH, dca.aI, dca.aK, dca.ff, dca.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzl.c($$1, $$2) : -1, dca.G, dca.nd, dca.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dhz.b($$0x.c(dhz.f)), dca.cw);
      $$0.a(dhz.f, dca.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fzl.a($$1, $$2) : -1, dca.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dca.fc, dca.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(djt.c);
         return awu.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dca.fe, dca.fd);
      $$0.a(djt.c, dca.fe, dca.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dca.fm);
      return $$0;
   }

   public int a(doz $$0, cyx $$1, ib $$2) {
      fcs $$3 = this.b.a(kr.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ekw $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(doz $$0, @Nullable cya $$1, @Nullable ib $$2, int $$3) {
      fcs $$4 = this.b.a(kr.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fcs $$0, dby... $$1) {
      for (dby $$2 : $$1) {
         this.b.a($$0, kr.e.a($$2));
      }
   }

   private void a(Set<dqc<?>> $$0, dby... $$1) {
      for (dby $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dqc<?> $$0, dby... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dqc<?>> a(dby $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
