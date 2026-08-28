import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fof {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jy<foe> d = new jy<>(32);
   private final Map<dku, Set<dzp<?>>> e = Maps.newHashMap();

   public static fof a() {
      fof $$0 = new fof();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gng.a($$1, $$0x.c(dnd.b) == dzi.a ? $$2.e() : $$2) : dhn.a(), dkw.jg, dkw.jf);
      $$0.a(dnd.b, dkw.jg, dkw.jf);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gng.a($$1, $$2) : dhn.a(), dkw.i, dkw.bB, dkw.bA, dkw.gx);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gng.a($$1, $$2) : dhn.a();
         } else {
            return -1;
         }
      }, dkw.tf, dkw.tg);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dkw.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dkw.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> -9399763, dkw.aT, dkw.aU);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gng.b($$1, $$2) : -12012264, dkw.aK, dkw.aN, dkw.aO, dkw.aQ, dkw.ft, dkw.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gng.c($$1, $$2) : -1, dkw.J, dkw.nF, dkw.fP);
      $$0.a(($$0x, $$1, $$2, $$3) -> drb.b($$0x.c(drb.f)), dkw.cE);
      $$0.a(drb.f, dkw.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gng.a($$1, $$2) : -1, dkw.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dkw.fq, dkw.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dsw.c);
         return axu.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dkw.fs, dkw.fr);
      $$0.a(dsw.c, dkw.fs, dkw.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dkw.fB);
      return $$0;
   }

   public int a(dym $$0, dhp $$1, jj $$2) {
      foe $$3 = this.d.a(md.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eux $$4 = $$0.a((dgv)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dym $$0, @Nullable dgs $$1, @Nullable jj $$2, int $$3) {
      foe $$4 = this.d.a(md.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(foe $$0, dku... $$1) {
      for (dku $$2 : $$1) {
         this.d.a($$0, md.e.a($$2));
      }
   }

   private void a(Set<dzp<?>> $$0, dku... $$1) {
      for (dku $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(dzp<?> $$0, dku... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dzp<?>> a(dku $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
