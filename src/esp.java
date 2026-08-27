import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class esp {
   private static final int a = -1;
   private final ii<eso> b = new ii<>(32);
   private final Map<cua, Set<dhe<?>>> c = Maps.newHashMap();

   public static esp a() {
      esp $$0 = new esp();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fom.a($$1, $$0x.c(cwg.b) == dgx.a ? $$2.d() : $$2) : cqx.a(), cuc.iI, cuc.iH);
      $$0.a(cwg.b, cuc.iI, cuc.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fom.a($$1, $$2) : cqx.a(), cuc.i, cuc.bu, cuc.bt, cuc.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fom.a($$1, $$2) : cqx.a();
         } else {
            return -1;
         }
      }, cuc.rA);
      $$0.a(($$0x, $$1, $$2, $$3) -> cqt.a(), cuc.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> cqt.b(), cuc.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fom.b($$1, $$2) : cqt.c(), cuc.aE, cuc.aH, cuc.aI, cuc.aK, cuc.ff, cuc.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fom.c($$1, $$2) : -1, cuc.G, cuc.nd, cuc.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> daa.b($$0x.c(daa.f)), cuc.cw);
      $$0.a(daa.f, cuc.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fom.a($$1, $$2) : -1, cuc.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cuc.fc, cuc.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dbu.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cuc.fe, cuc.fd);
      $$0.a(dbu.c, cuc.fe, cuc.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cuc.fm);
      return $$0;
   }

   public int a(dgb $$0, cqz $$1, ht $$2) {
      eso $$3 = this.b.a(jy.f.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ebi $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dgb $$0, @Nullable cqc $$1, @Nullable ht $$2, int $$3) {
      eso $$4 = this.b.a(jy.f.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(eso $$0, cua... $$1) {
      for (cua $$2 : $$1) {
         this.b.a($$0, jy.f.a($$2));
      }
   }

   private void a(Set<dhe<?>> $$0, cua... $$1) {
      for (cua $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dhe<?> $$0, cua... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dhe<?>> a(cua $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
