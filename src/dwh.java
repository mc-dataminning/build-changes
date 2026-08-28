import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dwh extends dnc {
   public static final MapCodec<dwh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("hook").forGetter($$0x -> $$0x.T), t()).apply($$0, dwh::new)
   );
   public static final ebv b = ebu.A;
   public static final ebv c = ebu.a;
   public static final ebv d = ebu.g;
   public static final ebv e = dsw.b;
   public static final ebv f = dsw.c;
   public static final ebv g = dsw.d;
   public static final ebv h = dsw.e;
   private static final Map<jb, ebv> i = dpa.f;
   private static final fgk D = dnc.b(16.0, 1.0, 2.5);
   private static final fgk R = dnc.b(16.0, 0.0, 8.0);
   private static final int S = 10;
   private final dnc T;

   @Override
   public MapCodec<dwh> a() {
      return a;
   }

   public dwh(dnc $$0, ebd.d $$1) {
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
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$0.c(c) ? D : R;
   }

   @Override
   public ebe a(ddr $$0) {
      djb $$1 = $$0.q();
      iv $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jb.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jb.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jb.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jb.e)));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      if (!$$0.C && !$$3.fb().f() && $$3.fb().a(dac.td)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$3, ege.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(djx $$0, iv $$1, ebe $$2) {
      for (jb $$3 : new jb[]{jb.d, jb.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iv $$5 = $$1.a($$3, $$4);
            ebe $$6 = $$0.a_($$5);
            if ($$6.a(this.T)) {
               if ($$6.c(dwi.b) == $$3.g()) {
                  dwi.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fgk a(ebe $$0, djb $$1, iv $$2, bwt $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(djx $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      List<? extends bwt> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(djx $$0, iv $$1, List<? extends bwt> $$2) {
      ebe $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bwt $$6 : $$2) {
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

   public boolean a(ebe $$0, jb $$1) {
      return $$0.a(this.T) ? $$0.c(dwi.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
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
   protected ebe a(ebe $$0, dsf $$1) {
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
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
