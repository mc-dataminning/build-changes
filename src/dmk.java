import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmk extends dkd {
   public static final MapCodec<dmk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyd.a.fieldOf("block_set_type").forGetter(dmk::b), t()).apply($$0, dmk::new)
   );
   public static final dyl<jm> b = dob.aF;
   public static final dyf c = dye.z;
   public static final dyl<dyi> d = dye.bh;
   public static final dyf e = dye.B;
   public static final dyl<dyj> f = dye.ah;
   protected static final float g = 3.0F;
   protected static final fcl h = dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcl i = dkd.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fcl j = dkd.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcl k = dkd.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dyd l;

   @Override
   public MapCodec<? extends dmk> a() {
      return a;
   }

   protected dmk(dyd $$0, dxn.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, dyi.a).b(e, Boolean.valueOf(false)).b(f, dyj.b));
   }

   public dyd b() {
      return this.l;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      jm $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dyi.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      dyj $$8 = $$0.c(f);
      if ($$4.o() != jm.a.b || $$8 == dyj.b != ($$4 == jm.b)) {
         return $$8 == dyj.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dmk && $$6.c(f) != $$8 ? $$6.b(f, $$8) : dkf.a.m();
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, dgr $$3, BiConsumer<cxg, jh> $$4) {
      if ($$3.g() && $$0.c(f) == dyj.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      if (!$$0.C && ($$3.b() || !$$3.d($$2))) {
         dmm.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      jh $$1 = $$0.a();
      dgz $$2 = $$0.q();
      if ($$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dyj.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvx $$3, cxg $$4) {
      $$0.a($$1.d(), $$2.b(f, dyj.a), 3);
   }

   private dyi b(dax $$0) {
      dge $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.g();
      jh $$4 = $$2.d();
      jm $$5 = $$3.i();
      jh $$6 = $$2.a($$5);
      dxo $$7 = $$1.a_($$6);
      jh $$8 = $$4.a($$5);
      dxo $$9 = $$1.a_($$8);
      jm $$10 = $$3.h();
      jh $$11 = $$2.a($$10);
      dxo $$12 = $$1.a_($$11);
      jh $$13 = $$4.a($$10);
      dxo $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dmk && $$7.c(f) == dyj.b;
      boolean $$17 = $$12.b() instanceof dmk && $$12.c(f) == dyj.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fbr $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dyi.a : dyi.b;
         } else {
            return dyi.a;
         }
      } else {
         return dyi.b;
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!this.l.c()) {
         return bta.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? eck.h : eck.d, $$2);
         return bta.a;
      }
   }

   public boolean n(dxo $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bvb $$0, dgz $$1, dxo $$2, jh $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? eck.h : eck.d, $$3);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dyj.b ? jm.b : jm.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? eck.h : eck.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxo $$4 = $$1.a_($$3);
      return $$0.c(f) == dyj.b ? $$4.c($$1, $$3, jm.b) : $$4.a(this);
   }

   private void a(@Nullable bvb $$0, dgz $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), aww.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$1 == dpc.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dxo $$0, jh $$1) {
      return azu.b($$1.u(), $$1.c($$0.c(f) == dyj.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dgz $$0, jh $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dxo $$0) {
      if ($$0.b() instanceof dmk $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
