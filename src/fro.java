import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fro implements frd.a {
   private final eql a;
   private final Map<aeq<cpl>, Map<String, duq>> b = Maps.newIdentityHashMap();
   private final Map<aeq<cpl>, Map<String, wd.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fro(eql $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elf $$0, fnu $$1, double $$2, double $$3, double $$4) {
      epw $$5 = this.a.j.m();
      aeq<cpl> $$6 = this.a.r.ac();
      gu $$7 = gu.a($$5.b().c, 0.0, $$5.b().e);
      elj $$8 = $$1.getBuffer(foc.x());
      if (this.b.containsKey($$6)) {
         for (duq $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.f(), 500.0)) {
               fns.a(
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
            duq $$12 = $$11.a();
            if ($$7.a($$12.f(), 500.0)) {
               if ($$11.b()) {
                  fns.a(
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
                  fns.a(
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

   public void a(duq $$0, List<wd.a> $$1, aeq<cpl> $$2) {
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
