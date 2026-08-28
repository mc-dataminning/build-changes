import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fsf {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jl<fse> d = new jl<>(32);
   private final Map<dnc, Set<ech<?>>> e = Maps.newHashMap();

   public static fsf a() {
      fsf $$0 = new fsf();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grj.a($$1, $$0x.c(dpl.b) == eca.a ? $$2.e() : $$2) : djv.a(), dne.jk, dne.jj);
      $$0.a(dpl.b, dne.jk, dne.jj);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grj.a($$1, $$2) : djv.a(), dne.i, dne.bB, dne.bA, dne.gB, dne.bD);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? grj.a($$1, $$2) : djv.a();
         } else {
            return -1;
         }
      }, dne.tj, dne.tk);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dne.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dne.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grj.b($$1, $$2) : -12012264, dne.aK, dne.aN, dne.aO, dne.aQ, dne.fx, dne.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grj.c($$1, $$2) : -10732494, dne.tl);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grj.d($$1, $$2) : -1, dne.J, dne.nJ, dne.fT);
      $$0.a(($$0x, $$1, $$2, $$3) -> dtl.b($$0x.c(dtl.f)), dne.cH);
      $$0.a(dtl.f, dne.cH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grj.a($$1, $$2) : -1, dne.ej);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dne.fu, dne.ft);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dvi.c);
         return axy.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dne.fw, dne.fv);
      $$0.a(dvi.c, dne.fw, dne.fv);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dne.fF);
      return $$0;
   }

   public int a(ebe $$0, djx $$1, iv $$2) {
      fse $$3 = this.d.a(mg.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         exs $$4 = $$0.a((djb)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(ebe $$0, @Nullable diy $$1, @Nullable iv $$2, int $$3) {
      fse $$4 = this.d.a(mg.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fse $$0, dnc... $$1) {
      for (dnc $$2 : $$1) {
         this.d.a($$0, mg.e.a($$2));
      }
   }

   private void a(Set<ech<?>> $$0, dnc... $$1) {
      for (dnc $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(ech<?> $$0, dnc... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<ech<?>> a(dnc $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
