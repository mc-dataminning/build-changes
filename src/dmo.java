import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dmo extends deu implements dlv {
   public static final MapCodec<dmo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drx.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dmo::new)
   );
   public static final dsr b = diq.aE;
   public static final dsv<dsw> c = dsn.af;
   public static final dsv<dtg> d = dsn.bi;
   public static final dso e = dsn.C;
   protected static final ewf f = dlx.e;
   protected static final ewf g = dlx.d;
   protected static final ewf h = deu.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ewf i = deu.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ewf j = deu.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ewf k = deu.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ewf l = deu.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ewf m = deu.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ewf n = deu.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ewf o = deu.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ewf[] F = a(f, h, l, i, m);
   protected static final ewf[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final deu J;
   protected final drx H;

   @Override
   public MapCodec<? extends dmo> a() {
      return a;
   }

   private static ewf[] a(ewf $$0, ewf $$1, ewf $$2, ewf $$3, ewf $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ewf[]::new);
   }

   private static ewf a(int $$0, ewf $$1, ewf $$2, ewf $$3, ewf $$4, ewf $$5) {
      ewf $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ewc.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ewc.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ewc.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ewc.a($$6, $$5);
      }

      return $$6;
   }

   protected dmo(drx $$0, drw.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, dsw.b).a(d, dtg.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ($$0.c(c) == dsw.a ? F : G)[I[this.n($$0)]];
   }

   private int n(drx $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public drx a(cxv $$0) {
      je $$1 = $$0.k();
      iz $$2 = $$0.a();
      enq $$3 = $$0.q().b_($$2);
      drx $$4 = this.n()
         .a(b, $$0.g())
         .a(c, $$1 != je.a && ($$1 == je.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dsw.b : dsw.a)
         .a(e, Boolean.valueOf($$3.a() == enr.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dtg i(drx $$0, daz $$1, iz $$2) {
      je $$3 = $$0.c(b);
      drx $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         je $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dtg.d;
            }

            return dtg.e;
         }
      }

      drx $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         je $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dtg.b;
            }

            return dtg.c;
         }
      }

      return dtg.a;
   }

   private static boolean c(drx $$0, daz $$1, iz $$2, je $$3) {
      drx $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(drx $$0) {
      return $$0.b() instanceof dmo;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      je $$2 = $$0.c(b);
      dtg $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == je.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlh.c).a(d, dtg.c);
                  case c:
                     return $$0.a(dlh.c).a(d, dtg.b);
                  case d:
                     return $$0.a(dlh.c).a(d, dtg.e);
                  case e:
                     return $$0.a(dlh.c).a(d, dtg.d);
                  default:
                     return $$0.a(dlh.c);
               }
            }
            break;
         case c:
            if ($$2.o() == je.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlh.c).a(d, dtg.b);
                  case c:
                     return $$0.a(dlh.c).a(d, dtg.c);
                  case d:
                     return $$0.a(dlh.c).a(d, dtg.e);
                  case e:
                     return $$0.a(dlh.c).a(d, dtg.d);
                  case a:
                     return $$0.a(dlh.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(e) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
