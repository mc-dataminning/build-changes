import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dgr extends dgh {
   public static final MapCodec<dgr> a = b(dgr::new);
   public static final duu b = dkr.aE;
   public static final duy<duo> c = duq.V;
   public static final dur d = duq.w;
   private static final eyx f = dgv.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eyx g = dgv.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eyx h = dgv.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eyx i = dgv.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eyx j = eyu.a(i, h);
   private static final eyx k = eyu.a(j, dgv.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eyx l = eyu.a(j, dgv.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eyx m = eyu.a(j, dgv.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eyx n = eyu.a(j, dgv.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eyx o = eyu.a(j, dgv.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eyx F = eyu.a(j, dgv.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eyx G = eyu.a(j, dgv.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   public dgr(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c).b(c, duo.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      btj $$4 = $$3.s();
      cnp $$5 = $$4 instanceof cnp ? (cnp)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      return (brk)(this.a($$1, $$0, $$4, $$3, true) ? brk.a : brk.e);
   }

   public boolean a(dds $$0, dua $$1, eya $$2, @Nullable cnp $$3, boolean $$4) {
      jj $$5 = $$2.b();
      je $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awn.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dua $$0, jj $$1, double $$2) {
      if ($$1.o() != jj.a.b && !($$2 > 0.8124F)) {
         jj $$3 = $$0.c(b);
         duo $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dds $$0, je $$1, @Nullable jj $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable btj $$0, dds $$1, je $$2, @Nullable jj $$3) {
      dre $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof drc) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((drc)$$4).a($$3);
         $$1.a(null, $$2, awd.bZ, awe.e, 2.0F, 1.0F);
         $$1.a($$0, dyx.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eyx o(dua $$0) {
      jj $$1 = $$0.c(b);
      duo $$2 = $$0.c(c);
      if ($$2 == duo.a) {
         return $$1 != jj.c && $$1 != jj.d ? g : f;
      } else if ($$2 == duo.b) {
         return G;
      } else if ($$2 == duo.d) {
         return $$1 != jj.c && $$1 != jj.d ? l : k;
      } else if ($$1 == jj.c) {
         return o;
      } else if ($$1 == jj.d) {
         return F;
      } else {
         return $$1 == jj.f ? n : m;
      }
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.o($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.o($$0);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      jj $$1 = $$0.k();
      je $$2 = $$0.a();
      dds $$3 = $$0.q();
      jj.a $$4 = $$1.o();
      if ($$4 == jj.a.b) {
         dua $$5 = this.o().b(c, $$1 == jj.a ? duo.b : duo.a).b(b, $$0.g());
         if ($$5.a((ddv)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jj.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jj.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jj.e)
            || $$4 == jj.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jj.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jj.c);
         dua $$7 = this.o().b(b, $$1.g()).b(c, $$6 ? duo.d : duo.c);
         if ($$7.a((ddv)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jj.b);
         $$7 = $$7.b(c, $$8 ? duo.a : duo.b);
         if ($$7.a((ddv)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, ddk $$3, BiConsumer<cvl, je> $$4) {
      if ($$3.f()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      duo $$6 = $$0.c(c);
      jj $$7 = q($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != duo.d) {
         return dgx.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == duo.d && !$$2.c($$3, $$5, $$1)) {
               return $$0.b(c, duo.c).b(b, $$1.g());
            }

            if ($$6 == duo.c && $$7.g() == $$1 && $$2.c($$3, $$5, $$0.c(b))) {
               return $$0.b(c, duo.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      jj $$3 = q($$0).g();
      return $$3 == jj.b ? dgv.a($$1, $$2.d(), jj.a) : djp.b($$1, $$2, $$3);
   }

   private static jj q(dua $$0) {
      switch ((duo)$$0.c(c)) {
         case a:
            return jj.b;
         case b:
            return jj.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new drc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.E, $$0.B ? drc::a : drc::b);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   public dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
