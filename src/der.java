import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class der extends cwy implements ddy {
   public static final MapCodec<der> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djp.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, der::new)
   );
   public static final dkj b = dat.aE;
   public static final dkn<dko> c = dkf.af;
   public static final dkn<dky> d = dkf.bi;
   public static final dkg e = dkf.C;
   protected static final emv f = dea.e;
   protected static final emv g = dea.d;
   protected static final emv h = cwy.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final emv i = cwy.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final emv j = cwy.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final emv k = cwy.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final emv l = cwy.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final emv m = cwy.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final emv n = cwy.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final emv o = cwy.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final emv[] F = a(f, h, l, i, m);
   protected static final emv[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cwy J;
   protected final djp H;

   @Override
   public MapCodec<? extends der> a() {
      return a;
   }

   private static emv[] a(emv $$0, emv $$1, emv $$2, emv $$3, emv $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(emv[]::new);
   }

   private static emv a(int $$0, emv $$1, emv $$2, emv $$3, emv $$4, emv $$5) {
      emv $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ems.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ems.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ems.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ems.a($$6, $$5);
      }

      return $$6;
   }

   protected der(djp $$0, djo.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ic.c).a(c, dko.b).a(d, dky.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ($$0.c(c) == dko.a ? F : G)[I[this.n($$0)]];
   }

   private int n(djp $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public djp a(cpp $$0) {
      ic $$1 = $$0.k();
      hx $$2 = $$0.a();
      eez $$3 = $$0.q().b_($$2);
      djp $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ic.a && ($$1 == ic.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dko.b : dko.a)
         .a(e, Boolean.valueOf($$3.a() == efa.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dky i(djp $$0, ctd $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      djp $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         ic $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dky.d;
            }

            return dky.e;
         }
      }

      djp $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         ic $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dky.b;
            }

            return dky.c;
         }
      }

      return dky.a;
   }

   private static boolean c(djp $$0, ctd $$1, hx $$2, ic $$3) {
      djp $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(djp $$0) {
      return $$0.b() instanceof der;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      ic $$2 = $$0.c(b);
      dky $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ic.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(ddk.c).a(d, dky.c);
                  case c:
                     return $$0.a(ddk.c).a(d, dky.b);
                  case d:
                     return $$0.a(ddk.c).a(d, dky.e);
                  case e:
                     return $$0.a(ddk.c).a(d, dky.d);
                  default:
                     return $$0.a(ddk.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ic.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(ddk.c).a(d, dky.b);
                  case c:
                     return $$0.a(ddk.c).a(d, dky.c);
                  case d:
                     return $$0.a(ddk.c).a(d, dky.e);
                  case e:
                     return $$0.a(ddk.c).a(d, dky.d);
                  case a:
                     return $$0.a(ddk.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(e) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
