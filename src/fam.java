import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fam {
   private static final int a = -1;
   private final ir<fal> b = new ir<>(32);
   private final Map<dac, Set<doe<?>>> c = Maps.newHashMap();

   public static fam a() {
      fam $$0 = new fam();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxe.a($$1, $$0x.c(dck.b) == dnx.a ? $$2.d() : $$2) : cwz.a(), dae.iI, dae.iH);
      $$0.a(dck.b, dae.iI, dae.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxe.a($$1, $$2) : cwz.a(), dae.i, dae.bu, dae.bt, dae.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fxe.a($$1, $$2) : cwz.a();
         } else {
            return -1;
         }
      }, dae.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> cwv.a(), dae.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cwv.b(), dae.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxe.b($$1, $$2) : cwv.c(), dae.aE, dae.aH, dae.aI, dae.aK, dae.ff, dae.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxe.c($$1, $$2) : -1, dae.G, dae.nd, dae.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dgd.b($$0x.c(dgd.f)), dae.cw);
      $$0.a(dgd.f, dae.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fxe.a($$1, $$2) : -1, dae.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, dae.fc, dae.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dhx.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, dae.fe, dae.fd);
      $$0.a(dhx.c, dae.fe, dae.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, dae.fm);
      return $$0;
   }

   public int a(dnb $$0, cxb $$1, ib $$2) {
      fal $$3 = this.b.a(ki.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eit $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dnb $$0, @Nullable cwe $$1, @Nullable ib $$2, int $$3) {
      fal $$4 = this.b.a(ki.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fal $$0, dac... $$1) {
      for (dac $$2 : $$1) {
         this.b.a($$0, ki.e.a($$2));
      }
   }

   private void a(Set<doe<?>> $$0, dac... $$1) {
      for (dac $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(doe<?> $$0, dac... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<doe<?>> a(dac $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
