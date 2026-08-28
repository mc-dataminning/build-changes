import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fml {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jx<fmk> d = new jx<>(32);
   private final Map<djm, Set<dxz<?>>> e = Maps.newHashMap();

   public static fml a() {
      fml $$0 = new fml();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.a($$1, $$0x.c(dlv.b) == dxs.a ? $$2.e() : $$2) : dgg.a(), djo.jg, djo.jf);
      $$0.a(dlv.b, djo.jg, djo.jf);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.a($$1, $$2) : dgg.a(), djo.i, djo.bB, djo.bA, djo.gx);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? glf.a($$1, $$2) : dgg.a();
         } else {
            return -1;
         }
      }, djo.td);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, djo.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, djo.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.b($$1, $$2) : -12012264, djo.aK, djo.aN, djo.aO, djo.aQ, djo.ft, djo.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.c($$1, $$2) : -1, djo.J, djo.nF, djo.fP);
      $$0.a(($$0x, $$1, $$2, $$3) -> dpt.b($$0x.c(dpt.f)), djo.cE);
      $$0.a(dpt.f, djo.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? glf.a($$1, $$2) : -1, djo.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, djo.fq, djo.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(drn.c);
         return axk.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, djo.fs, djo.fr);
      $$0.a(drn.c, djo.fs, djo.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, djo.fB);
      return $$0;
   }

   public int a(dwx $$0, dgi $$1, ji $$2) {
      fmk $$3 = this.d.a(mb.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         etd $$4 = $$0.a((dfn)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dwx $$0, @Nullable dfk $$1, @Nullable ji $$2, int $$3) {
      fmk $$4 = this.d.a(mb.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fmk $$0, djm... $$1) {
      for (djm $$2 : $$1) {
         this.d.a($$0, mb.e.a($$2));
      }
   }

   private void a(Set<dxz<?>> $$0, djm... $$1) {
      for (djm $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(dxz<?> $$0, djm... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dxz<?>> a(djm $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
