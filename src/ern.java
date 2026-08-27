import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ern {
   private static final int a = -1;
   private final hk<erm> b = new hk<>(32);
   private final Map<csm, Set<dgd<?>>> c = Maps.newHashMap();

   public static ern a() {
      ern $$0 = new ern();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fmx.a($$1, $$0x.c(cuq.a) == dfw.a ? $$2.d() : $$2) : cpk.a(), csn.iI, csn.iH);
      $$0.a(cuq.a, csn.iI, csn.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fmx.a($$1, $$2) : cpk.a(), csn.i, csn.bu, csn.bt, csn.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fmx.a($$1, $$2) : cpk.a();
         } else {
            return -1;
         }
      }, csn.rA);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpg.a(), csn.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpg.b(), csn.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fmx.b($$1, $$2) : cpg.c(), csn.aE, csn.aH, csn.aI, csn.aK, csn.ff, csn.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fmx.c($$1, $$2) : -1, csn.G, csn.nd, csn.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> cyn.b($$0x.c(cyn.e)), csn.cw);
      $$0.a(cyn.e, csn.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fmx.a($$1, $$2) : -1, csn.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, csn.fc, csn.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dai.b);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, csn.fe, csn.fd);
      $$0.a(dai.b, csn.fe, csn.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, csn.fm);
      return $$0;
   }

   public int a(dfa $$0, cpm $$1, gu $$2) {
      erm $$3 = this.b.a(jb.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eah $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dfa $$0, @Nullable cop $$1, @Nullable gu $$2, int $$3) {
      erm $$4 = this.b.a(jb.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(erm $$0, csm... $$1) {
      for (csm $$2 : $$1) {
         this.b.a($$0, jb.f.a($$2));
      }
   }

   private void a(Set<dgd<?>> $$0, csm... $$1) {
      for (csm $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dgd<?> $$0, csm... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dgd<?>> a(csm $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
