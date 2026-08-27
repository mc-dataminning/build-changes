import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dkn extends dby {
   public static final MapCodec<dkn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kr.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dkn::new)
   );
   public static final dpq b = dpp.w;
   public static final dpq c = dpp.a;
   public static final dpq d = dpp.d;
   public static final dpq e = dhl.b;
   public static final dpq f = dhl.c;
   public static final dpq g = dhl.d;
   public static final dpq h = dhl.e;
   private static final Map<ih, dpq> k = ddu.f;
   protected static final est i = dby.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final est j = dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dby m;

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dby $$0, doy.d $$1) {
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
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public doz a(cuo $$0) {
      cyd $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.n()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ih.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ih.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ih.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ih.e)));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      if (!$$0.B && !$$3.eU().d() && $$3.eU().a(crm.rU)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dts.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cyx $$0, ib $$1, doz $$2) {
      for (ih $$3 : new ih[]{ih.d, ih.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ib $$5 = $$1.a($$3, $$4);
            doz $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dko.b) == $$3.g()) {
                  dko.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(cyx $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bpv> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bpv $$6 : $$5) {
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

   public boolean a(doz $$0, ih $$1) {
      return $$0.a(this.m) ? $$0.c(dko.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
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
   protected doz a(doz $$0, dgu $$1) {
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
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
