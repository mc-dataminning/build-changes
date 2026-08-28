import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fmm {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jx<fml> d = new jx<>(32);
   private final Map<djn, Set<dya<?>>> e = Maps.newHashMap();

   public static fmm a() {
      fmm $$0 = new fmm();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glh.a($$1, $$0x.c(dlw.b) == dxt.a ? $$2.e() : $$2) : dgh.a(), djp.jg, djp.jf);
      $$0.a(dlw.b, djp.jg, djp.jf);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glh.a($$1, $$2) : dgh.a(), djp.i, djp.bB, djp.bA, djp.gx);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? glh.a($$1, $$2) : dgh.a();
         } else {
            return -1;
         }
      }, djp.td);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, djp.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, djp.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glh.b($$1, $$2) : -12012264, djp.aK, djp.aN, djp.aO, djp.aQ, djp.ft, djp.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glh.c($$1, $$2) : -1, djp.J, djp.nF, djp.fP);
      $$0.a(($$0x, $$1, $$2, $$3) -> dpu.b($$0x.c(dpu.f)), djp.cE);
      $$0.a(dpu.f, djp.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glh.a($$1, $$2) : -1, djp.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, djp.fq, djp.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dro.c);
         return axk.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, djp.fs, djp.fr);
      $$0.a(dro.c, djp.fs, djp.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, djp.fB);
      return $$0;
   }

   public int a(dwy $$0, dgj $$1, ji $$2) {
      fml $$3 = this.d.a(mb.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ete $$4 = $$0.a((dfo)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dwy $$0, @Nullable dfl $$1, @Nullable ji $$2, int $$3) {
      fml $$4 = this.d.a(mb.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fml $$0, djn... $$1) {
      for (djn $$2 : $$1) {
         this.d.a($$0, mb.e.a($$2));
      }
   }

   private void a(Set<dya<?>> $$0, djn... $$1) {
      for (djn $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(dya<?> $$0, djn... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dya<?>> a(djn $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
