import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class doh extends dfc {
   public static final MapCodec<doh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lh.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, doh::new)
   );
   public static final dtt b = dts.w;
   public static final dtt c = dts.a;
   public static final dtt d = dts.d;
   public static final dtt e = dkw.b;
   public static final dtt f = dkw.c;
   public static final dtt g = dkw.d;
   public static final dtt h = dkw.e;
   private static final Map<iw, dtt> k = dgz.f;
   protected static final exn i = dfc.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final exn j = dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dfc m;

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dfc $$0, dtb.d $$1) {
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
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dtc a(cyd $$0) {
      dbg $$1 = $$0.q();
      ir $$2 = $$0.a();
      return this.n()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), iw.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), iw.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), iw.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), iw.e)));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      if (!$$0.C && !$$3.fg().d() && $$3.fg().a(cuk.ts)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dxv.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dca $$0, ir $$1, dtc $$2) {
      for (iw $$3 : new iw[]{iw.d, iw.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ir $$5 = $$1.a($$3, $$4);
            dtc $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(doi.b) == $$3.g()) {
                  doi.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dca $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends brv> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (brv $$6 : $$5) {
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
         $$0.a(new ir($$1), this, 10);
      }
   }

   public boolean a(dtc $$0, iw $$1) {
      return $$0.a(this.m) ? $$0.c(doi.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
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
   protected dtc a(dtc $$0, dke $$1) {
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
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
