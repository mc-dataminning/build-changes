import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ezo {
   private static final int a = -1;
   private final ir<ezn> b = new ir<>(32);
   private final Map<czf, Set<dnh<?>>> c = Maps.newHashMap();

   public static ezo a() {
      ezo $$0 = new ezo();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fwc.a($$1, $$0x.c(dbn.b) == dna.a ? $$2.d() : $$2) : cwc.a(), czh.iI, czh.iH);
      $$0.a(dbn.b, czh.iI, czh.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fwc.a($$1, $$2) : cwc.a(), czh.i, czh.bu, czh.bt, czh.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fwc.a($$1, $$2) : cwc.a();
         } else {
            return -1;
         }
      }, czh.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> cvy.a(), czh.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cvy.b(), czh.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fwc.b($$1, $$2) : cvy.c(), czh.aE, czh.aH, czh.aI, czh.aK, czh.ff, czh.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fwc.c($$1, $$2) : -1, czh.G, czh.nd, czh.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dfg.b($$0x.c(dfg.f)), czh.cw);
      $$0.a(dfg.f, czh.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fwc.a($$1, $$2) : -1, czh.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, czh.fc, czh.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dha.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, czh.fe, czh.fd);
      $$0.a(dha.c, czh.fe, czh.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, czh.fm);
      return $$0;
   }

   public int a(dme $$0, cwe $$1, ib $$2) {
      ezn $$3 = this.b.a(kh.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ehv $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dme $$0, @Nullable cvh $$1, @Nullable ib $$2, int $$3) {
      ezn $$4 = this.b.a(kh.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(ezn $$0, czf... $$1) {
      for (czf $$2 : $$1) {
         this.b.a($$0, kh.e.a($$2));
      }
   }

   private void a(Set<dnh<?>> $$0, czf... $$1) {
      for (czf $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dnh<?> $$0, czf... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dnh<?>> a(czf $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
