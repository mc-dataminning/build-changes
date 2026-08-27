import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class ddt extends cvf {
   public static final MapCodec<ddt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.f.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, ddt::new)
   );
   public static final die b = did.w;
   public static final die c = did.a;
   public static final die d = did.d;
   public static final die e = das.b;
   public static final die f = das.c;
   public static final die g = das.d;
   public static final die h = das.e;
   private static final Map<ib, die> k = cxb.f;
   protected static final eks i = cvf.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final eks j = cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final cvf m;

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   public ddt(cvf $$0, dhm.d $$1) {
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
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dhn a(cnw $$0) {
      crl $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ib.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ib.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ib.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ib.e)));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      if (!$$0.B && !$$3.eU().b() && $$3.eU().a(clr.rS)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dlx.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(csf $$0, hx $$1, dhn $$2) {
      for (ib $$3 : new ib[]{ib.d, ib.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            hx $$5 = $$1.a($$3, $$4);
            dhn $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(ddu.b) == $$3.g()) {
                  ddu.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(csf $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bkv> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bkv $$6 : $$5) {
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
         $$0.a(new hx($$1), this, 10);
      }
   }

   public boolean a(dhn $$0, ib $$1) {
      return $$0.a(this.m) ? $$0.c(ddu.b) == $$1.g() : $$0.a(this);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
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
   public dhn a(dhn $$0, dab $$1) {
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
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
