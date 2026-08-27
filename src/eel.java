import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class eel extends efi {
   public static final Codec<eel> a = Codec.unit(() -> eel.b);
   public static final eel b = new eel();
   private final Map<cys, cys> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cyu.m, cyu.pr);
      $$0.put(cyu.cn, cyu.pr);
      $$0.put(cyu.b, cyu.pv);
      $$0.put(cyu.eH, cyu.pw);
      $$0.put(cyu.eI, cyu.pw);
      $$0.put(cyu.cQ, cyu.ps);
      $$0.put(cyu.ni, cyu.ps);
      $$0.put(cyu.nk, cyu.pD);
      $$0.put(cyu.fj, cyu.pA);
      $$0.put(cyu.ng, cyu.pA);
      $$0.put(cyu.jI, cyu.pu);
      $$0.put(cyu.nw, cyu.pu);
      $$0.put(cyu.jE, cyu.pE);
      $$0.put(cyu.jD, cyu.pE);
      $$0.put(cyu.jK, cyu.pz);
      $$0.put(cyu.nu, cyu.pz);
      $$0.put(cyu.nK, cyu.pB);
      $$0.put(cyu.nI, cyu.pB);
      $$0.put(cyu.fP, cyu.pt);
      $$0.put(cyu.fQ, cyu.pt);
      $$0.put(cyu.eK, cyu.py);
      $$0.put(cyu.eJ, cyu.px);
      $$0.put(cyu.eW, cyu.eX);
   });

   private eel() {
   }

   @Override
   public efl.c a(cvu $$0, hz $$1, hz $$2, efl.c $$3, efl.c $$4, efh $$5) {
      cys $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dlj $$7 = $$4.b();
         dlj $$8 = $$6.o();
         if ($$7.b(dgl.b)) {
            $$8 = $$8.a(dgl.b, $$7.c(dgl.b));
         }

         if ($$7.b(dgl.c)) {
            $$8 = $$8.a(dgl.c, $$7.c(dgl.c));
         }

         if ($$7.b(dfu.b)) {
            $$8 = $$8.a(dfu.b, $$7.c(dfu.b));
         }

         return new efl.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected efk<?> a() {
      return efk.l;
   }
}
