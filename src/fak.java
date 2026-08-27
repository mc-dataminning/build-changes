import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fak {
   private static final int a = -1;
   private final ir<faj> b = new ir<>(32);
   private final Map<daa, Set<doc<?>>> c = Maps.newHashMap();

   public static fak a() {
      fak $$0 = new fak();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxc.a($$1, $$0x.c(dci.b) == dnv.a ? $$2.d() : $$2) : cwx.a(), dac.iI, dac.iH);
      $$0.a(dci.b, dac.iI, dac.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxc.a($$1, $$2) : cwx.a(), dac.i, dac.bu, dac.bt, dac.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fxc.a($$1, $$2) : cwx.a();
         } else {
            return -1;
         }
      }, dac.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> cwt.a(), dac.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cwt.b(), dac.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxc.b($$1, $$2) : cwt.c(), dac.aE, dac.aH, dac.aI, dac.aK, dac.ff, dac.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxc.c($$1, $$2) : -1, dac.G, dac.nd, dac.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dgb.b($$0x.c(dgb.f)), dac.cw);
      $$0.a(dgb.f, dac.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxc.a($$1, $$2) : -1, dac.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, dac.fc, dac.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dhv.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, dac.fe, dac.fd);
      $$0.a(dhv.c, dac.fe, dac.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, dac.fm);
      return $$0;
   }

   public int a(dmz $$0, cwz $$1, ib $$2) {
      faj $$3 = this.b.a(ki.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eir $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dmz $$0, @Nullable cwc $$1, @Nullable ib $$2, int $$3) {
      faj $$4 = this.b.a(ki.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(faj $$0, daa... $$1) {
      for (daa $$2 : $$1) {
         this.b.a($$0, ki.e.a($$2));
      }
   }

   private void a(Set<doc<?>> $$0, daa... $$1) {
      for (daa $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(doc<?> $$0, daa... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<doc<?>> a(daa $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
