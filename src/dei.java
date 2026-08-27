import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dei extends cwp implements ddp {
   public static final MapCodec<dei> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djg.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dei::new)
   );
   public static final dka b = dak.aE;
   public static final dke<dkf> c = djw.af;
   public static final dke<dkp> d = djw.bi;
   public static final djx e = djw.C;
   protected static final eml f = ddr.e;
   protected static final eml g = ddr.d;
   protected static final eml h = cwp.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eml i = cwp.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eml j = cwp.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eml k = cwp.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eml l = cwp.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eml m = cwp.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eml n = cwp.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eml o = cwp.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eml[] F = a(f, h, l, i, m);
   protected static final eml[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cwp J;
   protected final djg H;

   @Override
   public MapCodec<? extends dei> a() {
      return a;
   }

   private static eml[] a(eml $$0, eml $$1, eml $$2, eml $$3, eml $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eml[]::new);
   }

   private static eml a(int $$0, eml $$1, eml $$2, eml $$3, eml $$4, eml $$5) {
      eml $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = emi.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = emi.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = emi.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = emi.a($$6, $$5);
      }

      return $$6;
   }

   protected dei(djg $$0, djf.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ic.c).a(c, dkf.b).a(d, dkp.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return ($$0.c(c) == dkf.a ? F : G)[I[this.n($$0)]];
   }

   private int n(djg $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public djg a(cpg $$0) {
      ic $$1 = $$0.k();
      hx $$2 = $$0.a();
      eeq $$3 = $$0.q().b_($$2);
      djg $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ic.a && ($$1 == ic.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dkf.b : dkf.a)
         .a(e, Boolean.valueOf($$3.a() == eer.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dkp i(djg $$0, csu $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      djg $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         ic $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dkp.d;
            }

            return dkp.e;
         }
      }

      djg $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         ic $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dkp.b;
            }

            return dkp.c;
         }
      }

      return dkp.a;
   }

   private static boolean c(djg $$0, csu $$1, hx $$2, ic $$3) {
      djg $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(djg $$0) {
      return $$0.b() instanceof dei;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      ic $$2 = $$0.c(b);
      dkp $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ic.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(ddb.c).a(d, dkp.c);
                  case c:
                     return $$0.a(ddb.c).a(d, dkp.b);
                  case d:
                     return $$0.a(ddb.c).a(d, dkp.e);
                  case e:
                     return $$0.a(ddb.c).a(d, dkp.d);
                  default:
                     return $$0.a(ddb.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ic.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(ddb.c).a(d, dkp.b);
                  case c:
                     return $$0.a(ddb.c).a(d, dkp.c);
                  case d:
                     return $$0.a(ddb.c).a(d, dkp.e);
                  case e:
                     return $$0.a(ddb.c).a(d, dkp.d);
                  case a:
                     return $$0.a(ddb.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(e) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
