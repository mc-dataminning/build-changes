import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ewl {
   private static final int a = -1;
   private final in<ewk> b = new in<>(32);
   private final Map<cwq, Set<dkk<?>>> c = Maps.newHashMap();

   public static ewl a() {
      ewl $$0 = new ewl();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fst.a($$1, $$0x.c(cyy.b) == dkd.a ? $$2.d() : $$2) : ctn.a(), cws.iI, cws.iH);
      $$0.a(cyy.b, cws.iI, cws.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fst.a($$1, $$2) : ctn.a(), cws.i, cws.bu, cws.bt, cws.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fst.a($$1, $$2) : ctn.a();
         } else {
            return -1;
         }
      }, cws.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> ctj.a(), cws.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> ctj.b(), cws.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fst.b($$1, $$2) : ctj.c(), cws.aE, cws.aH, cws.aI, cws.aK, cws.ff, cws.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fst.c($$1, $$2) : -1, cws.G, cws.nd, cws.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dcr.b($$0x.c(dcr.f)), cws.cw);
      $$0.a(dcr.f, cws.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fst.a($$1, $$2) : -1, cws.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cws.fc, cws.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(del.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cws.fe, cws.fd);
      $$0.a(del.c, cws.fe, cws.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cws.fm);
      return $$0;
   }

   public int a(djh $$0, ctp $$1, hx $$2) {
      ewk $$3 = this.b.a(kd.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eev $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(djh $$0, @Nullable css $$1, @Nullable hx $$2, int $$3) {
      ewk $$4 = this.b.a(kd.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(ewk $$0, cwq... $$1) {
      for (cwq $$2 : $$1) {
         this.b.a($$0, kd.e.a($$2));
      }
   }

   private void a(Set<dkk<?>> $$0, cwq... $$1) {
      for (cwq $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dkk<?> $$0, cwq... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dkk<?>> a(cwq $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
