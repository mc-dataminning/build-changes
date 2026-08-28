import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fqv {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jl<fqu> d = new jl<>(32);
   private final Map<dmr, Set<ebw<?>>> e = Maps.newHashMap();

   public static fqv a() {
      fqv $$0 = new fqv();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpy.a($$1, $$0x.c(dpa.b) == ebp.a ? $$2.e() : $$2) : djk.a(), dmt.jk, dmt.jj);
      $$0.a(dpa.b, dmt.jk, dmt.jj);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpy.a($$1, $$2) : djk.a(), dmt.i, dmt.bB, dmt.bA, dmt.gB, dmt.bD);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gpy.a($$1, $$2) : djk.a();
         } else {
            return -1;
         }
      }, dmt.tj, dmt.tk);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dmt.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dmt.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpy.b($$1, $$2) : -12012264, dmt.aK, dmt.aN, dmt.aO, dmt.aQ, dmt.fx, dmt.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpy.c($$1, $$2) : -10732494, dmt.tl);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpy.d($$1, $$2) : -1, dmt.J, dmt.nJ, dmt.fT);
      $$0.a(($$0x, $$1, $$2, $$3) -> dta.b($$0x.c(dta.f)), dmt.cH);
      $$0.a(dta.f, dmt.cH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpy.a($$1, $$2) : -1, dmt.ej);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dmt.fu, dmt.ft);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dux.c);
         return axw.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dmt.fw, dmt.fv);
      $$0.a(dux.c, dmt.fw, dmt.fv);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dmt.fF);
      return $$0;
   }

   public int a(eat $$0, djm $$1, iv $$2) {
      fqu $$3 = this.d.a(mg.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         exe $$4 = $$0.a((diq)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(eat $$0, @Nullable din $$1, @Nullable iv $$2, int $$3) {
      fqu $$4 = this.d.a(mg.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fqu $$0, dmr... $$1) {
      for (dmr $$2 : $$1) {
         this.d.a($$0, mg.e.a($$2));
      }
   }

   private void a(Set<ebw<?>> $$0, dmr... $$1) {
      for (dmr $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(ebw<?> $$0, dmr... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<ebw<?>> a(dmr $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
