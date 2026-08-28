import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class don extends dfw {
   public static final MapCodec<don> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.e.r().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, don::new)
   );
   public static final dtr b = dtq.w;
   public static final dtr c = dtq.a;
   public static final dtr d = dtq.d;
   public static final dtr e = dlk.b;
   public static final dtr f = dlk.c;
   public static final dtr g = dlk.d;
   public static final dtr h = dlk.e;
   private static final Map<ji, dtr> k = dhs.f;
   protected static final exp i = dfw.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final exp j = dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dfw m;

   @Override
   public MapCodec<don> a() {
      return a;
   }

   public don(dfw $$0, dsz.d $$1) {
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
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dta a(cyb $$0) {
      dca $$1 = $$0.q();
      jd $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ji.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ji.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ji.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ji.e)));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dta a(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      if (!$$0.B && !$$3.eU().e() && $$3.eU().a(cur.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dxw.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dcu $$0, jd $$1, dta $$2) {
      for (ji $$3 : new ji[]{ji.d, ji.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jd $$5 = $$1.a($$3, $$4);
            dta $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(doo.b) == $$3.g()) {
                  doo.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dcu $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bsq> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bsq $$6 : $$5) {
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
         $$0.a(new jd($$1), this, 10);
      }
   }

   public boolean a(dta $$0, ji $$1) {
      return $$0.a(this.m) ? $$0.c(doo.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
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
   protected dta a(dta $$0, dkt $$1) {
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
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
