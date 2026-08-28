import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eoy extends epw {
   public static final MapCodec<eoy> a = MapCodec.unit(() -> eoy.b);
   public static final eoy b = new eoy();
   private final Map<die, die> c = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dig.m, dig.pr);
      $$0.put(dig.cn, dig.pr);
      $$0.put(dig.b, dig.pv);
      $$0.put(dig.eH, dig.pw);
      $$0.put(dig.eI, dig.pw);
      $$0.put(dig.cQ, dig.ps);
      $$0.put(dig.ni, dig.ps);
      $$0.put(dig.nk, dig.pD);
      $$0.put(dig.fj, dig.pA);
      $$0.put(dig.ng, dig.pA);
      $$0.put(dig.jI, dig.pu);
      $$0.put(dig.nw, dig.pu);
      $$0.put(dig.jE, dig.pE);
      $$0.put(dig.jD, dig.pE);
      $$0.put(dig.jK, dig.pz);
      $$0.put(dig.nu, dig.pz);
      $$0.put(dig.nK, dig.pB);
      $$0.put(dig.nI, dig.pB);
      $$0.put(dig.fP, dig.pt);
      $$0.put(dig.fQ, dig.pt);
      $$0.put(dig.eK, dig.py);
      $$0.put(dig.eJ, dig.px);
      $$0.put(dig.eW, dig.eX);
   });

   private eoy() {
   }

   @Override
   public epz.c a(dfe $$0, jh $$1, jh $$2, epz.c $$3, epz.c $$4, epv $$5) {
      die $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dvj $$7 = $$4.b();
         dvj $$8 = $$6.m();
         if ($$7.b(dpy.b)) {
            $$8 = $$8.b(dpy.b, $$7.c(dpy.b));
         }

         if ($$7.b(dpy.c)) {
            $$8 = $$8.b(dpy.c, $$7.c(dpy.c));
         }

         if ($$7.b(dph.b)) {
            $$8 = $$8.b(dph.b, $$7.c(dph.b));
         }

         return new epz.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected epy<?> a() {
      return epy.l;
   }
}
