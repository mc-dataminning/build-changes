import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fnb {
   private static final int a = -1;
   private final jw<fna> b = new jw<>(32);
   private final Map<dke, Set<dyp<?>>> c = Maps.newHashMap();

   public static fnb a() {
      fnb $$0 = new fnb();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkk.a($$1, $$0x.c(dmo.b) == dyi.a ? $$2.e() : $$2) : dgy.a(), dkg.iZ, dkg.iY);
      $$0.a(dmo.b, dkg.iZ, dkg.iY);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkk.a($$1, $$2) : dgy.a(), dkg.i, dkg.bB, dkg.bA, dkg.gq);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gkk.a($$1, $$2) : dgy.a();
         } else {
            return -1;
         }
      }, dkg.sW);
      $$0.a(($$0x, $$1, $$2, $$3) -> dgu.a(), dkg.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> dgu.b(), dkg.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkk.b($$1, $$2) : dgu.c(), dkg.aK, dkg.aN, dkg.aO, dkg.aQ, dkg.ft, dkg.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkk.c($$1, $$2) : -1, dkg.J, dkg.ny, dkg.fI);
      $$0.a(($$0x, $$1, $$2, $$3) -> dqj.b($$0x.c(dqj.f)), dkg.cE);
      $$0.a(dqj.f, dkg.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkk.a($$1, $$2) : -1, dkg.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dkg.fq, dkg.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dsd.c);
         return ayp.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dkg.fs, dkg.fr);
      $$0.a(dsd.c, dkg.fs, dkg.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dkg.fA);
      return $$0;
   }

   public int a(dxn $$0, dha $$1, jh $$2) {
      fna $$3 = this.b.a(ma.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ett $$4 = $$0.a((dgf)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dxn $$0, @Nullable dgc $$1, @Nullable jh $$2, int $$3) {
      fna $$4 = this.b.a(ma.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fna $$0, dke... $$1) {
      for (dke $$2 : $$1) {
         this.b.a($$0, ma.e.a($$2));
      }
   }

   private void a(Set<dyp<?>> $$0, dke... $$1) {
      for (dke $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dyp<?> $$0, dke... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dyp<?>> a(dke $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
