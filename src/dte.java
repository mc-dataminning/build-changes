import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dte extends dkl {
   public static final MapCodec<dte> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dte::new)
   );
   public static final dyl b = dyk.x;
   public static final dyl c = dyk.a;
   public static final dyl d = dyk.d;
   public static final dyl e = dqb.b;
   public static final dyl f = dqb.c;
   public static final dyl g = dqb.d;
   public static final dyl h = dqb.e;
   private static final Map<jm, dyl> k = dmj.f;
   protected static final fcr i = dkl.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final fcr j = dkl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dkl m;

   @Override
   public MapCodec<dte> a() {
      return a;
   }

   public dte(dkl $$0, dxt.d $$1) {
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
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dxu a(dbf $$0) {
      dgm $$1 = $$0.q();
      jh $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jm.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jm.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jm.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jm.e)));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4.o().d() ? $$0.b(k.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      if (!$$0.C && !$$3.eX().f() && $$3.eX().a(cxs.sJ)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, ecq.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dhh $$0, jh $$1, dxu $$2) {
      for (jm $$3 : new jm[]{jm.d, jm.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jh $$5 = $$1.a($$3, $$4);
            dxu $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dtf.b) == $$3.g()) {
                  dtf.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fcr a_(dxu $$0, dhh $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dhh $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      List<? extends bvj> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dhh $$0, jh $$1, List<? extends bvj> $$2) {
      dxu $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bvj $$6 : $$2) {
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
         $$0.a(new jh($$1), this, 10);
      }
   }

   public boolean a(dxu $$0, jm $$1) {
      return $$0.a(this.m) ? $$0.c(dtf.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
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
   protected dxu a(dxu $$0, dpk $$1) {
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
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
