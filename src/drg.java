import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class drg extends diq {
   public static final MapCodec<drg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, drg::new)
   );
   public static final dwm b = dwl.w;
   public static final dwm c = dwl.a;
   public static final dwm d = dwl.d;
   public static final dwm e = dod.b;
   public static final dwm f = dod.c;
   public static final dwm g = dod.d;
   public static final dwm h = dod.e;
   private static final Map<jm, dwm> k = dkm.f;
   protected static final fas i = diq.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final fas j = diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final diq m;

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   public drg(diq $$0, dvu.d $$1) {
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
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dvv a(dad $$0) {
      der $$1 = $$0.q();
      jh $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jm.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jm.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jm.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jm.e)));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4.o().d() ? $$0.b(k.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      if (!$$0.C && !$$3.eX().f() && $$3.eX().a(cwq.sm)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, ear.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dfm $$0, jh $$1, dvv $$2) {
      for (jm $$3 : new jm[]{jm.d, jm.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jh $$5 = $$1.a($$3, $$4);
            dvv $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(drh.b) == $$3.g()) {
                  drh.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fas a_(dvv $$0, dfm $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dfm $$0, jh $$1) {
      dvv $$2 = $$0.a_($$1);
      List<? extends bul> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dfm $$0, jh $$1, List<? extends bul> $$2) {
      dvv $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bul $$6 : $$2) {
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

   public boolean a(dvv $$0, jm $$1) {
      return $$0.a(this.m) ? $$0.c(drh.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
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
   protected dvv a(dvv $$0, dnm $$1) {
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
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
