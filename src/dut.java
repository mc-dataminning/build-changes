import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dut extends dlu {
   public static final MapCodec<dut> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("hook").forGetter($$0x -> $$0x.S), t()).apply($$0, dut::new)
   );
   public static final eaf b = eae.A;
   public static final eaf c = eae.a;
   public static final eaf d = eae.g;
   public static final eaf e = drm.b;
   public static final eaf f = drm.c;
   public static final eaf g = drm.d;
   public static final eaf h = drm.e;
   private static final Map<ja, eaf> i = dnr.f;
   private static final feq C = dlu.b(16.0, 1.0, 2.5);
   private static final feq Q = dlu.b(16.0, 0.0, 8.0);
   private static final int R = 10;
   private final dlu S;

   @Override
   public MapCodec<dut> a() {
      return a;
   }

   public dut(dlu $$0, dzn.d $$1) {
      super($$1);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.S = $$0;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$0.c(c) ? C : Q;
   }

   @Override
   public dzo a(dcl $$0) {
      dhv $$1 = $$0.q();
      iu $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), ja.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), ja.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), ja.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), ja.e)));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      if (!$$0.C && !$$3.fa().f() && $$3.fa().a(cyw.sW)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$3, eeo.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dip $$0, iu $$1, dzo $$2) {
      for (ja $$3 : new ja[]{ja.d, ja.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iu $$5 = $$1.a($$3, $$4);
            dzo $$6 = $$0.a_($$5);
            if ($$6.a(this.S)) {
               if ($$6.c(duu.b) == $$3.g()) {
                  duu.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected feq a(dzo $$0, dhv $$1, iu $$2, bwa $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dip $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      List<? extends bwa> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dip $$0, iu $$1, List<? extends bwa> $$2) {
      dzo $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bwa $$6 : $$2) {
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

   public boolean a(dzo $$0, ja $$1) {
      return $$0.a(this.S) ? $$0.c(duu.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
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
   protected dzo a(dzo $$0, dqv $$1) {
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
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
