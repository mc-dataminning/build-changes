import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class duv extends dmr implements duc {
   public static final MapCodec<duv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eat.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, duv::new)
   );
   public static final ebr<jb> b = dqs.e;
   public static final ebr<ebs> c = ebj.ai;
   public static final ebr<ecc> d = ebj.bl;
   public static final ebk e = ebj.I;
   private static final ffw g = fft.a(dmr.b(16.0, 0.0, 8.0), dmr.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final ffw h = fft.a(g, fft.a(g, h.a(i.a, i.b)));
   private static final ffw i = fft.a(h, fft.a(h, h.a(i.a, i.b)));
   private static final Map<jb, ffw> D = fft.c(g);
   private static final Map<jb, ffw> R = fft.c(h);
   private static final Map<jb, ffw> S = fft.c(i);
   private static final Map<jb, ffw> T = fft.c(fft.a(g, h.A));
   private static final Map<jb, ffw> U = fft.c(fft.a(h, h.A));
   private static final Map<jb, ffw> V = fft.c(fft.a(i, h.A));
   private final dmr W;
   protected final eat f;

   @Override
   public MapCodec<? extends duv> a() {
      return a;
   }

   protected duv(eat $$0, eas.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jb.c).b(c, ebs.b).b(d, ecc.a).b(e, Boolean.valueOf(false)));
      this.W = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      boolean $$4 = $$0.c(c) == ebs.b;
      jb $$5 = $$0.c(b);

      Map var10000 = switch ((ecc)$$0.c(d)) {
         case a -> $$4 ? R : U;
         case d, e -> $$4 ? D : T;
         case c, b -> $$4 ? S : V;
      };

      return (ffw)var10000.get(switch ((ecc)$$0.c(d)) {
         case a, d, c -> $$5;
         case b -> $$5.i();
         case e -> $$5.h();
      });
   }

   @Override
   public float e() {
      return this.W.e();
   }

   @Override
   public eat a(ddg $$0) {
      jb $$1 = $$0.k();
      iv $$2 = $$0.a();
      exa $$3 = $$0.q().b_($$2);
      eat $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jb.a && ($$1 == jb.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? ebs.b : ebs.a)
         .b(e, Boolean.valueOf($$3.a() == exb.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ecc e(eat $$0, diq $$1, iv $$2) {
      jb $$3 = $$0.c(b);
      eat $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jb $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return ecc.d;
            }

            return ecc.e;
         }
      }

      eat $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jb $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return ecc.b;
            }

            return ecc.c;
         }
      }

      return ecc.a;
   }

   private static boolean c(eat $$0, diq $$1, iv $$2, jb $$3) {
      eat $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(eat $$0) {
      return $$0.b() instanceof duv;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      jb $$2 = $$0.c(b);
      ecc $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jb.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dtl.c).b(d, ecc.e);
                  case c:
                     return $$0.a(dtl.c).b(d, ecc.b);
                  case b:
                     return $$0.a(dtl.c).b(d, ecc.c);
                  case e:
                     return $$0.a(dtl.c).b(d, ecc.d);
                  default:
                     return $$0.a(dtl.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jb.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dtl.c);
                  case d:
                     return $$0.a(dtl.c).b(d, ecc.e);
                  case c:
                     return $$0.a(dtl.c).b(d, ecc.c);
                  case b:
                     return $$0.a(dtl.c).b(d, ecc.b);
                  case e:
                     return $$0.a(dtl.c).b(d, ecc.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(e) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
