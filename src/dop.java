import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dop extends dfy {
   public static final MapCodec<dop> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.e.r().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dop::new)
   );
   public static final dtt b = dts.w;
   public static final dtt c = dts.a;
   public static final dtt d = dts.d;
   public static final dtt e = dlm.b;
   public static final dtt f = dlm.c;
   public static final dtt g = dlm.d;
   public static final dtt h = dlm.e;
   private static final Map<ji, dtt> k = dhu.f;
   protected static final exv i = dfy.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final exv j = dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dfy m;

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   public dop(dfy $$0, dtb.d $$1) {
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
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dtc a(cyd $$0) {
      dcc $$1 = $$0.q();
      jd $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.f()), ji.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.i()), ji.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.g()), ji.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.h()), ji.e)));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      if (!$$0.B && !$$3.eT().e() && $$3.eT().a(cut.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dxz.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dcw $$0, jd $$1, dtc $$2) {
      for (ji $$3 : new ji[]{ji.d, ji.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jd $$5 = $$1.a($$3, $$4);
            dtc $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(doq.b) == $$3.g()) {
                  doq.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dcw $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bsr> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bsr $$6 : $$5) {
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

   public boolean a(dtc $$0, ji $$1) {
      return $$0.a(this.m) ? $$0.c(doq.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
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
   protected dtc a(dtc $$0, dkv $$1) {
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
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
