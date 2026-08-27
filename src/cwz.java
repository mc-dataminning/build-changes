import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cwz extends cwv {
   private static final cxa a = cxa.a(ctc.tX, ctc.pt, ctc.si, ctc.ul, ctc.um, ctc.up, ctc.un, ctc.uq, ctc.uo, ctc.ur);
   private static final cxa b = cxa.a(ctc.oy);
   private static final cxa c = cxa.a(ctc.qY);
   private static final Map<csu, cvq.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ctc.tX, cvq.a.b);
      $$0.put(ctc.pt, cvq.a.e);
      $$0.put(ctc.si, cvq.a.c);
      $$0.put(ctc.ul, cvq.a.d);
      $$0.put(ctc.um, cvq.a.d);
      $$0.put(ctc.up, cvq.a.d);
      $$0.put(ctc.un, cvq.a.d);
      $$0.put(ctc.uq, cvq.a.d);
      $$0.put(ctc.uo, cvq.a.d);
      $$0.put(ctc.ur, cvq.a.d);
   });
   private static final cxa e = cxa.a(ctc.pu);

   public cwz(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         csz $$8 = $$0.a($$7);
         if (!$$8.d()) {
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
               if (!($$8.f() instanceof crt)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public csz a(cou $$0, iy.a $$1) {
      cvq.a $$2 = cvq.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         csz $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.f());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.f() instanceof crt) {
               $$5.add(((crt)$$7.f()).c().f());
            }
         }
      }

      csz $$8 = new csz(ctc.uv);
      $$8.b(ka.Q, new cvq($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csz a(iy.a $$0) {
      return new csz(ctc.uv);
   }

   @Override
   public cxh<?> ao_() {
      return cxh.h;
   }
}
