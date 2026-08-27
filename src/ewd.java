import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ewd {
   private static final int a = -1;
   private final in<ewc> b = new in<>(32);
   private final Map<cwj, Set<dkd<?>>> c = Maps.newHashMap();

   public static ewd a() {
      ewd $$0 = new ewd();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsl.a($$1, $$0x.c(cyr.b) == djw.a ? $$2.d() : $$2) : ctg.a(), cwl.iI, cwl.iH);
      $$0.a(cyr.b, cwl.iI, cwl.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsl.a($$1, $$2) : ctg.a(), cwl.i, cwl.bu, cwl.bt, cwl.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fsl.a($$1, $$2) : ctg.a();
         } else {
            return -1;
         }
      }, cwl.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> ctc.a(), cwl.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> ctc.b(), cwl.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsl.b($$1, $$2) : ctc.c(), cwl.aE, cwl.aH, cwl.aI, cwl.aK, cwl.ff, cwl.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsl.c($$1, $$2) : -1, cwl.G, cwl.nd, cwl.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dck.b($$0x.c(dck.f)), cwl.cw);
      $$0.a(dck.f, cwl.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fsl.a($$1, $$2) : -1, cwl.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cwl.fc, cwl.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dee.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cwl.fe, cwl.fd);
      $$0.a(dee.c, cwl.fe, cwl.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cwl.fm);
      return $$0;
   }

   public int a(dja $$0, cti $$1, hx $$2) {
      ewc $$3 = this.b.a(kd.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eeo $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dja $$0, @Nullable csl $$1, @Nullable hx $$2, int $$3) {
      ewc $$4 = this.b.a(kd.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(ewc $$0, cwj... $$1) {
      for (cwj $$2 : $$1) {
         this.b.a($$0, kd.e.a($$2));
      }
   }

   private void a(Set<dkd<?>> $$0, cwj... $$1) {
      for (cwj $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dkd<?> $$0, cwj... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dkd<?>> a(cwj $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
