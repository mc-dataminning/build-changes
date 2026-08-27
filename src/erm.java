import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class erm {
   private static final int a = -1;
   private final hk<erl> b = new hk<>(32);
   private final Map<csl, Set<dgc<?>>> c = Maps.newHashMap();

   public static erm a() {
      erm $$0 = new erm();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fng.a($$1, $$0x.c(cup.a) == dfv.a ? $$2.d() : $$2) : cpj.a(), csm.iI, csm.iH);
      $$0.a(cup.a, csm.iI, csm.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fng.a($$1, $$2) : cpj.a(), csm.i, csm.bu, csm.bt, csm.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fng.a($$1, $$2) : cpj.a();
         } else {
            return -1;
         }
      }, csm.rA);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpf.a(), csm.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpf.b(), csm.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fng.b($$1, $$2) : cpf.c(), csm.aE, csm.aH, csm.aI, csm.aK, csm.ff, csm.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fng.c($$1, $$2) : -1, csm.G, csm.nd, csm.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> cym.b($$0x.c(cym.e)), csm.cw);
      $$0.a(cym.e, csm.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fng.a($$1, $$2) : -1, csm.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, csm.fc, csm.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dah.b);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, csm.fe, csm.fd);
      $$0.a(dah.b, csm.fe, csm.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, csm.fm);
      return $$0;
   }

   public int a(dez $$0, cpl $$1, gu $$2) {
      erl $$3 = this.b.a(jb.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eag $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dez $$0, @Nullable coo $$1, @Nullable gu $$2, int $$3) {
      erl $$4 = this.b.a(jb.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(erl $$0, csl... $$1) {
      for (csl $$2 : $$1) {
         this.b.a($$0, jb.f.a($$2));
      }
   }

   private void a(Set<dgc<?>> $$0, csl... $$1) {
      for (csl $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dgc<?> $$0, csl... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dgc<?>> a(csl $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
