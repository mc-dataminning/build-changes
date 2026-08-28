import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fpi {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jk<fph> d = new jk<>(32);
   private final Map<dlu, Set<ear<?>>> e = Maps.newHashMap();

   public static fpi a() {
      fpi $$0 = new fpi();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gok.a($$1, $$0x.c(dod.b) == eak.a ? $$2.e() : $$2) : din.a(), dlw.jg, dlw.jf);
      $$0.a(dod.b, dlw.jg, dlw.jf);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gok.a($$1, $$2) : din.a(), dlw.i, dlw.bB, dlw.bA, dlw.gx);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gok.a($$1, $$2) : din.a();
         } else {
            return -1;
         }
      }, dlw.tf, dlw.tg);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dlw.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dlw.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gok.b($$1, $$2) : -12012264, dlw.aK, dlw.aN, dlw.aO, dlw.aQ, dlw.ft, dlw.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gok.c($$1, $$2) : -1, dlw.J, dlw.nF, dlw.fP);
      $$0.a(($$0x, $$1, $$2, $$3) -> dsb.b($$0x.c(dsb.f)), dlw.cE);
      $$0.a(dsb.f, dlw.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gok.a($$1, $$2) : -1, dlw.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dlw.fq, dlw.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dtw.c);
         return axu.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dlw.fs, dlw.fr);
      $$0.a(dtw.c, dlw.fs, dlw.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dlw.fB);
      return $$0;
   }

   public int a(dzo $$0, dip $$1, iu $$2) {
      fph $$3 = this.d.a(mf.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         evz $$4 = $$0.a((dhv)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dzo $$0, @Nullable dhs $$1, @Nullable iu $$2, int $$3) {
      fph $$4 = this.d.a(mf.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fph $$0, dlu... $$1) {
      for (dlu $$2 : $$1) {
         this.d.a($$0, mf.e.a($$2));
      }
   }

   private void a(Set<ear<?>> $$0, dlu... $$1) {
      for (dlu $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(ear<?> $$0, dlu... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<ear<?>> a(dlu $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
