import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class frs {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jm<frr> d = new jm<>(32);
   private final Map<dno, Set<ect<?>>> e = Maps.newHashMap();

   public static frs a() {
      frs $$0 = new frs();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gqw.a($$1, $$0x.c(dpx.b) == ecm.a ? $$2.e() : $$2) : dkh.a(), dnq.jk, dnq.jj);
      $$0.a(dpx.b, dnq.jk, dnq.jj);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gqw.a($$1, $$2) : dkh.a(), dnq.i, dnq.bB, dnq.bA, dnq.gB, dnq.bD);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gqw.a($$1, $$2) : dkh.a();
         } else {
            return -1;
         }
      }, dnq.tj, dnq.tk);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dnq.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dnq.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gqw.b($$1, $$2) : -12012264, dnq.aK, dnq.aN, dnq.aO, dnq.aQ, dnq.fx, dnq.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gqw.c($$1, $$2) : -10732494, dnq.tl);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gqw.d($$1, $$2) : -1, dnq.J, dnq.nJ, dnq.fT);
      $$0.a(($$0x, $$1, $$2, $$3) -> dtx.b($$0x.c(dtx.f)), dnq.cH);
      $$0.a(dtx.f, dnq.cH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gqw.a($$1, $$2) : -1, dnq.ej);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dnq.fu, dnq.ft);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dvu.c);
         return ayh.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dnq.fw, dnq.fv);
      $$0.a(dvu.c, dnq.fw, dnq.fv);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dnq.fF);
      return $$0;
   }

   public int a(ebq $$0, dkj $$1, iw $$2) {
      frr $$3 = this.d.a(mh.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eye $$4 = $$0.a((djn)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(ebq $$0, @Nullable djk $$1, @Nullable iw $$2, int $$3) {
      frr $$4 = this.d.a(mh.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(frr $$0, dno... $$1) {
      for (dno $$2 : $$1) {
         this.d.a($$0, mh.e.a($$2));
      }
   }

   private void a(Set<ect<?>> $$0, dno... $$1) {
      for (dno $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(ect<?> $$0, dno... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<ect<?>> a(dno $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
