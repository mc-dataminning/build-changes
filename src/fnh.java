import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fnh {
   private static final int a = -1;
   private final jw<fng> b = new jw<>(32);
   private final Map<dkl, Set<dyw<?>>> c = Maps.newHashMap();

   public static fnh a() {
      fnh $$0 = new fnh();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkq.a($$1, $$0x.c(dmv.b) == dyp.a ? $$2.e() : $$2) : dhf.a(), dkn.iZ, dkn.iY);
      $$0.a(dmv.b, dkn.iZ, dkn.iY);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkq.a($$1, $$2) : dhf.a(), dkn.i, dkn.bB, dkn.bA, dkn.gq);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gkq.a($$1, $$2) : dhf.a();
         } else {
            return -1;
         }
      }, dkn.sW);
      $$0.a(($$0x, $$1, $$2, $$3) -> dhb.a(), dkn.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> dhb.b(), dkn.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkq.b($$1, $$2) : dhb.c(), dkn.aK, dkn.aN, dkn.aO, dkn.aQ, dkn.ft, dkn.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkq.c($$1, $$2) : -1, dkn.J, dkn.ny, dkn.fI);
      $$0.a(($$0x, $$1, $$2, $$3) -> dqq.b($$0x.c(dqq.f)), dkn.cE);
      $$0.a(dqq.f, dkn.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkq.a($$1, $$2) : -1, dkn.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dkn.fq, dkn.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dsk.c);
         return ayp.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dkn.fs, dkn.fr);
      $$0.a(dsk.c, dkn.fs, dkn.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dkn.fA);
      return $$0;
   }

   public int a(dxu $$0, dhh $$1, jh $$2) {
      fng $$3 = this.b.a(ma.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eua $$4 = $$0.a((dgm)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dxu $$0, @Nullable dgj $$1, @Nullable jh $$2, int $$3) {
      fng $$4 = this.b.a(ma.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fng $$0, dkl... $$1) {
      for (dkl $$2 : $$1) {
         this.b.a($$0, ma.e.a($$2));
      }
   }

   private void a(Set<dyw<?>> $$0, dkl... $$1) {
      for (dkl $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dyw<?> $$0, dkl... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dyw<?>> a(dkl $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
