import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fkc {
   private static final int a = -1;
   private final jv<fkb> b = new jv<>(32);
   private final Map<dhy, Set<dwg<?>>> c = Maps.newHashMap();

   public static fkc a() {
      fkc $$0 = new fkc();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghc.a($$1, $$0x.c(dkg.b) == dvz.a ? $$2.e() : $$2) : det.a(), dia.iI, dia.iH);
      $$0.a(dkg.b, dia.iI, dia.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghc.a($$1, $$2) : det.a(), dia.i, dia.bu, dia.bt, dia.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? ghc.a($$1, $$2) : det.a();
         } else {
            return -1;
         }
      }, dia.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dep.a(), dia.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dep.b(), dia.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghc.b($$1, $$2) : dep.c(), dia.aE, dia.aH, dia.aI, dia.aK, dia.ff, dia.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghc.c($$1, $$2) : -1, dia.G, dia.nd, dia.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> doa.b($$0x.c(doa.f)), dia.cw);
      $$0.a(doa.f, dia.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghc.a($$1, $$2) : -1, dia.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dia.fc, dia.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dpu.c);
         return axu.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dia.fe, dia.fd);
      $$0.a(dpu.c, dia.fe, dia.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dia.fm);
      return $$0;
   }

   public int a(dvd $$0, dev $$1, jg $$2) {
      fkb $$3 = this.b.a(lx.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eri $$4 = $$0.a((dea)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dvd $$0, @Nullable ddx $$1, @Nullable jg $$2, int $$3) {
      fkb $$4 = this.b.a(lx.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fkb $$0, dhy... $$1) {
      for (dhy $$2 : $$1) {
         this.b.a($$0, lx.e.a($$2));
      }
   }

   private void a(Set<dwg<?>> $$0, dhy... $$1) {
      for (dhy $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dwg<?> $$0, dhy... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dwg<?>> a(dhy $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
