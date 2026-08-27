import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cqg extends cqc {
   private static final cqh a = cqh.a(cnj.tV, cnj.ps, cnj.sh, cnj.uh, cnj.ui, cnj.ul, cnj.uj, cnj.um, cnj.uk, cnj.un);
   private static final cqh b = cqh.a(cnj.ox);
   private static final cqh c = cqh.a(cnj.qX);
   private static final Map<cnb, cml.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cnj.tV, cml.a.b);
      $$0.put(cnj.ps, cml.a.e);
      $$0.put(cnj.sh, cml.a.c);
      $$0.put(cnj.uh, cml.a.d);
      $$0.put(cnj.ui, cml.a.d);
      $$0.put(cnj.ul, cml.a.d);
      $$0.put(cnj.uj, cml.a.d);
      $$0.put(cnj.um, cml.a.d);
      $$0.put(cnj.uk, cml.a.d);
      $$0.put(cnj.un, cml.a.d);
   });
   private static final cqh e = cqh.a(cnj.pt);

   public cqg(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cng $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof clw)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cng a(ciz $$0, iu $$1) {
      cng $$2 = new cng(cnj.ur);
      so $$3 = $$2.a("Explosion");
      cml.a $$4 = cml.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cng $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof clw) {
               $$5.add(((clw)$$7.d()).d().f());
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
   public cng a(iu $$0) {
      return new cng(cnj.ur);
   }

   @Override
   public cqo<?> at_() {
      return cqo.h;
   }
}
