import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fpu {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jk<fpt> d = new jk<>(32);
   private final Map<dma, Set<ebc<?>>> e = Maps.newHashMap();

   public static fpu a() {
      fpu $$0 = new fpu();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? goz.a($$1, $$0x.c(doj.b) == eav.a ? $$2.e() : $$2) : dit.a(), dmc.jh, dmc.jg);
      $$0.a(doj.b, dmc.jh, dmc.jg);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? goz.a($$1, $$2) : dit.a(), dmc.i, dmc.bB, dmc.bA, dmc.gy, dmc.bD);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? goz.a($$1, $$2) : dit.a();
         } else {
            return -1;
         }
      }, dmc.tg, dmc.th);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dmc.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dmc.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? goz.b($$1, $$2) : -12012264, dmc.aK, dmc.aN, dmc.aO, dmc.aQ, dmc.fu, dmc.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? goz.c($$1, $$2) : -1, dmc.J, dmc.nG, dmc.fQ);
      $$0.a(($$0x, $$1, $$2, $$3) -> dsi.b($$0x.c(dsi.f)), dmc.cF);
      $$0.a(dsi.f, dmc.cF);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? goz.a($$1, $$2) : -1, dmc.eg);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dmc.fr, dmc.fq);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(due.c);
         return axw.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dmc.ft, dmc.fs);
      $$0.a(due.c, dmc.ft, dmc.fs);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dmc.fC);
      return $$0;
   }

   public int a(dzz $$0, div $$1, iu $$2) {
      fpt $$3 = this.d.a(mf.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ewk $$4 = $$0.a((dib)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dzz $$0, @Nullable dhy $$1, @Nullable iu $$2, int $$3) {
      fpt $$4 = this.d.a(mf.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fpt $$0, dma... $$1) {
      for (dma $$2 : $$1) {
         this.d.a($$0, mf.e.a($$2));
      }
   }

   private void a(Set<ebc<?>> $$0, dma... $$1) {
      for (dma $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(ebc<?> $$0, dma... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<ebc<?>> a(dma $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
