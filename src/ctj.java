import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class ctj extends ctf {
   private static final ctk a = ctk.a(cqn.tV, cqn.ps, cqn.sh, cqn.ui, cqn.uj, cqn.um, cqn.uk, cqn.un, cqn.ul, cqn.uo);
   private static final ctk b = ctk.a(cqn.ox);
   private static final ctk c = ctk.a(cqn.qX);
   private static final Map<cqf, cpp.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cqn.tV, cpp.a.b);
      $$0.put(cqn.ps, cpp.a.e);
      $$0.put(cqn.sh, cpp.a.c);
      $$0.put(cqn.ui, cpp.a.d);
      $$0.put(cqn.uj, cpp.a.d);
      $$0.put(cqn.um, cpp.a.d);
      $$0.put(cqn.uk, cpp.a.d);
      $$0.put(cqn.un, cpp.a.d);
      $$0.put(cqn.ul, cpp.a.d);
      $$0.put(cqn.uo, cpp.a.d);
   });
   private static final ctk e = ctk.a(cqn.pt);

   public ctj(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cqk $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof cpc)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cqk a(cme $$0, iz $$1) {
      cqk $$2 = new cqk(cqn.us);
      ta $$3 = $$2.b("Explosion");
      cpp.a $$4 = cpp.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cqk $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof cpc) {
               $$5.add(((cpc)$$7.d()).c().f());
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
   public cqk a(iz $$0) {
      return new cqk(cqn.us);
   }

   @Override
   public ctr<?> ar_() {
      return ctr.h;
   }
}
