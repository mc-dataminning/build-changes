import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dll extends dcv {
   public static final MapCodec<dll> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lc.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dll::new)
   );
   public static final dqp b = dqo.w;
   public static final dqp c = dqo.a;
   public static final dqp d = dqo.d;
   public static final dqp e = dij.b;
   public static final dqp f = dij.c;
   public static final dqp g = dij.d;
   public static final dqp h = dij.e;
   private static final Map<ir, dqp> k = der.f;
   protected static final ety i = dcv.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ety j = dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dcv m;

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(dcv $$0, dpx.d $$1) {
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
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dpy a(cvl $$0) {
      cza $$1 = $$0.q();
      im $$2 = $$0.a();
      return this.n()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ir.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ir.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ir.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ir.e)));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      if (!$$0.B && !$$3.eV().d() && $$3.eV().a(csg.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dur.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(czu $$0, im $$1, dpy $$2) {
      for (ir $$3 : new ir[]{ir.d, ir.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            im $$5 = $$1.a($$3, $$4);
            dpy $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dlm.b) == $$3.g()) {
                  dlm.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(czu $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bql> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bql $$6 : $$5) {
            if (!$$6.r_()) {
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
         $$0.a(new im($$1), this, 10);
      }
   }

   public boolean a(dpy $$0, ir $$1) {
      return $$0.a(this.m) ? $$0.c(dlm.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
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
   protected dpy a(dpy $$0, dhs $$1) {
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
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
