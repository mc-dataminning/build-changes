import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ffe {
   private static final int a = -1;
   private final jd<ffd> b = new jd<>(32);
   private final Map<dea, Set<dsg<?>>> c = Maps.newHashMap();

   public static ffe a() {
      ffe $$0 = new ffe();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.a($$1, $$0x.c(dgi.b) == drz.a ? $$2.d() : $$2) : dax.a(), dec.iI, dec.iH);
      $$0.a(dgi.b, dec.iI, dec.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.a($$1, $$2) : dax.a(), dec.i, dec.bu, dec.bt, dec.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gbw.a($$1, $$2) : dax.a();
         } else {
            return -1;
         }
      }, dec.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dat.a(), dec.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dat.b(), dec.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.b($$1, $$2) : dat.c(), dec.aE, dec.aH, dec.aI, dec.aK, dec.ff, dec.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.c($$1, $$2) : -1, dec.G, dec.nd, dec.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dkc.b($$0x.c(dkc.f)), dec.cw);
      $$0.a(dkc.f, dec.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gbw.a($$1, $$2) : -1, dec.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dec.fc, dec.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dlw.c);
         return axp.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dec.fe, dec.fd);
      $$0.a(dlw.c, dec.fe, dec.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dec.fm);
      return $$0;
   }

   public int a(drd $$0, daz $$1, io $$2) {
      ffd $$3 = this.b.a(le.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ena $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(drd $$0, @Nullable dac $$1, @Nullable io $$2, int $$3) {
      ffd $$4 = this.b.a(le.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(ffd $$0, dea... $$1) {
      for (dea $$2 : $$1) {
         this.b.a($$0, le.e.a($$2));
      }
   }

   private void a(Set<dsg<?>> $$0, dea... $$1) {
      for (dea $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dsg<?> $$0, dea... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dsg<?>> a(dea $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
