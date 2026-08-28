import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fni {
   private static final int a = -1;
   private final jw<fnh> b = new jw<>(32);
   private final Map<dkm, Set<dyx<?>>> c = Maps.newHashMap();

   public static fni a() {
      fni $$0 = new fni();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkr.a($$1, $$0x.c(dmw.b) == dyq.a ? $$2.e() : $$2) : dhg.a(), dko.iZ, dko.iY);
      $$0.a(dmw.b, dko.iZ, dko.iY);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkr.a($$1, $$2) : dhg.a(), dko.i, dko.bB, dko.bA, dko.gq);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gkr.a($$1, $$2) : dhg.a();
         } else {
            return -1;
         }
      }, dko.sW);
      $$0.a(($$0x, $$1, $$2, $$3) -> dhc.a(), dko.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> dhc.b(), dko.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkr.b($$1, $$2) : dhc.c(), dko.aK, dko.aN, dko.aO, dko.aQ, dko.ft, dko.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkr.c($$1, $$2) : -1, dko.J, dko.ny, dko.fI);
      $$0.a(($$0x, $$1, $$2, $$3) -> dqr.b($$0x.c(dqr.f)), dko.cE);
      $$0.a(dqr.f, dko.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkr.a($$1, $$2) : -1, dko.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dko.fq, dko.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dsl.c);
         return ayp.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dko.fs, dko.fr);
      $$0.a(dsl.c, dko.fs, dko.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dko.fA);
      return $$0;
   }

   public int a(dxv $$0, dhi $$1, jh $$2) {
      fnh $$3 = this.b.a(ma.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eub $$4 = $$0.a((dgn)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dxv $$0, @Nullable dgk $$1, @Nullable jh $$2, int $$3) {
      fnh $$4 = this.b.a(ma.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fnh $$0, dkm... $$1) {
      for (dkm $$2 : $$1) {
         this.b.a($$0, ma.e.a($$2));
      }
   }

   private void a(Set<dyx<?>> $$0, dkm... $$1) {
      for (dkm $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dyx<?> $$0, dkm... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dyx<?>> a(dkm $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
