import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fgj {
   private static final int a = -1;
   private final jo<fgi> b = new jo<>(32);
   private final Map<dfa, Set<dtg<?>>> c = Maps.newHashMap();

   public static fgj a() {
      fgj $$0 = new fgj();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdb.a($$1, $$0x.c(dhi.b) == dsz.a ? $$2.d() : $$2) : dbx.a(), dfc.iI, dfc.iH);
      $$0.a(dhi.b, dfc.iI, dfc.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdb.a($$1, $$2) : dbx.a(), dfc.i, dfc.bu, dfc.bt, dfc.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gdb.a($$1, $$2) : dbx.a();
         } else {
            return -1;
         }
      }, dfc.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbt.a(), dfc.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbt.b(), dfc.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdb.b($$1, $$2) : dbt.c(), dfc.aE, dfc.aH, dfc.aI, dfc.aK, dfc.ff, dfc.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdb.c($$1, $$2) : -1, dfc.G, dfc.nd, dfc.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dlc.b($$0x.c(dlc.f)), dfc.cw);
      $$0.a(dlc.f, dfc.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gdb.a($$1, $$2) : -1, dfc.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dfc.fc, dfc.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dmw.c);
         return ayj.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dfc.fe, dfc.fd);
      $$0.a(dmw.c, dfc.fe, dfc.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dfc.fm);
      return $$0;
   }

   public int a(dsd $$0, dbz $$1, iz $$2) {
      fgi $$3 = this.b.a(lp.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eoa $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dsd $$0, @Nullable dbc $$1, @Nullable iz $$2, int $$3) {
      fgi $$4 = this.b.a(lp.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fgi $$0, dfa... $$1) {
      for (dfa $$2 : $$1) {
         this.b.a($$0, lp.e.a($$2));
      }
   }

   private void a(Set<dtg<?>> $$0, dfa... $$1) {
      for (dfa $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dtg<?> $$0, dfa... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dtg<?>> a(dfa $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
