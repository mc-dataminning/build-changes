import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dta extends dke {
   public static final MapCodec<dta> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("hook").forGetter($$0x -> $$0x.S), t()).apply($$0, dta::new)
   );
   public static final dyh b = dyg.A;
   public static final dyh c = dyg.a;
   public static final dyh d = dyg.g;
   public static final dyh e = dpw.b;
   public static final dyh f = dpw.c;
   public static final dyh g = dpw.d;
   public static final dyh h = dpw.e;
   private static final Map<jn, dyh> i = dmb.f;
   private static final fcr C = dke.b(16.0, 1.0, 2.5);
   private static final fcr Q = dke.b(16.0, 0.0, 8.0);
   private static final int R = 10;
   private final dke S;

   @Override
   public MapCodec<dta> a() {
      return a;
   }

   public dta(dke $$0, dxp.d $$1) {
      super($$1);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.S = $$0;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$0.c(c) ? C : Q;
   }

   @Override
   public dxq a(dax $$0) {
      dgf $$1 = $$0.q();
      ji $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jn.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jn.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jn.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jn.e)));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      if (!$$0.C && !$$3.eZ().f() && $$3.eZ().a(cxl.sU)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$3, ecp.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dgz $$0, ji $$1, dxq $$2) {
      for (jn $$3 : new jn[]{jn.d, jn.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ji $$5 = $$1.a($$3, $$4);
            dxq $$6 = $$0.a_($$5);
            if ($$6.a(this.S)) {
               if ($$6.c(dtb.b) == $$3.g()) {
                  dtb.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fcr a_(dxq $$0, dgz $$1, ji $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dgz $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      List<? extends bva> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dgz $$0, ji $$1, List<? extends bva> $$2) {
      dxq $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bva $$6 : $$2) {
            if (!$$6.g_()) {
               $$5 = true;
               break;
            }
         }
      }

      if ($$5 != $$4) {
         $$3 = $$3.b(b, Boolean.valueOf($$5));
         $$0.a($$1, $$3, 3);
         this.a($$0, $$1, $$3);
      }

      if ($$5) {
         $$0.a(new ji($$1), this, 10);
      }
   }

   public boolean a(dxq $$0, jn $$1) {
      return $$0.a(this.S) ? $$0.c(dtb.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      switch ($$1) {
         case c:
            return $$0.b(e, $$0.c(g)).b(f, $$0.c(h)).b(g, $$0.c(e)).b(h, $$0.c(f));
         case d:
            return $$0.b(e, $$0.c(f)).b(f, $$0.c(g)).b(g, $$0.c(h)).b(h, $$0.c(e));
         case b:
            return $$0.b(e, $$0.c(h)).b(f, $$0.c(e)).b(g, $$0.c(f)).b(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      switch ($$1) {
         case b:
            return $$0.b(e, $$0.c(g)).b(g, $$0.c(e));
         case c:
            return $$0.b(f, $$0.c(h)).b(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
