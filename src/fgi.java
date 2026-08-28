import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fgi {
   private static final int a = -1;
   private final jo<fgh> b = new jo<>(32);
   private final Map<dez, Set<dtf<?>>> c = Maps.newHashMap();

   public static fgi a() {
      fgi $$0 = new fgi();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gda.a($$1, $$0x.c(dhh.b) == dsy.a ? $$2.d() : $$2) : dbw.a(), dfb.iI, dfb.iH);
      $$0.a(dhh.b, dfb.iI, dfb.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gda.a($$1, $$2) : dbw.a(), dfb.i, dfb.bu, dfb.bt, dfb.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gda.a($$1, $$2) : dbw.a();
         } else {
            return -1;
         }
      }, dfb.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbs.a(), dfb.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbs.b(), dfb.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gda.b($$1, $$2) : dbs.c(), dfb.aE, dfb.aH, dfb.aI, dfb.aK, dfb.ff, dfb.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gda.c($$1, $$2) : -1, dfb.G, dfb.nd, dfb.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dlb.b($$0x.c(dlb.f)), dfb.cw);
      $$0.a(dlb.f, dfb.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gda.a($$1, $$2) : -1, dfb.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dfb.fc, dfb.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dmv.c);
         return ayj.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dfb.fe, dfb.fd);
      $$0.a(dmv.c, dfb.fe, dfb.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dfb.fm);
      return $$0;
   }

   public int a(dsc $$0, dby $$1, iz $$2) {
      fgh $$3 = this.b.a(lp.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         enz $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dsc $$0, @Nullable dbb $$1, @Nullable iz $$2, int $$3) {
      fgh $$4 = this.b.a(lp.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fgh $$0, dez... $$1) {
      for (dez $$2 : $$1) {
         this.b.a($$0, lp.e.a($$2));
      }
   }

   private void a(Set<dtf<?>> $$0, dez... $$1) {
      for (dez $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dtf<?> $$0, dez... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dtf<?>> a(dez $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
