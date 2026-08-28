import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cyc extends cxy {
   private static final cyd a = cyd.a(cud.tX, cud.pt, cud.si, cud.ul, cud.um, cud.up, cud.un, cud.uq, cud.uo, cud.ur);
   private static final cyd b = cyd.a(cud.oy);
   private static final cyd c = cyd.a(cud.qY);
   private static final Map<ctv, cws.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cud.tX, cws.a.b);
      $$0.put(cud.pt, cws.a.e);
      $$0.put(cud.si, cws.a.c);
      $$0.put(cud.ul, cws.a.d);
      $$0.put(cud.um, cws.a.d);
      $$0.put(cud.up, cws.a.d);
      $$0.put(cud.un, cws.a.d);
      $$0.put(cud.uq, cws.a.d);
      $$0.put(cud.uo, cws.a.d);
      $$0.put(cud.ur, cws.a.d);
   });
   private static final cyd e = cyd.a(cud.pu);

   public cyc(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cua $$8 = $$0.a($$7);
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
               if (!($$8.g() instanceof csu)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cua a(cxw $$0, jl.a $$1) {
      cws.a $$2 = cws.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cua $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof csu) {
               $$5.add(((csu)$$7.g()).c().f());
            }
         }
      }

      cua $$8 = new cua(cud.uv);
      $$8.b(kn.T, new cws($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cua a(jl.a $$0) {
      return new cua(cud.uv);
   }

   @Override
   public cyl<?> ap_() {
      return cyl.h;
   }
}
