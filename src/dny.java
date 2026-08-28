import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dny extends dfi {
   public static final MapCodec<dny> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dny::new)
   );
   public static final dtc b = dtb.w;
   public static final dtc c = dtb.a;
   public static final dtc d = dtb.d;
   public static final dtc e = dkw.b;
   public static final dtc f = dkw.c;
   public static final dtc g = dkw.d;
   public static final dtc h = dkw.e;
   private static final Map<jf, dtc> k = dhe.f;
   protected static final exa i = dfi.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final exa j = dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dfi m;

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(dfi $$0, dsk.d $$1) {
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
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dsl a(cxn $$0) {
      dbm $$1 = $$0.q();
      ja $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), jf.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), jf.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), jf.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), jf.e)));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      if (!$$0.B && !$$3.eV().e() && $$3.eV().a(cug.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dxh.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dcg $$0, ja $$1, dsl $$2) {
      for (jf $$3 : new jf[]{jf.d, jf.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ja $$5 = $$1.a($$3, $$4);
            dsl $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dnz.b) == $$3.g()) {
                  dnz.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dcg $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bsh> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bsh $$6 : $$5) {
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
         $$0.a(new ja($$1), this, 10);
      }
   }

   public boolean a(dsl $$0, jf $$1) {
      return $$0.a(this.m) ? $$0.c(dnz.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
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
   protected dsl a(dsl $$0, dkf $$1) {
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
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
