import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fho {
   private static final int a = -1;
   private final js<fhn> b = new js<>(32);
   private final Map<dfy, Set<duf<?>>> c = Maps.newHashMap();

   public static fho a() {
      fho $$0 = new fho();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gej.a($$1, $$0x.c(dig.b) == dty.a ? $$2.e() : $$2) : dcu.a(), dga.iI, dga.iH);
      $$0.a(dig.b, dga.iI, dga.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gej.a($$1, $$2) : dcu.a(), dga.i, dga.bu, dga.bt, dga.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gej.a($$1, $$2) : dcu.a();
         } else {
            return -1;
         }
      }, dga.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dcq.a(), dga.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dcq.b(), dga.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gej.b($$1, $$2) : dcq.c(), dga.aE, dga.aH, dga.aI, dga.aK, dga.ff, dga.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gej.c($$1, $$2) : -1, dga.G, dga.nd, dga.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dmb.b($$0x.c(dmb.f)), dga.cw);
      $$0.a(dmb.f, dga.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gej.a($$1, $$2) : -1, dga.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dga.fc, dga.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dnv.c);
         return axy.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dga.fe, dga.fd);
      $$0.a(dnv.c, dga.fe, dga.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dga.fm);
      return $$0;
   }

   public int a(dtc $$0, dcw $$1, jd $$2) {
      fhn $$3 = this.b.a(lt.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         epg $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dtc $$0, @Nullable dbz $$1, @Nullable jd $$2, int $$3) {
      fhn $$4 = this.b.a(lt.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fhn $$0, dfy... $$1) {
      for (dfy $$2 : $$1) {
         this.b.a($$0, lt.e.a($$2));
      }
   }

   private void a(Set<duf<?>> $$0, dfy... $$1) {
      for (dfy $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(duf<?> $$0, dfy... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<duf<?>> a(dfy $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
