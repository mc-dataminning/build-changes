import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dfn extends cwy {
   public static final MapCodec<dfn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dfn::new)
   );
   public static final dkg b = dkf.w;
   public static final dkg c = dkf.a;
   public static final dkg d = dkf.d;
   public static final dkg e = dcl.b;
   public static final dkg f = dcl.c;
   public static final dkg g = dcl.d;
   public static final dkg h = dcl.e;
   private static final Map<ic, dkg> k = cyu.f;
   protected static final emv i = cwy.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final emv j = cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final cwy m;

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   public dfn(cwy $$0, djo.d $$1) {
      super($$1);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(h, Boolean.valueOf(false))
      );
      this.m = $$0;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public djp a(cpp $$0) {
      ctd $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ic.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ic.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ic.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ic.e)));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public djp a(ctx $$0, hx $$1, djp $$2, cfq $$3) {
      if (!$$0.B && !$$3.eT().b() && $$3.eT().a(cnj.rU)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dnz.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(ctx $$0, hx $$1, djp $$2) {
      for (ic $$3 : new ic[]{ic.d, ic.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            hx $$5 = $$1.a($$3, $$4);
            djp $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dfo.b) == $$3.g()) {
                  dfo.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(ctx $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends blw> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (blw $$6 : $$5) {
            if (!$$6.r_()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.a(b, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new hx($$1), this, 10);
      }
   }

   public boolean a(djp $$0, ic $$1) {
      return $$0.a(this.m) ? $$0.c(dfo.b) == $$1.g() : $$0.a(this);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      switch ($$1) {
         case c:
            return $$0.a(e, $$0.c(g)).a(f, $$0.c(h)).a(g, $$0.c(e)).a(h, $$0.c(f));
         case d:
            return $$0.a(e, $$0.c(f)).a(f, $$0.c(g)).a(g, $$0.c(h)).a(h, $$0.c(e));
         case b:
            return $$0.a(e, $$0.c(h)).a(f, $$0.c(e)).a(g, $$0.c(f)).a(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      switch ($$1) {
         case b:
            return $$0.a(e, $$0.c(g)).a(g, $$0.c(e));
         case c:
            return $$0.a(f, $$0.c(h)).a(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
