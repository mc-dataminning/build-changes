import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fni {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jx<fnh> d = new jx<>(32);
   private final Map<dke, Set<dyt<?>>> e = Maps.newHashMap();

   public static fni a() {
      fni $$0 = new fni();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gmf.a($$1, $$0x.c(dmn.b) == dym.a ? $$2.e() : $$2) : dgx.a(), dkg.jg, dkg.jf);
      $$0.a(dmn.b, dkg.jg, dkg.jf);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gmf.a($$1, $$2) : dgx.a(), dkg.i, dkg.bB, dkg.bA, dkg.gx);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gmf.a($$1, $$2) : dgx.a();
         } else {
            return -1;
         }
      }, dkg.td, dkg.te);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dkg.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dkg.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> -9399763, dkg.aT, dkg.aU);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gmf.b($$1, $$2) : -12012264, dkg.aK, dkg.aN, dkg.aO, dkg.aQ, dkg.ft, dkg.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gmf.c($$1, $$2) : -1, dkg.J, dkg.nF, dkg.fP);
      $$0.a(($$0x, $$1, $$2, $$3) -> dql.b($$0x.c(dql.f)), dkg.cE);
      $$0.a(dql.f, dkg.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gmf.a($$1, $$2) : -1, dkg.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dkg.fq, dkg.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dsg.c);
         return axk.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dkg.fs, dkg.fr);
      $$0.a(dsg.c, dkg.fs, dkg.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dkg.fB);
      return $$0;
   }

   public int a(dxq $$0, dgz $$1, ji $$2) {
      fnh $$3 = this.d.a(mb.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eua $$4 = $$0.a((dgf)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dxq $$0, @Nullable dgc $$1, @Nullable ji $$2, int $$3) {
      fnh $$4 = this.d.a(mb.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fnh $$0, dke... $$1) {
      for (dke $$2 : $$1) {
         this.d.a($$0, mb.e.a($$2));
      }
   }

   private void a(Set<dyt<?>> $$0, dke... $$1) {
      for (dke $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(dyt<?> $$0, dke... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dyt<?>> a(dke $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
