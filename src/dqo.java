import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dqo extends dhy {
   public static final MapCodec<dqo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lx.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dqo::new)
   );
   public static final dvu b = dvt.w;
   public static final dvu c = dvt.a;
   public static final dvu d = dvt.d;
   public static final dvu e = dnl.b;
   public static final dvu f = dnl.c;
   public static final dvu g = dnl.d;
   public static final dvu h = dnl.e;
   private static final Map<jl, dvu> k = dju.f;
   protected static final fab i = dhy.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final fab j = dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dhy m;

   @Override
   public MapCodec<dqo> a() {
      return a;
   }

   public dqo(dhy $$0, dvc.d $$1) {
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
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dvd a(czm $$0) {
      dea $$1 = $$0.q();
      jg $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jl.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jl.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jl.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jl.e)));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1.o().d() ? $$0.b(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      if (!$$0.C && !$$3.fb().f() && $$3.fb().a(cwb.rW)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, eaa.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dev $$0, jg $$1, dvd $$2) {
      for (jl $$3 : new jl[]{jl.d, jl.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jg $$5 = $$1.a($$3, $$4);
            dvd $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dqp.b) == $$3.g()) {
                  dqp.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fab a_(dvd $$0, dev $$1, jg $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dev $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      List<? extends btz> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dev $$0, jg $$1, List<? extends btz> $$2) {
      dvd $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (btz $$6 : $$2) {
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
         $$0.a(new jg($$1), this, 10);
      }
   }

   public boolean a(dvd $$0, jl $$1) {
      return $$0.a(this.m) ? $$0.c(dqp.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
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
   protected dvd a(dvd $$0, dmu $$1) {
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
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
