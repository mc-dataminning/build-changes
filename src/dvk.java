import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dvk extends dmf {
   public static final MapCodec<dvk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("hook").forGetter($$0x -> $$0x.T), t()).apply($$0, dvk::new)
   );
   public static final eay b = eax.A;
   public static final eay c = eax.a;
   public static final eay d = eax.g;
   public static final eay e = drz.b;
   public static final eay f = drz.c;
   public static final eay g = drz.d;
   public static final eay h = drz.e;
   private static final Map<ja, eay> i = dod.f;
   private static final ffk D = dmf.b(16.0, 1.0, 2.5);
   private static final ffk R = dmf.b(16.0, 0.0, 8.0);
   private static final int S = 10;
   private final dmf T;

   @Override
   public MapCodec<dvk> a() {
      return a;
   }

   public dvk(dmf $$0, eag.d $$1) {
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
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return $$0.c(c) ? D : R;
   }

   @Override
   public eah a(dcw $$0) {
      dig $$1 = $$0.q();
      iu $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), ja.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), ja.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), ja.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), ja.e)));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      if (!$$0.C && !$$3.fb().f() && $$3.fb().a(czh.td)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$3, efh.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dja $$0, iu $$1, eah $$2) {
      for (ja $$3 : new ja[]{ja.d, ja.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iu $$5 = $$1.a($$3, $$4);
            eah $$6 = $$0.a_($$5);
            if ($$6.a(this.T)) {
               if ($$6.c(dvl.b) == $$3.g()) {
                  dvl.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected ffk a(eah $$0, dig $$1, iu $$2, bwf $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dja $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      List<? extends bwf> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dja $$0, iu $$1, List<? extends bwf> $$2) {
      eah $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bwf $$6 : $$2) {
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
         $$0.a(new iu($$1), this, 10);
      }
   }

   public boolean a(eah $$0, ja $$1) {
      return $$0.a(this.T) ? $$0.c(dvl.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
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
   protected eah a(eah $$0, dri $$1) {
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
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
