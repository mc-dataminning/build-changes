import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frf implements fqu.a {
   private final eqm a;
   private final Map<aeq<cpm>, Map<String, dur>> b = Maps.newIdentityHashMap();
   private final Map<aeq<cpm>, Map<String, wd.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public frf(eqm $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elg $$0, fnl $$1, double $$2, double $$3, double $$4) {
      epx $$5 = this.a.j.m();
      aeq<cpm> $$6 = this.a.u.ac();
      gu $$7 = gu.a($$5.b().c, 0.0, $$5.b().e);
      elk $$8 = $$1.getBuffer(fnt.x());
      if (this.b.containsKey($$6)) {
         for (dur $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.f(), 500.0)) {
               fnj.a(
                  $$0,
                  $$8,
                  (double)$$9.g() - $$2,
                  (double)$$9.h() - $$3,
                  (double)$$9.i() - $$4,
                  (double)($$9.j() + 1) - $$2,
                  (double)($$9.k() + 1) - $$3,
                  (double)($$9.l() + 1) - $$4,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      Map<String, wd.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (wd.a $$11 : $$10.values()) {
            dur $$12 = $$11.a();
            if ($$7.a($$12.f(), 500.0)) {
               if ($$11.b()) {
                  fnj.a(
                     $$0,
                     $$8,
                     (double)$$12.g() - $$2,
                     (double)$$12.h() - $$3,
                     (double)$$12.i() - $$4,
                     (double)($$12.j() + 1) - $$2,
                     (double)($$12.k() + 1) - $$3,
                     (double)($$12.l() + 1) - $$4,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  fnj.a(
                     $$0,
                     $$8,
                     (double)$$12.g() - $$2,
                     (double)$$12.h() - $$3,
                     (double)$$12.i() - $$4,
                     (double)($$12.j() + 1) - $$2,
                     (double)($$12.k() + 1) - $$3,
                     (double)($$12.l() + 1) - $$4,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               }
            }
         }
      }
   }

   public void a(dur $$0, List<wd.a> $$1, aeq<cpm> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, wd.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (wd.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
