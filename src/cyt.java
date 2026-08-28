import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cyt extends cyp {
   private static final cyu a = cyu.a(cuu.tX, cuu.pt, cuu.si, cuu.ul, cuu.um, cuu.up, cuu.un, cuu.uq, cuu.uo, cuu.ur);
   private static final cyu b = cyu.a(cuu.oy);
   private static final cyu c = cyu.a(cuu.qY);
   private static final Map<cum, cxk.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cuu.tX, cxk.a.b);
      $$0.put(cuu.pt, cxk.a.e);
      $$0.put(cuu.si, cxk.a.c);
      $$0.put(cuu.ul, cxk.a.d);
      $$0.put(cuu.um, cxk.a.d);
      $$0.put(cuu.up, cxk.a.d);
      $$0.put(cuu.un, cxk.a.d);
      $$0.put(cuu.uq, cxk.a.d);
      $$0.put(cuu.uo, cxk.a.d);
      $$0.put(cuu.ur, cxk.a.d);
   });
   private static final cyu e = cyu.a(cuu.pu);

   public cyt(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cur $$8 = $$0.a($$7);
         if (!$$8.e()) {
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
               if (!($$8.g() instanceof ctl)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cur a(cqm $$0, jk.a $$1) {
      cxk.a $$2 = cxk.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cur $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof ctl) {
               $$5.add(((ctl)$$7.g()).c().f());
            }
         }
      }

      cur $$8 = new cur(cuu.uv);
      $$8.b(km.T, new cxk($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cur a(jk.a $$0) {
      return new cur(cuu.uv);
   }

   @Override
   public czb<?> ao_() {
      return czb.h;
   }
}
