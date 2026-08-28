import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dsf extends djk {
   public static final MapCodec<dsf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dsf::new)
   );
   public static final dxm b = dxl.B;
   public static final dxm c = dxl.b;
   public static final dxm d = dxl.h;
   public static final dxm e = dpc.b;
   public static final dxm f = dpc.c;
   public static final dxm g = dpc.d;
   public static final dxm h = dpc.e;
   private static final Map<jn, dxm> k = dlh.f;
   protected static final fbs i = djk.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final fbs j = djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final djk m;

   @Override
   public MapCodec<dsf> a() {
      return a;
   }

   public dsf(djk $$0, dwu.d $$1) {
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
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dwv a(dae $$0) {
      dfl $$1 = $$0.q();
      ji $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jn.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jn.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jn.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jn.e)));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4.o().d() ? $$0.b(k.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      if (!$$0.C && !$$3.eZ().f() && $$3.eZ().a(cwr.sS)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, ebr.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dgg $$0, ji $$1, dwv $$2) {
      for (jn $$3 : new jn[]{jn.d, jn.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ji $$5 = $$1.a($$3, $$4);
            dwv $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dsg.b) == $$3.g()) {
                  dsg.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fbs a_(dwv $$0, dgg $$1, ji $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dgg $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      List<? extends buj> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dgg $$0, ji $$1, List<? extends buj> $$2) {
      dwv $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (buj $$6 : $$2) {
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
         $$0.a(new ji($$1), this, 10);
      }
   }

   public boolean a(dwv $$0, jn $$1) {
      return $$0.a(this.m) ? $$0.c(dsg.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
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
   protected dwv a(dwv $$0, doj $$1) {
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
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
