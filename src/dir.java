import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dir extends dac {
   public static final MapCodec<dir> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dir::new)
   );
   public static final dns b = dnr.w;
   public static final dns c = dnr.a;
   public static final dns d = dnr.d;
   public static final dns e = dfp.b;
   public static final dns f = dfp.c;
   public static final dns g = dfp.d;
   public static final dns h = dfp.e;
   private static final Map<ih, dns> k = dby.f;
   protected static final eqm i = dac.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final eqm j = dac.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dac m;

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dac $$0, dna.d $$1) {
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
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dnb a(csu $$0) {
      cwh $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ih.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ih.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ih.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ih.e)));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      if (!$$0.B && !$$3.eU().b() && $$3.eU().a(cqp.rU)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, drp.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cxb $$0, ib $$1, dnb $$2) {
      for (ih $$3 : new ih[]{ih.d, ih.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ib $$5 = $$1.a($$3, $$4);
            dnb $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dis.b) == $$3.g()) {
                  dis.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(cxb $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends box> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (box $$6 : $$5) {
            if (!$$6.q_()) {
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
         $$0.a(new ib($$1), this, 10);
      }
   }

   public boolean a(dnb $$0, ih $$1) {
      return $$0.a(this.m) ? $$0.c(dis.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
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
   protected dnb a(dnb $$0, dey $$1) {
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
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
