import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class elf extends emc {
   public static final MapCodec<elf> a = MapCodec.unit(() -> elf.b);
   public static final elf b = new elf();
   private final Map<deu, deu> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dew.m, dew.pr);
      $$0.put(dew.cn, dew.pr);
      $$0.put(dew.b, dew.pv);
      $$0.put(dew.eH, dew.pw);
      $$0.put(dew.eI, dew.pw);
      $$0.put(dew.cQ, dew.ps);
      $$0.put(dew.ni, dew.ps);
      $$0.put(dew.nk, dew.pD);
      $$0.put(dew.fj, dew.pA);
      $$0.put(dew.ng, dew.pA);
      $$0.put(dew.jI, dew.pu);
      $$0.put(dew.nw, dew.pu);
      $$0.put(dew.jE, dew.pE);
      $$0.put(dew.jD, dew.pE);
      $$0.put(dew.jK, dew.pz);
      $$0.put(dew.nu, dew.pz);
      $$0.put(dew.nK, dew.pB);
      $$0.put(dew.nI, dew.pB);
      $$0.put(dew.fP, dew.pt);
      $$0.put(dew.fQ, dew.pt);
      $$0.put(dew.eK, dew.py);
      $$0.put(dew.eJ, dew.px);
      $$0.put(dew.eW, dew.eX);
   });

   private elf() {
   }

   @Override
   public emf.c a(dbw $$0, iz $$1, iz $$2, emf.c $$3, emf.c $$4, emb $$5) {
      deu $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         drx $$7 = $$4.b();
         drx $$8 = $$6.n();
         if ($$7.b(dmo.b)) {
            $$8 = $$8.a(dmo.b, $$7.c(dmo.b));
         }

         if ($$7.b(dmo.c)) {
            $$8 = $$8.a(dmo.c, $$7.c(dmo.c));
         }

         if ($$7.b(dlx.b)) {
            $$8 = $$8.a(dlx.b, $$7.c(dlx.b));
         }

         return new emf.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eme<?> a() {
      return eme.l;
   }
}
