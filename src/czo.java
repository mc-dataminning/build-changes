import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class czo extends czk {
   private static final Map<cvg, cye.a> a = Map.of(
      cvo.tY,
      cye.a.b,
      cvo.pu,
      cye.a.e,
      cvo.sj,
      cye.a.c,
      cvo.un,
      cye.a.d,
      cvo.uo,
      cye.a.d,
      cvo.ur,
      cye.a.d,
      cvo.up,
      cye.a.d,
      cvo.us,
      cye.a.d,
      cvo.uq,
      cye.a.d,
      cvo.ut,
      cye.a.d
   );
   private static final czp b = czp.a(cvo.oA);
   private static final czp c = czp.a(cvo.qZ);
   private static final czp d = czp.a(cvo.pv);

   public czo(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cvl $$8 = $$0.a($$7);
         if (!$$8.f()) {
            if (a.containsKey($$8.h())) {
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
            } else if (d.a($$8)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else {
               if (!($$8.h() instanceof cuf)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cvl a(czi $$0, jp.a $$1) {
      cye.a $$2 = cye.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cvl $$7 = $$0.a($$6);
         if (!$$7.f()) {
            cye.a $$8 = a.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cuf) {
               $$5.add(((cuf)$$7.h()).c().f());
            }
         }
      }

      cvl $$9 = new cvl(cvo.ux);
      $$9.b(kr.W, new cye($$2, $$5, IntList.of(), $$4, $$3));
      return $$9;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvl a(jp.a $$0) {
      return new cvl(cvo.ux);
   }

   @Override
   public czy<?> as_() {
      return czy.h;
   }
}
