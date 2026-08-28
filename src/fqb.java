import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fqb {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jk<fqa> d = new jk<>(32);
   private final Map<dmf, Set<ebk<?>>> e = Maps.newHashMap();

   public static fqb a() {
      fqb $$0 = new fqb();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gph.a($$1, $$0x.c(doo.b) == ebd.a ? $$2.e() : $$2) : diy.a(), dmh.jk, dmh.jj);
      $$0.a(doo.b, dmh.jk, dmh.jj);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gph.a($$1, $$2) : diy.a(), dmh.i, dmh.bB, dmh.bA, dmh.gB, dmh.bD);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gph.a($$1, $$2) : diy.a();
         } else {
            return -1;
         }
      }, dmh.tj, dmh.tk);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dmh.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dmh.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gph.b($$1, $$2) : -12012264, dmh.aK, dmh.aN, dmh.aO, dmh.aQ, dmh.fx, dmh.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gph.c($$1, $$2) : -1, dmh.J, dmh.nJ, dmh.fT);
      $$0.a(($$0x, $$1, $$2, $$3) -> dso.b($$0x.c(dso.f)), dmh.cH);
      $$0.a(dso.f, dmh.cH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gph.a($$1, $$2) : -1, dmh.ej);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dmh.fu, dmh.ft);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dul.c);
         return axw.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dmh.fw, dmh.fv);
      $$0.a(dul.c, dmh.fw, dmh.fv);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dmh.fF);
      return $$0;
   }

   public int a(eah $$0, dja $$1, iu $$2) {
      fqa $$3 = this.d.a(mf.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ews $$4 = $$0.a((dig)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(eah $$0, @Nullable did $$1, @Nullable iu $$2, int $$3) {
      fqa $$4 = this.d.a(mf.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fqa $$0, dmf... $$1) {
      for (dmf $$2 : $$1) {
         this.d.a($$0, mf.e.a($$2));
      }
   }

   private void a(Set<ebk<?>> $$0, dmf... $$1) {
      for (dmf $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(ebk<?> $$0, dmf... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<ebk<?>> a(dmf $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
