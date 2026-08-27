import java.util.List;
import java.util.Map;

public class dba extends csl {
   public static final dfq a = dfp.w;
   public static final dfq b = dfp.a;
   public static final dfq c = dfp.d;
   public static final dfq d = cxx.a;
   public static final dfq e = cxx.b;
   public static final dfq f = cxx.c;
   public static final dfq g = cxx.d;
   private static final Map<ha, dfq> j = cud.f;
   protected static final ehw h = csl.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ehw i = csl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int k = 10;
   private final dbb l;

   public dba(dbb $$0, dey.d $$1) {
      super($$1);
      this.k(
         this.C
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
      );
      this.l = $$0;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return $$0.c(b) ? h : i;
   }

   @Override
   public dez a(clf $$0) {
      cor $$1 = $$0.q();
      gu $$2 = $$0.a();
      return this.n()
         .a(d, Boolean.valueOf(this.a($$1.a_($$2.e()), ha.c)))
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.h()), ha.f)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.f()), ha.d)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.g()), ha.e)));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1.o().d() ? $$0.a(j.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(a, Boolean.valueOf(true)));
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, cbm $$3) {
      if (!$$0.B && !$$3.eR().b() && $$3.eR().a(cja.rg)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$3, djj.M, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(cpl $$0, gu $$1, dez $$2) {
      for (ha $$3 : new ha[]{ha.d, ha.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            gu $$5 = $$1.a($$3, $$4);
            dez $$6 = $$0.a_($$5);
            if ($$6.a(this.l)) {
               if ($$6.c(dbb.a) == $$3.g()) {
                  this.l.a($$0, $$5, $$6, false, true, $$4, $$2);
               }
               break;
            }

            if (!$$6.a(this)) {
               break;
            }
         }
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if (!$$1.B) {
         if (!$$0.c(a)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.a_($$2).c(a)) {
         this.a($$1, $$2);
      }
   }

   private void a(cpl $$0, gu $$1) {
      dez $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(a);
      boolean $$4 = false;
      List<? extends bii> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bii $$6 : $$5) {
            if (!$$6.d_()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.a(a, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new gu($$1), this, 10);
      }
   }

   public boolean a(dez $$0, ha $$1) {
      return $$0.a(this.l) ? $$0.c(dbb.a) == $$1.g() : $$0.a(this);
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      switch ($$1) {
         case c:
            return $$0.a(d, $$0.c(f)).a(e, $$0.c(g)).a(f, $$0.c(d)).a(g, $$0.c(e));
         case d:
            return $$0.a(d, $$0.c(e)).a(e, $$0.c(f)).a(f, $$0.c(g)).a(g, $$0.c(d));
         case b:
            return $$0.a(d, $$0.c(g)).a(e, $$0.c(d)).a(f, $$0.c(e)).a(g, $$0.c(f));
         default:
            return $$0;
      }
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      switch ($$1) {
         case b:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         case c:
            return $$0.a(e, $$0.c(g)).a(g, $$0.c(e));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, c, d, e, g, f);
   }
}
