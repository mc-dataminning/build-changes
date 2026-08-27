import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class den extends dch {
   public static final MapCodec<den> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpx.a.fieldOf("block_set_type").forGetter(den::b), u()).apply($$0, den::new)
   );
   public static final dqc b = dgc.aE;
   public static final dpz c = dpy.u;
   public static final dqg<dqd> d = dpy.be;
   public static final dpz e = dpy.w;
   public static final dqg<dqe> f = dpy.ae;
   protected static final float g = 3.0F;
   protected static final etc h = dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final etc i = dch.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final etc j = dch.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final etc k = dch.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dpx l;

   @Override
   public MapCodec<? extends den> a() {
      return a;
   }

   protected den(dpx $$0, dph.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ij.c).a(c, Boolean.valueOf(false)).a(d, dqd.a).a(e, Boolean.valueOf(false)).a(f, dqe.b));
   }

   public dpx b() {
      return this.l;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      ij $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dqd.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      dqe $$6 = $$0.c(f);
      if ($$1.o() != ij.a.b || $$6 == dqe.b != ($$1 == ij.b)) {
         return $$6 == dqe.b && $$1 == ij.a && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof den && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dcj.a.n();
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, cyy $$3, BiConsumer<crs, id> $$4) {
      if ($$3.j() == cyy.a.d && $$0.c(f) == dqe.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dep.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      id $$1 = $$0.a();
      czg $$2 = $$0.q();
      if ($$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.n().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dqe.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqt $$3, crs $$4) {
      $$0.a($$1.c(), $$2.a(f, dqe.a), 3);
   }

   private dqd b(cux $$0) {
      cym $$1 = $$0.q();
      id $$2 = $$0.a();
      ij $$3 = $$0.g();
      id $$4 = $$2.c();
      ij $$5 = $$3.i();
      id $$6 = $$2.a($$5);
      dpi $$7 = $$1.a_($$6);
      id $$8 = $$4.a($$5);
      dpi $$9 = $$1.a_($$8);
      ij $$10 = $$3.h();
      id $$11 = $$2.a($$10);
      dpi $$12 = $$1.a_($$11);
      id $$13 = $$4.a($$10);
      dpi $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dqe.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dqe.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            esj $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dqd.a : dqd.b;
         } else {
            return dqd.a;
         }
      } else {
         return dqd.b;
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if (!this.l.c()) {
         return bof.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dub.h : dub.d, $$2);
         return bof.a($$1.B);
      }
   }

   public boolean m(dpi $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bqa $$0, czg $$1, dpi $$2, id $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dub.h : dub.d, $$3);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dqe.b ? ij.b : ij.a));
      if (!this.n().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dub.h : dub.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      dpi $$4 = $$1.a_($$3);
      return $$0.c(f) == dqe.b ? $$4.d($$1, $$3, ij.b) : $$4.a(this);
   }

   private void a(@Nullable bqa $$0, czg $$1, id $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), aup.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$1 == dhd.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dpi $$0, id $$1) {
      return axm.b($$1.u(), $$1.c($$0.c(f) == dqe.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(czg $$0, id $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dpi $$0) {
      if ($$0.b() instanceof den $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
