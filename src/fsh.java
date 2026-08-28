import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fsh {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jm<fsg> d = new jm<>(32);
   private final Map<dne, Set<ecj<?>>> e = Maps.newHashMap();

   public static fsh a() {
      fsh $$0 = new fsh();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grl.a($$1, $$0x.c(dpn.b) == ecc.a ? $$2.e() : $$2) : djx.a(), dng.jk, dng.jj);
      $$0.a(dpn.b, dng.jk, dng.jj);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grl.a($$1, $$2) : djx.a(), dng.i, dng.bB, dng.bA, dng.gB, dng.bD);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? grl.a($$1, $$2) : djx.a();
         } else {
            return -1;
         }
      }, dng.tj, dng.tk);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dng.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dng.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grl.b($$1, $$2) : -12012264, dng.aK, dng.aN, dng.aO, dng.aQ, dng.fx, dng.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grl.c($$1, $$2) : -10732494, dng.tl);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grl.d($$1, $$2) : -1, dng.J, dng.nJ, dng.fT);
      $$0.a(($$0x, $$1, $$2, $$3) -> dtn.b($$0x.c(dtn.f)), dng.cH);
      $$0.a(dtn.f, dng.cH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? grl.a($$1, $$2) : -1, dng.ej);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dng.fu, dng.ft);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dvk.c);
         return aya.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dng.fw, dng.fv);
      $$0.a(dvk.c, dng.fw, dng.fv);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dng.fF);
      return $$0;
   }

   public int a(ebg $$0, djz $$1, iw $$2) {
      fsg $$3 = this.d.a(mh.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         exu $$4 = $$0.a((djd)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(ebg $$0, @Nullable dja $$1, @Nullable iw $$2, int $$3) {
      fsg $$4 = this.d.a(mh.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fsg $$0, dne... $$1) {
      for (dne $$2 : $$1) {
         this.d.a($$0, mh.e.a($$2));
      }
   }

   private void a(Set<ecj<?>> $$0, dne... $$1) {
      for (dne $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(ecj<?> $$0, dne... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<ecj<?>> a(dne $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
