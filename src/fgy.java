import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fgy {
   private static final int a = -1;
   private final jp<fgx> b = new jp<>(32);
   private final Map<dfi, Set<dto<?>>> c = Maps.newHashMap();

   public static fgy a() {
      fgy $$0 = new fgy();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdr.a($$1, $$0x.c(dhq.b) == dth.a ? $$2.d() : $$2) : dce.a(), dfk.iI, dfk.iH);
      $$0.a(dhq.b, dfk.iI, dfk.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdr.a($$1, $$2) : dce.a(), dfk.i, dfk.bu, dfk.bt, dfk.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gdr.a($$1, $$2) : dce.a();
         } else {
            return -1;
         }
      }, dfk.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dca.a(), dfk.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dca.b(), dfk.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdr.b($$1, $$2) : dca.c(), dfk.aE, dfk.aH, dfk.aI, dfk.aK, dfk.ff, dfk.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdr.c($$1, $$2) : -1, dfk.G, dfk.nd, dfk.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dlk.b($$0x.c(dlk.f)), dfk.cw);
      $$0.a(dlk.f, dfk.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdr.a($$1, $$2) : -1, dfk.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dfk.fc, dfk.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dne.c);
         return axq.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dfk.fe, dfk.fd);
      $$0.a(dne.c, dfk.fe, dfk.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dfk.fm);
      return $$0;
   }

   public int a(dsl $$0, dcg $$1, ja $$2) {
      fgx $$3 = this.b.a(lq.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eon $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dsl $$0, @Nullable dbj $$1, @Nullable ja $$2, int $$3) {
      fgx $$4 = this.b.a(lq.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fgx $$0, dfi... $$1) {
      for (dfi $$2 : $$1) {
         this.b.a($$0, lq.e.a($$2));
      }
   }

   private void a(Set<dto<?>> $$0, dfi... $$1) {
      for (dfi $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dto<?> $$0, dfi... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dto<?>> a(dfi $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
