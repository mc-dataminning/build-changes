import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fqq {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jl<fqp> d = new jl<>(32);
   private final Map<dmm, Set<ebr<?>>> e = Maps.newHashMap();

   public static fqq a() {
      fqq $$0 = new fqq();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpt.a($$1, $$0x.c(dov.b) == ebk.a ? $$2.e() : $$2) : djf.a(), dmo.jk, dmo.jj);
      $$0.a(dov.b, dmo.jk, dmo.jj);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpt.a($$1, $$2) : djf.a(), dmo.i, dmo.bB, dmo.bA, dmo.gB, dmo.bD);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gpt.a($$1, $$2) : djf.a();
         } else {
            return -1;
         }
      }, dmo.tj, dmo.tk);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dmo.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dmo.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpt.b($$1, $$2) : -12012264, dmo.aK, dmo.aN, dmo.aO, dmo.aQ, dmo.fx, dmo.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpt.c($$1, $$2) : -1, dmo.J, dmo.nJ, dmo.fT);
      $$0.a(($$0x, $$1, $$2, $$3) -> dsv.b($$0x.c(dsv.f)), dmo.cH);
      $$0.a(dsv.f, dmo.cH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gpt.a($$1, $$2) : -1, dmo.ej);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dmo.fu, dmo.ft);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dus.c);
         return axw.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dmo.fw, dmo.fv);
      $$0.a(dus.c, dmo.fw, dmo.fv);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dmo.fF);
      return $$0;
   }

   public int a(eao $$0, djh $$1, iv $$2) {
      fqp $$3 = this.d.a(mg.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ewz $$4 = $$0.a((din)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(eao $$0, @Nullable dik $$1, @Nullable iv $$2, int $$3) {
      fqp $$4 = this.d.a(mg.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fqp $$0, dmm... $$1) {
      for (dmm $$2 : $$1) {
         this.d.a($$0, mg.e.a($$2));
      }
   }

   private void a(Set<ebr<?>> $$0, dmm... $$1) {
      for (dmm $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(ebr<?> $$0, dmm... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<ebr<?>> a(dmm $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
