import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fjr {
   private static final int a = -1;
   private final ju<fjq> b = new ju<>(32);
   private final Map<dhm, Set<dvv<?>>> c = Maps.newHashMap();

   public static fjr a() {
      fjr $$0 = new fjr();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggr.a($$1, $$0x.c(dju.b) == dvo.a ? $$2.e() : $$2) : deh.a(), dho.iI, dho.iH);
      $$0.a(dju.b, dho.iI, dho.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggr.a($$1, $$2) : deh.a(), dho.i, dho.bu, dho.bt, dho.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? ggr.a($$1, $$2) : deh.a();
         } else {
            return -1;
         }
      }, dho.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> ded.a(), dho.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> ded.b(), dho.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggr.b($$1, $$2) : ded.c(), dho.aE, dho.aH, dho.aI, dho.aK, dho.ff, dho.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggr.c($$1, $$2) : -1, dho.G, dho.nd, dho.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dnp.b($$0x.c(dnp.f)), dho.cw);
      $$0.a(dnp.f, dho.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggr.a($$1, $$2) : -1, dho.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dho.fc, dho.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dpj.c);
         return axq.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dho.fe, dho.fd);
      $$0.a(dpj.c, dho.fe, dho.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dho.fm);
      return $$0;
   }

   public int a(dus $$0, dej $$1, jf $$2) {
      fjq $$3 = this.b.a(lv.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eqx $$4 = $$0.a((ddo)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dus $$0, @Nullable ddl $$1, @Nullable jf $$2, int $$3) {
      fjq $$4 = this.b.a(lv.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fjq $$0, dhm... $$1) {
      for (dhm $$2 : $$1) {
         this.b.a($$0, lv.e.a($$2));
      }
   }

   private void a(Set<dvv<?>> $$0, dhm... $$1) {
      for (dhm $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dvv<?> $$0, dhm... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dvv<?>> a(dhm $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
