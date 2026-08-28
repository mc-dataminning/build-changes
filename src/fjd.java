import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fjd {
   private static final int a = -1;
   private final jt<fjc> b = new jt<>(32);
   private final Map<dgv, Set<dvd<?>>> c = Maps.newHashMap();

   public static fjd a() {
      fjd $$0 = new fjd();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggc.a($$1, $$0x.c(djd.b) == duw.a ? $$2.e() : $$2) : ddq.a(), dgx.iI, dgx.iH);
      $$0.a(djd.b, dgx.iI, dgx.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggc.a($$1, $$2) : ddq.a(), dgx.i, dgx.bu, dgx.bt, dgx.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? ggc.a($$1, $$2) : ddq.a();
         } else {
            return -1;
         }
      }, dgx.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> ddm.a(), dgx.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> ddm.b(), dgx.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggc.b($$1, $$2) : ddm.c(), dgx.aE, dgx.aH, dgx.aI, dgx.aK, dgx.ff, dgx.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggc.c($$1, $$2) : -1, dgx.G, dgx.nd, dgx.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dmy.b($$0x.c(dmy.f)), dgx.cw);
      $$0.a(dmy.f, dgx.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ggc.a($$1, $$2) : -1, dgx.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dgx.fc, dgx.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dos.c);
         return axn.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dgx.fe, dgx.fd);
      $$0.a(dos.c, dgx.fe, dgx.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dgx.fm);
      return $$0;
   }

   public int a(dua $$0, dds $$1, je $$2) {
      fjc $$3 = this.b.a(lu.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eqf $$4 = $$0.a((dcx)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dua $$0, @Nullable dcu $$1, @Nullable je $$2, int $$3) {
      fjc $$4 = this.b.a(lu.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fjc $$0, dgv... $$1) {
      for (dgv $$2 : $$1) {
         this.b.a($$0, lu.e.a($$2));
      }
   }

   private void a(Set<dvd<?>> $$0, dgv... $$1) {
      for (dgv $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dvd<?> $$0, dgv... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dvd<?>> a(dgv $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
