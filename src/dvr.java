import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dvr extends dmm {
   public static final MapCodec<dvr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("hook").forGetter($$0x -> $$0x.T), t()).apply($$0, dvr::new)
   );
   public static final ebf b = ebe.A;
   public static final ebf c = ebe.a;
   public static final ebf d = ebe.g;
   public static final ebf e = dsg.b;
   public static final ebf f = dsg.c;
   public static final ebf g = dsg.d;
   public static final ebf h = dsg.e;
   private static final Map<jb, ebf> i = dok.f;
   private static final ffr D = dmm.b(16.0, 1.0, 2.5);
   private static final ffr R = dmm.b(16.0, 0.0, 8.0);
   private static final int S = 10;
   private final dmm T;

   @Override
   public MapCodec<dvr> a() {
      return a;
   }

   public dvr(dmm $$0, ean.d $$1) {
      super($$1);
      this.l(
         this.C
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.T = $$0;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$0.c(c) ? D : R;
   }

   @Override
   public eao a(ddd $$0) {
      din $$1 = $$0.q();
      iv $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jb.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jb.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jb.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jb.e)));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      if (!$$0.C && !$$3.fa().f() && $$3.fa().a(czo.td)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$3, efo.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(djh $$0, iv $$1, eao $$2) {
      for (jb $$3 : new jb[]{jb.d, jb.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iv $$5 = $$1.a($$3, $$4);
            eao $$6 = $$0.a_($$5);
            if ($$6.a(this.T)) {
               if ($$6.c(dvs.b) == $$3.g()) {
                  dvs.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected ffr a(eao $$0, din $$1, iv $$2, bwi $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(djh $$0, iv $$1) {
      eao $$2 = $$0.a_($$1);
      List<? extends bwi> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(djh $$0, iv $$1, List<? extends bwi> $$2) {
      eao $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bwi $$6 : $$2) {
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
         $$0.a(new iv($$1), this, 10);
      }
   }

   public boolean a(eao $$0, jb $$1) {
      return $$0.a(this.T) ? $$0.c(dvs.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
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
   protected eao a(eao $$0, drp $$1) {
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
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
