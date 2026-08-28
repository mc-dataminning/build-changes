import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class flg {
   private static final int a = -1;
   private final jw<flf> b = new jw<>(32);
   private final Map<diq, Set<dwx<?>>> c = Maps.newHashMap();

   public static flg a() {
      flg $$0 = new flg();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gim.a($$1, $$0x.c(dky.b) == dwq.a ? $$2.e() : $$2) : dfk.a(), dis.iI, dis.iH);
      $$0.a(dky.b, dis.iI, dis.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gim.a($$1, $$2) : dfk.a(), dis.i, dis.bu, dis.bt, dis.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gim.a($$1, $$2) : dfk.a();
         } else {
            return -1;
         }
      }, dis.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dfg.a(), dis.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dfg.b(), dis.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gim.b($$1, $$2) : dfg.c(), dis.aE, dis.aH, dis.aI, dis.aK, dis.ff, dis.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gim.c($$1, $$2) : -1, dis.G, dis.nd, dis.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dos.b($$0x.c(dos.f)), dis.cw);
      $$0.a(dos.f, dis.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gim.a($$1, $$2) : -1, dis.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dis.fc, dis.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dqm.c);
         return axx.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dis.fe, dis.fd);
      $$0.a(dqm.c, dis.fe, dis.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dis.fm);
      return $$0;
   }

   public int a(dvv $$0, dfm $$1, jh $$2) {
      flf $$3 = this.b.a(lz.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         erz $$4 = $$0.a((der)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dvv $$0, @Nullable deo $$1, @Nullable jh $$2, int $$3) {
      flf $$4 = this.b.a(lz.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(flf $$0, diq... $$1) {
      for (diq $$2 : $$1) {
         this.b.a($$0, lz.e.a($$2));
      }
   }

   private void a(Set<dwx<?>> $$0, diq... $$1) {
      for (diq $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dwx<?> $$0, diq... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dwx<?>> a(diq $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
