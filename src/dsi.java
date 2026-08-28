import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dsi extends djn {
   public static final MapCodec<dsi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dsi::new)
   );
   public static final dxp b = dxo.B;
   public static final dxp c = dxo.b;
   public static final dxp d = dxo.h;
   public static final dxp e = dpf.b;
   public static final dxp f = dpf.c;
   public static final dxp g = dpf.d;
   public static final dxp h = dpf.e;
   private static final Map<jn, dxp> k = dlk.f;
   protected static final fbv i = djn.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final fbv j = djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final djn m;

   @Override
   public MapCodec<dsi> a() {
      return a;
   }

   public dsi(djn $$0, dwx.d $$1) {
      super($$1);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.m = $$0;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dwy a(dah $$0) {
      dfo $$1 = $$0.q();
      ji $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jn.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jn.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jn.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jn.e)));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4.o().d() ? $$0.b(k.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      if (!$$0.C && !$$3.eZ().f() && $$3.eZ().a(cwu.sS)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, ebu.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dgj $$0, ji $$1, dwy $$2) {
      for (jn $$3 : new jn[]{jn.d, jn.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ji $$5 = $$1.a($$3, $$4);
            dwy $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dsj.b) == $$3.g()) {
                  dsj.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fbv a_(dwy $$0, dgj $$1, ji $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dgj $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      List<? extends bum> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dgj $$0, ji $$1, List<? extends bum> $$2) {
      dwy $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bum $$6 : $$2) {
            if (!$$6.s_()) {
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

   public boolean a(dwy $$0, jn $$1) {
      return $$0.a(this.m) ? $$0.c(dsj.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
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
   protected dwy a(dwy $$0, dom $$1) {
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
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
