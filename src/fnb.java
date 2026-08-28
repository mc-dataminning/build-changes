import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fnb {
   private static final int a = -1;
   private final jw<fna> b = new jw<>(32);
   private final Map<dkd, Set<dyq<?>>> c = Maps.newHashMap();

   public static fnb a() {
      fnb $$0 = new fnb();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkm.a($$1, $$0x.c(dmm.b) == dyj.a ? $$2.e() : $$2) : dgx.a(), dkf.jg, dkf.jf);
      $$0.a(dmm.b, dkf.jg, dkf.jf);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkm.a($$1, $$2) : dgx.a(), dkf.i, dkf.bB, dkf.bA, dkf.gx);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gkm.a($$1, $$2) : dgx.a();
         } else {
            return -1;
         }
      }, dkf.td);
      $$0.a(($$0x, $$1, $$2, $$3) -> dgt.a(), dkf.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> dgt.b(), dkf.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkm.b($$1, $$2) : dgt.c(), dkf.aK, dkf.aN, dkf.aO, dkf.aQ, dkf.ft, dkf.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkm.c($$1, $$2) : -1, dkf.J, dkf.nF, dkf.fP);
      $$0.a(($$0x, $$1, $$2, $$3) -> dqk.b($$0x.c(dqk.f)), dkf.cE);
      $$0.a(dqk.f, dkf.cE);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gkm.a($$1, $$2) : -1, dkf.ef);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dkf.fq, dkf.fp);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dse.c);
         return ayf.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dkf.fs, dkf.fr);
      $$0.a(dse.c, dkf.fs, dkf.fr);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dkf.fB);
      return $$0;
   }

   public int a(dxo $$0, dgz $$1, jh $$2) {
      fna $$3 = this.b.a(ma.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         etu $$4 = $$0.a((dge)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dxo $$0, @Nullable dgb $$1, @Nullable jh $$2, int $$3) {
      fna $$4 = this.b.a(ma.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fna $$0, dkd... $$1) {
      for (dkd $$2 : $$1) {
         this.b.a($$0, ma.e.a($$2));
      }
   }

   private void a(Set<dyq<?>> $$0, dkd... $$1) {
      for (dkd $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dyq<?> $$0, dkd... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dyq<?>> a(dkd $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
