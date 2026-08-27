import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ets {
   private static final int a = -1;
   private final ii<etr> b = new ii<>(32);
   private final Map<cut, Set<dhz<?>>> c = Maps.newHashMap();

   public static ets a() {
      ets $$0 = new ets();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fpt.a($$1, $$0x.c(cxa.b) == dhs.a ? $$2.d() : $$2) : crq.a(), cuv.iI, cuv.iH);
      $$0.a(cxa.b, cuv.iI, cuv.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fpt.a($$1, $$2) : crq.a(), cuv.i, cuv.bu, cuv.bt, cuv.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fpt.a($$1, $$2) : crq.a();
         } else {
            return -1;
         }
      }, cuv.rA);
      $$0.a(($$0x, $$1, $$2, $$3) -> crm.a(), cuv.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> crm.b(), cuv.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fpt.b($$1, $$2) : crm.c(), cuv.aE, cuv.aH, cuv.aI, cuv.aK, cuv.ff, cuv.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fpt.c($$1, $$2) : -1, cuv.G, cuv.nd, cuv.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dau.b($$0x.c(dau.f)), cuv.cw);
      $$0.a(dau.f, cuv.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fpt.a($$1, $$2) : -1, cuv.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cuv.fc, cuv.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dco.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cuv.fe, cuv.fd);
      $$0.a(dco.c, cuv.fe, cuv.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cuv.fm);
      return $$0;
   }

   public int a(dgw $$0, crs $$1, ht $$2) {
      etr $$3 = this.b.a(jy.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eck $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dgw $$0, @Nullable cqv $$1, @Nullable ht $$2, int $$3) {
      etr $$4 = this.b.a(jy.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(etr $$0, cut... $$1) {
      for (cut $$2 : $$1) {
         this.b.a($$0, jy.f.a($$2));
      }
   }

   private void a(Set<dhz<?>> $$0, cut... $$1) {
      for (cut $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dhz<?> $$0, cut... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dhz<?>> a(cut $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
