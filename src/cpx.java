import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cpx extends cpt {
   private static final cpy a = cpy.a(cna.tS, cna.pq, cna.sf, cna.ue, cna.uf, cna.ui, cna.ug, cna.uj, cna.uh, cna.uk);
   private static final cpy b = cpy.a(cna.ov);
   private static final cpy c = cpy.a(cna.qV);
   private static final Map<cms, cmb.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cna.tS, cmb.a.b);
      $$0.put(cna.pq, cmb.a.e);
      $$0.put(cna.sf, cmb.a.c);
      $$0.put(cna.ue, cmb.a.d);
      $$0.put(cna.uf, cmb.a.d);
      $$0.put(cna.ui, cmb.a.d);
      $$0.put(cna.ug, cmb.a.d);
      $$0.put(cna.uj, cmb.a.d);
      $$0.put(cna.uh, cmb.a.d);
      $$0.put(cna.uk, cmb.a.d);
   });
   private static final cpy e = cpy.a(cna.pr);

   public cpx(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cmx $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof clm)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cmx a(ciq $$0, iu $$1) {
      cmx $$2 = new cmx(cna.uo);
      sn $$3 = $$2.a("Explosion");
      cmb.a $$4 = cmb.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmx $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof clm) {
               $$5.add(((clm)$$7.d()).d().f());
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
   public cmx a(iu $$0) {
      return new cmx(cna.uo);
   }

   @Override
   public cqf<?> ar_() {
      return cqf.h;
   }
}
