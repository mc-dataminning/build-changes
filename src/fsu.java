import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fsu implements fsj.a {
   private final ero a;
   private final Map<afv<cqz>, Map<String, dvs>> b = Maps.newIdentityHashMap();
   private final Map<afv<cqz>, Map<String, xi.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fsu(ero $$0) {
      this.a = $$0;
   }

   @Override
   public void a(emh $$0, fpb $$1, double $$2, double $$3, double $$4) {
      eqz $$5 = this.a.j.m();
      afv<cqz> $$6 = this.a.r.ac();
      ht $$7 = ht.a($$5.b().c, 0.0, $$5.b().e);
      eml $$8 = $$1.getBuffer(fpj.x());
      if (this.b.containsKey($$6)) {
         for (dvs $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.f(), 500.0)) {
               foz.a(
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

      Map<String, xi.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (xi.a $$11 : $$10.values()) {
            dvs $$12 = $$11.a();
            if ($$7.a($$12.f(), 500.0)) {
               if ($$11.b()) {
                  foz.a(
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
                  foz.a(
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

   public void a(dvs $$0, List<xi.a> $$1, afv<cqz> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, xi.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (xi.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
