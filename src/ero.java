import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ero {
   private static final int a = -1;
   private final hl<ern> b = new hl<>(32);
   private final Map<csk, Set<dgb<?>>> c = Maps.newHashMap();

   public static ero a() {
      ero $$0 = new ero();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fms.a($$1, $$0x.c(cuo.a) == dfu.a ? $$2.d() : $$2) : cpi.a(), csl.iI, csl.iH);
      $$0.a(cuo.a, csl.iI, csl.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fms.a($$1, $$2) : cpi.a(), csl.i, csl.bu, csl.bt, csl.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fms.a($$1, $$2) : cpi.a();
         } else {
            return -1;
         }
      }, csl.rA);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpe.a(), csl.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cpe.b(), csl.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fms.b($$1, $$2) : cpe.c(), csl.aE, csl.aH, csl.aI, csl.aK, csl.ff, csl.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fms.c($$1, $$2) : -1, csl.G, csl.nd, csl.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> cyl.b($$0x.c(cyl.e)), csl.cw);
      $$0.a(cyl.e, csl.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fms.a($$1, $$2) : -1, csl.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, csl.fc, csl.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dag.b);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, csl.fe, csl.fd);
      $$0.a(dag.b, csl.fe, csl.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, csl.fm);
      return $$0;
   }

   public int a(dey $$0, cpk $$1, gv $$2) {
      ern $$3 = this.b.a(jc.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eaf $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dey $$0, @Nullable com $$1, @Nullable gv $$2, int $$3) {
      ern $$4 = this.b.a(jc.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(ern $$0, csk... $$1) {
      for (csk $$2 : $$1) {
         this.b.a($$0, jc.f.a($$2));
      }
   }

   private void a(Set<dgb<?>> $$0, csk... $$1) {
      for (csk $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dgb<?> $$0, csk... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dgb<?>> a(csk $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
