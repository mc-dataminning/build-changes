import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dqu extends die {
   public static final MapCodec<dqu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ly.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dqu::new)
   );
   public static final dwa b = dvz.w;
   public static final dwa c = dvz.a;
   public static final dwa d = dvz.d;
   public static final dwa e = dnr.b;
   public static final dwa f = dnr.c;
   public static final dwa g = dnr.d;
   public static final dwa h = dnr.e;
   private static final Map<jm, dwa> k = dka.f;
   protected static final fah i = die.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final fah j = die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final die m;

   @Override
   public MapCodec<dqu> a() {
      return a;
   }

   public dqu(die $$0, dvi.d $$1) {
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
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dvj a(czs $$0) {
      deg $$1 = $$0.q();
      jh $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jm.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jm.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jm.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jm.e)));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1.o().d() ? $$0.b(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      if (!$$0.C && !$$3.fb().f() && $$3.fb().a(cwf.rW)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, eag.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dfb $$0, jh $$1, dvj $$2) {
      for (jm $$3 : new jm[]{jm.d, jm.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jh $$5 = $$1.a($$3, $$4);
            dvj $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dqv.b) == $$3.g()) {
                  dqv.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fah a_(dvj $$0, dfb $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dfb $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      List<? extends bue> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dfb $$0, jh $$1, List<? extends bue> $$2) {
      dvj $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bue $$6 : $$2) {
            if (!$$6.r_()) {
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
         $$0.a(new jh($$1), this, 10);
      }
   }

   public boolean a(dvj $$0, jm $$1) {
      return $$0.a(this.m) ? $$0.c(dqv.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
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
   protected dvj a(dvj $$0, dna $$1) {
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
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
