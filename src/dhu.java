import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dhu extends czf {
   public static final MapCodec<dhu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dhu::new)
   );
   public static final dmv b = dmu.w;
   public static final dmv c = dmu.a;
   public static final dmv d = dmu.d;
   public static final dmv e = des.b;
   public static final dmv f = des.c;
   public static final dmv g = des.d;
   public static final dmv h = des.e;
   private static final Map<ih, dmv> k = dbb.f;
   protected static final epo i = czf.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final epo j = czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final czf m;

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   public dhu(czf $$0, dmd.d $$1) {
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
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dme a(crx $$0) {
      cvk $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ih.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ih.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ih.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ih.e)));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      if (!$$0.B && !$$3.eR().b() && $$3.eR().a(cpt.rU)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dqr.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cwe $$0, ib $$1, dme $$2) {
      for (ih $$3 : new ih[]{ih.d, ih.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ib $$5 = $$1.a($$3, $$4);
            dme $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dhv.b) == $$3.g()) {
                  dhv.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(cwe $$0, ib $$1) {
      dme $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bof> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bof $$6 : $$5) {
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
         $$0.a(new ib($$1), this, 10);
      }
   }

   public boolean a(dme $$0, ih $$1) {
      return $$0.a(this.m) ? $$0.c(dhv.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
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
   protected dme a(dme $$0, deb $$1) {
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
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
