import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dej extends cwq implements ddq {
   public static final MapCodec<dej> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djh.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dej::new)
   );
   public static final dkb b = dal.aE;
   public static final dkf<dkg> c = djx.af;
   public static final dkf<dkq> d = djx.bi;
   public static final djy e = djx.C;
   protected static final emm f = dds.e;
   protected static final emm g = dds.d;
   protected static final emm h = cwq.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final emm i = cwq.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final emm j = cwq.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final emm k = cwq.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final emm l = cwq.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final emm m = cwq.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final emm n = cwq.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final emm o = cwq.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final emm[] F = a(f, h, l, i, m);
   protected static final emm[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cwq J;
   protected final djh H;

   @Override
   public MapCodec<? extends dej> a() {
      return a;
   }

   private static emm[] a(emm $$0, emm $$1, emm $$2, emm $$3, emm $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(emm[]::new);
   }

   private static emm a(int $$0, emm $$1, emm $$2, emm $$3, emm $$4, emm $$5) {
      emm $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = emj.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = emj.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = emj.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = emj.a($$6, $$5);
      }

      return $$6;
   }

   protected dej(djh $$0, djg.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ic.c).a(c, dkg.b).a(d, dkq.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return ($$0.c(c) == dkg.a ? F : G)[I[this.n($$0)]];
   }

   private int n(djh $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public djh a(cph $$0) {
      ic $$1 = $$0.k();
      hx $$2 = $$0.a();
      eer $$3 = $$0.q().b_($$2);
      djh $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ic.a && ($$1 == ic.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dkg.b : dkg.a)
         .a(e, Boolean.valueOf($$3.a() == ees.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dkq i(djh $$0, csv $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      djh $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         ic $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dkq.d;
            }

            return dkq.e;
         }
      }

      djh $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         ic $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dkq.b;
            }

            return dkq.c;
         }
      }

      return dkq.a;
   }

   private static boolean c(djh $$0, csv $$1, hx $$2, ic $$3) {
      djh $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(djh $$0) {
      return $$0.b() instanceof dej;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      ic $$2 = $$0.c(b);
      dkq $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ic.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(ddc.c).a(d, dkq.c);
                  case c:
                     return $$0.a(ddc.c).a(d, dkq.b);
                  case d:
                     return $$0.a(ddc.c).a(d, dkq.e);
                  case e:
                     return $$0.a(ddc.c).a(d, dkq.d);
                  default:
                     return $$0.a(ddc.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ic.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(ddc.c).a(d, dkq.b);
                  case c:
                     return $$0.a(ddc.c).a(d, dkq.c);
                  case d:
                     return $$0.a(ddc.c).a(d, dkq.e);
                  case e:
                     return $$0.a(ddc.c).a(d, dkq.d);
                  case a:
                     return $$0.a(ddc.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(e) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
