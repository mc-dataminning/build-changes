import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dgg extends dea {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drs.a.fieldOf("block_set_type").forGetter(dgg::b), u()).apply($$0, dgg::new)
   );
   public static final drx b = dhw.aE;
   public static final dru c = drt.u;
   public static final dsb<dry> d = drt.be;
   public static final dru e = drt.w;
   public static final dsb<drz> f = drt.ae;
   protected static final float g = 3.0F;
   protected static final evf h = dea.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final evf i = dea.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final evf j = dea.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evf k = dea.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final drs l;

   @Override
   public MapCodec<? extends dgg> a() {
      return a;
   }

   protected dgg(drs $$0, drc.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)).a(d, dry.a).a(e, Boolean.valueOf(false)).a(f, drz.b));
   }

   public drs b() {
      return this.l;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      it $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dry.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      drz $$6 = $$0.c(f);
      if ($$1.o() != it.a.b || $$6 == drz.b != ($$1 == it.b)) {
         return $$6 == drz.b && $$1 == it.a && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dgg && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dec.a.n();
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dar $$3, BiConsumer<ctq, io> $$4) {
      if ($$3.j() == dar.a.d && $$0.c(f) == drz.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dgi.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      io $$1 = $$0.a();
      daz $$2 = $$0.q();
      if ($$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.n().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, drz.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, bsq $$3, ctq $$4) {
      $$0.a($$1.c(), $$2.a(f, drz.a), 3);
   }

   private dry b(cxb $$0) {
      daf $$1 = $$0.q();
      io $$2 = $$0.a();
      it $$3 = $$0.g();
      io $$4 = $$2.c();
      it $$5 = $$3.i();
      io $$6 = $$2.a($$5);
      drd $$7 = $$1.a_($$6);
      io $$8 = $$4.a($$5);
      drd $$9 = $$1.a_($$8);
      it $$10 = $$3.h();
      io $$11 = $$2.a($$10);
      drd $$12 = $$1.a_($$11);
      io $$13 = $$4.a($$10);
      drd $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == drz.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == drz.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            eum $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dry.a : dry.b;
         } else {
            return dry.a;
         }
      } else {
         return dry.b;
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if (!this.l.c()) {
         return bpw.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dvw.h : dvw.d, $$2);
         return bpw.a($$1.B);
      }
   }

   public boolean m(drd $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable brw $$0, daz $$1, drd $$2, io $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dvw.h : dvw.d, $$3);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == drz.b ? it.b : it.a));
      if (!this.n().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dvw.h : dvw.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      drd $$4 = $$1.a_($$3);
      return $$0.c(f) == drz.b ? $$4.d($$1, $$3, it.b) : $$4.a(this);
   }

   private void a(@Nullable brw $$0, daz $$1, io $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), avj.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$1 == dix.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(drd $$0, io $$1) {
      return ayf.b($$1.u(), $$1.c($$0.c(f) == drz.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(daz $$0, io $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(drd $$0) {
      if ($$0.b() instanceof dgg $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
