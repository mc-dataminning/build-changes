import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class ddo extends cva {
   public static final MapCodec<ddo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, ddo::new)
   );
   public static final dhz b = dhy.w;
   public static final dhz c = dhy.a;
   public static final dhz d = dhy.d;
   public static final dhz e = dan.b;
   public static final dhz f = dan.c;
   public static final dhz g = dan.d;
   public static final dhz h = dan.e;
   private static final Map<hx, dhz> k = cww.f;
   protected static final ekn i = cva.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ekn j = cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final cva m;

   @Override
   public MapCodec<ddo> a() {
      return a;
   }

   public ddo(cva $$0, dhh.d $$1) {
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
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dhi a(cnr $$0) {
      crg $$1 = $$0.q();
      ht $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), hx.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), hx.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), hx.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), hx.e)));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dhi a(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      if (!$$0.B && !$$3.eU().b() && $$3.eU().a(clm.rS)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dls.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(csa $$0, ht $$1, dhi $$2) {
      for (hx $$3 : new hx[]{hx.d, hx.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ht $$5 = $$1.a($$3, $$4);
            dhi $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(ddp.b) == $$3.g()) {
                  ddp.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(csa $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bkq> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bkq $$6 : $$5) {
            if (!$$6.q_()) {
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
         $$0.a(new ht($$1), this, 10);
      }
   }

   public boolean a(dhi $$0, hx $$1) {
      return $$0.a(this.m) ? $$0.c(ddp.b) == $$1.g() : $$0.a(this);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
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
   public dhi a(dhi $$0, czw $$1) {
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
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
