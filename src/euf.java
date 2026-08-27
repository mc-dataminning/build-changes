import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class euf {
   private static final int a = -1;
   private final ii<eue> b = new ii<>(32);
   private final Map<cva, Set<dil<?>>> c = Maps.newHashMap();

   public static euf a() {
      euf $$0 = new euf();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fqg.a($$1, $$0x.c(cxi.b) == die.a ? $$2.d() : $$2) : cry.a(), cvc.iI, cvc.iH);
      $$0.a(cxi.b, cvc.iI, cvc.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fqg.a($$1, $$2) : cry.a(), cvc.i, cvc.bu, cvc.bt, cvc.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fqg.a($$1, $$2) : cry.a();
         } else {
            return -1;
         }
      }, cvc.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> cru.a(), cvc.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cru.b(), cvc.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fqg.b($$1, $$2) : cru.c(), cvc.aE, cvc.aH, cvc.aI, cvc.aK, cvc.ff, cvc.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fqg.c($$1, $$2) : -1, cvc.G, cvc.nd, cvc.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dbb.b($$0x.c(dbb.f)), cvc.cw);
      $$0.a(dbb.f, cvc.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fqg.a($$1, $$2) : -1, cvc.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cvc.fc, cvc.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dcv.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cvc.fe, cvc.fd);
      $$0.a(dcv.c, cvc.fe, cvc.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cvc.fm);
      return $$0;
   }

   public int a(dhi $$0, csa $$1, ht $$2) {
      eue $$3 = this.b.a(jy.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ecw $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dhi $$0, @Nullable crd $$1, @Nullable ht $$2, int $$3) {
      eue $$4 = this.b.a(jy.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(eue $$0, cva... $$1) {
      for (cva $$2 : $$1) {
         this.b.a($$0, jy.f.a($$2));
      }
   }

   private void a(Set<dil<?>> $$0, cva... $$1) {
      for (cva $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dil<?> $$0, cva... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dil<?>> a(cva $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
