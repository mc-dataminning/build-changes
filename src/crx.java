import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class crx extends crt {
   private static final cry a = cry.a(cpc.tV, cpc.ps, cpc.sh, cpc.uh, cpc.ui, cpc.ul, cpc.uj, cpc.um, cpc.uk, cpc.un);
   private static final cry b = cry.a(cpc.ox);
   private static final cry c = cry.a(cpc.qX);
   private static final Map<cou, cod.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cpc.tV, cod.a.b);
      $$0.put(cpc.ps, cod.a.e);
      $$0.put(cpc.sh, cod.a.c);
      $$0.put(cpc.uh, cod.a.d);
      $$0.put(cpc.ui, cod.a.d);
      $$0.put(cpc.ul, cod.a.d);
      $$0.put(cpc.uj, cod.a.d);
      $$0.put(cpc.um, cod.a.d);
      $$0.put(cpc.uk, cod.a.d);
      $$0.put(cpc.un, cod.a.d);
   });
   private static final cry e = cry.a(cpc.pt);

   public crx(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         coz $$8 = $$0.a($$7);
         if (!$$8.b()) {
            if (a.a($$8)) {
               if ($$4) {
                  return false;
               }

               $$4 = true;
            } else if (c.a($$8)) {
               if ($$6) {
                  return false;
               }

               $$6 = true;
            } else if (b.a($$8)) {
               if ($$5) {
                  return false;
               }

               $$5 = true;
            } else if (e.a($$8)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else {
               if (!($$8.d() instanceof cno)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public coz a(ckr $$0, iw $$1) {
      coz $$2 = new coz(cpc.ur);
      sw $$3 = $$2.a("Explosion");
      cod.a $$4 = cod.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         coz $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof cno) {
               $$5.add(((cno)$$7.d()).d().f());
            }
         }
      }

      $$3.b("Colors", $$5);
      $$3.a("Type", (byte)$$4.a());
      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public coz a(iw $$0) {
      return new coz(cpc.ur);
   }

   @Override
   public csf<?> at_() {
      return csf.h;
   }
}
