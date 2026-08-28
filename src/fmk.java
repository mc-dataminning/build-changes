import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fmk {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jx<fmj> d = new jx<>(32);
   private final Map<djl, Set<dxy<?>>> e = Maps.newHashMap();

   public static fmk a() {
      fmk $$0 = new fmk();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.a($$1, $$0x.c(dlu.b) == dxr.a ? $$2.e() : $$2) : dgf.a(), djn.jg, djn.jf);
      $$0.a(dlu.b, djn.jg, djn.jf);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.a($$1, $$2) : dgf.a(), djn.i, djn.bB, djn.bA, djn.gx);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? glf.a($$1, $$2) : dgf.a();
         } else {
            return -1;
         }
      }, djn.td);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, djn.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, djn.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.b($$1, $$2) : -12012264, djn.aK, djn.aN, djn.aO, djn.aQ, djn.ft, djn.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.c($$1, $$2) : -1, djn.J, djn.nF, djn.fP);
      $$0.a(($$0x, $$1, $$2, $$3) -> dps.b($$0x.c(dps.f)), djn.cE);
      $$0.a(dps.f, djn.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.a($$1, $$2) : -1, djn.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, djn.fq, djn.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(drm.c);
         return axk.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, djn.fs, djn.fr);
      $$0.a(drm.c, djn.fs, djn.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, djn.fB);
      return $$0;
   }

   public int a(dww $$0, dgh $$1, ji $$2) {
      fmj $$3 = this.d.a(mb.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         etc $$4 = $$0.a((dfm)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dww $$0, @Nullable dfj $$1, @Nullable ji $$2, int $$3) {
      fmj $$4 = this.d.a(mb.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fmj $$0, djl... $$1) {
      for (djl $$2 : $$1) {
         this.d.a($$0, mb.e.a($$2));
      }
   }

   private void a(Set<dxy<?>> $$0, djl... $$1) {
      for (djl $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(dxy<?> $$0, djl... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dxy<?>> a(djl $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
