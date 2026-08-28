import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fmj {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jx<fmi> d = new jx<>(32);
   private final Map<djk, Set<dxx<?>>> e = Maps.newHashMap();

   public static fmj a() {
      fmj $$0 = new fmj();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gld.a($$1, $$0x.c(dlt.b) == dxq.a ? $$2.e() : $$2) : dge.a(), djm.jg, djm.jf);
      $$0.a(dlt.b, djm.jg, djm.jf);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gld.a($$1, $$2) : dge.a(), djm.i, djm.bB, djm.bA, djm.gx);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gld.a($$1, $$2) : dge.a();
         } else {
            return -1;
         }
      }, djm.td);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, djm.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, djm.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gld.b($$1, $$2) : -12012264, djm.aK, djm.aN, djm.aO, djm.aQ, djm.ft, djm.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gld.c($$1, $$2) : -1, djm.J, djm.nF, djm.fP);
      $$0.a(($$0x, $$1, $$2, $$3) -> dpr.b($$0x.c(dpr.f)), djm.cE);
      $$0.a(dpr.f, djm.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gld.a($$1, $$2) : -1, djm.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, djm.fq, djm.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(drl.c);
         return axj.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, djm.fs, djm.fr);
      $$0.a(drl.c, djm.fs, djm.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, djm.fB);
      return $$0;
   }

   public int a(dwv $$0, dgg $$1, ji $$2) {
      fmi $$3 = this.d.a(mb.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         etb $$4 = $$0.a((dfl)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dwv $$0, @Nullable dfi $$1, @Nullable ji $$2, int $$3) {
      fmi $$4 = this.d.a(mb.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fmi $$0, djk... $$1) {
      for (djk $$2 : $$1) {
         this.d.a($$0, mb.e.a($$2));
      }
   }

   private void a(Set<dxx<?>> $$0, djk... $$1) {
      for (djk $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(dxx<?> $$0, djk... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dxx<?>> a(djk $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
