import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dqa extends dhj {
   public static final MapCodec<dqa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dqa::new)
   );
   public static final dvf b = dve.w;
   public static final dvf c = dve.a;
   public static final dvf d = dve.d;
   public static final dvf e = dmx.b;
   public static final dvf f = dmx.c;
   public static final dvf g = dmx.d;
   public static final dvf h = dmx.e;
   private static final Map<jj, dvf> k = djf.f;
   protected static final ezm i = dhj.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ezm j = dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dhj m;

   @Override
   public MapCodec<dqa> a() {
      return a;
   }

   public dqa(dhj $$0, dun.d $$1) {
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
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public duo a(czk $$0) {
      ddl $$1 = $$0.q();
      je $$2 = $$0.a();
      return this.o()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jj.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jj.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jj.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jj.e)));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1.o().d() ? $$0.b(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      if (!$$0.B && !$$3.eW().f() && $$3.eW().a(cvt.rW)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dzl.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(deg $$0, je $$1, duo $$2) {
      for (jj $$3 : new jj[]{jj.d, jj.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            je $$5 = $$1.a($$3, $$4);
            duo $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dqb.b) == $$3.g()) {
                  dqb.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(deg $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bto> $$5 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bto $$6 : $$5) {
            if (!$$6.q_()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.b(b, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new je($$1), this, 10);
      }
   }

   public boolean a(duo $$0, jj $$1) {
      return $$0.a(this.m) ? $$0.c(dqb.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
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
   protected duo a(duo $$0, dmg $$1) {
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
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
