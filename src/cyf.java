import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cyf extends cvz {
   public static final MapCodec<cyf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.fieldOf("block_set_type").forGetter(cyf::b), u()).apply($$0, cyf::new)
   );
   public static final djj b = czu.aE;
   public static final djg c = djf.u;
   public static final djn<djk> d = djf.be;
   public static final djg e = djf.w;
   public static final djn<djl> f = djf.ae;
   protected static final float g = 3.0F;
   protected static final elu h = cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final elu i = cvz.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final elu j = cvz.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final elu k = cvz.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dje l;

   @Override
   public MapCodec<? extends cyf> a() {
      return a;
   }

   protected cyf(dje $$0, dio.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ia.c).a(c, Boolean.valueOf(false)).a(d, djk.a).a(e, Boolean.valueOf(false)).a(f, djl.b));
   }

   public dje b() {
      return this.l;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      ia $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == djk.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      djl $$6 = $$0.c(f);
      if ($$1.o() != ia.a.b || $$6 == djl.b != ($$1 == ia.b)) {
         return $$6 == djl.b && $$1 == ia.a && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof cyf && $$2.c(f) != $$6 ? $$2.a(f, $$6) : cwb.a.o();
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, csq $$3, BiConsumer<cmh, hv> $$4) {
      if ($$3.j() == csq.a.d && $$0.c(f) == djl.b && !$$1.y_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.h($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
      if (!$$0.B && $$3.f()) {
         cyh.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return switch ($$3) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      hv $$1 = $$0.a();
      csy $$2 = $$0.q();
      if ($$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, djl.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      $$0.a($$1.c(), $$2.a(f, djl.a), 3);
   }

   private djk b(coq $$0) {
      cse $$1 = $$0.q();
      hv $$2 = $$0.a();
      ia $$3 = $$0.g();
      hv $$4 = $$2.c();
      ia $$5 = $$3.i();
      hv $$6 = $$2.a($$5);
      dip $$7 = $$1.a_($$6);
      hv $$8 = $$4.a($$5);
      dip $$9 = $$1.a_($$8);
      ia $$10 = $$3.h();
      hv $$11 = $$2.a($$10);
      dip $$12 = $$1.a_($$11);
      hv $$13 = $$4.a($$10);
      dip $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == djl.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == djl.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            elb $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? djk.a : djk.b;
         } else {
            return djk.a;
         }
      } else {
         return djk.b;
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if (!this.l.c()) {
         return bjl.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.h($$0) ? dmz.h : dmz.d, $$2);
         return bjl.a($$1.B);
      }
   }

   public boolean h(dip $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable blf $$0, csy $$1, dip $$2, hv $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dmz.h : dmz.d, $$3);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(f) == djl.b ? ia.b : ia.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dmz.h : dmz.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      dip $$4 = $$1.a_($$3);
      return $$0.c(f) == djl.b ? $$4.d($$1, $$3, ia.b) : $$4.a(this);
   }

   private void a(@Nullable blf $$0, csy $$1, hv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), ard.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$1 == dav.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   public long a(dip $$0, hv $$1) {
      return aty.b($$1.u(), $$1.c($$0.c(f) == djl.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(csy $$0, hv $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dip $$0) {
      if ($$0.b() instanceof cyf $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
