import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dec extends cwj implements ddj {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dja.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dec::new)
   );
   public static final dju b = dae.aE;
   public static final djy<djz> c = djq.af;
   public static final djy<dkj> d = djq.bi;
   public static final djr e = djq.C;
   protected static final emf f = ddl.e;
   protected static final emf g = ddl.d;
   protected static final emf h = cwj.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final emf i = cwj.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final emf j = cwj.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final emf k = cwj.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final emf l = cwj.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final emf m = cwj.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final emf n = cwj.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final emf o = cwj.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final emf[] F = a(f, h, l, i, m);
   protected static final emf[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cwj J;
   protected final dja H;

   @Override
   public MapCodec<? extends dec> a() {
      return a;
   }

   private static emf[] a(emf $$0, emf $$1, emf $$2, emf $$3, emf $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(emf[]::new);
   }

   private static emf a(int $$0, emf $$1, emf $$2, emf $$3, emf $$4, emf $$5) {
      emf $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = emc.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = emc.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = emc.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = emc.a($$6, $$5);
      }

      return $$6;
   }

   protected dec(dja $$0, diz.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ic.c).a(c, djz.b).a(d, dkj.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return ($$0.c(c) == djz.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dja $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dja a(cpa $$0) {
      ic $$1 = $$0.k();
      hx $$2 = $$0.a();
      eek $$3 = $$0.q().b_($$2);
      dja $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ic.a && ($$1 == ic.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? djz.b : djz.a)
         .a(e, Boolean.valueOf($$3.a() == eel.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dkj i(dja $$0, cso $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      dja $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         ic $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dkj.d;
            }

            return dkj.e;
         }
      }

      dja $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         ic $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dkj.b;
            }

            return dkj.c;
         }
      }

      return dkj.a;
   }

   private static boolean c(dja $$0, cso $$1, hx $$2, ic $$3) {
      dja $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(dja $$0) {
      return $$0.b() instanceof dec;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      ic $$2 = $$0.c(b);
      dkj $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ic.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dcv.c).a(d, dkj.c);
                  case c:
                     return $$0.a(dcv.c).a(d, dkj.b);
                  case d:
                     return $$0.a(dcv.c).a(d, dkj.e);
                  case e:
                     return $$0.a(dcv.c).a(d, dkj.d);
                  default:
                     return $$0.a(dcv.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ic.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dcv.c).a(d, dkj.b);
                  case c:
                     return $$0.a(dcv.c).a(d, dkj.c);
                  case d:
                     return $$0.a(dcv.c).a(d, dkj.e);
                  case e:
                     return $$0.a(dcv.c).a(d, dkj.d);
                  case a:
                     return $$0.a(dcv.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(e) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
