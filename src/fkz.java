import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fkz {
   private static final int a = -1;
   private final jw<fky> b = new jw<>(32);
   private final Map<dij, Set<dwq<?>>> c = Maps.newHashMap();

   public static fkz a() {
      fkz $$0 = new fkz();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gid.a($$1, $$0x.c(dkr.b) == dwj.a ? $$2.e() : $$2) : dfd.a(), dil.iI, dil.iH);
      $$0.a(dkr.b, dil.iI, dil.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gid.a($$1, $$2) : dfd.a(), dil.i, dil.bu, dil.bt, dil.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gid.a($$1, $$2) : dfd.a();
         } else {
            return -1;
         }
      }, dil.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dez.a(), dil.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dez.b(), dil.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gid.b($$1, $$2) : dez.c(), dil.aE, dil.aH, dil.aI, dil.aK, dil.ff, dil.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gid.c($$1, $$2) : -1, dil.G, dil.nd, dil.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dol.b($$0x.c(dol.f)), dil.cw);
      $$0.a(dol.f, dil.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gid.a($$1, $$2) : -1, dil.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dil.fc, dil.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dqf.c);
         return axy.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dil.fe, dil.fd);
      $$0.a(dqf.c, dil.fe, dil.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dil.fm);
      return $$0;
   }

   public int a(dvo $$0, dff $$1, jh $$2) {
      fky $$3 = this.b.a(lz.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ers $$4 = $$0.a((dek)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dvo $$0, @Nullable deh $$1, @Nullable jh $$2, int $$3) {
      fky $$4 = this.b.a(lz.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fky $$0, dij... $$1) {
      for (dij $$2 : $$1) {
         this.b.a($$0, lz.e.a($$2));
      }
   }

   private void a(Set<dwq<?>> $$0, dij... $$1) {
      for (dij $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dwq<?> $$0, dij... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dwq<?>> a(dij $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
