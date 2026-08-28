import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmm extends dke {
   public static final MapCodec<dmm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyc.a.fieldOf("block_set_type").forGetter(dmm::b), t()).apply($$0, dmm::new)
   );
   public static final dyk<jm> b = doc.aF;
   public static final dye c = dyd.v;
   public static final dyk<dyh> d = dyd.bf;
   public static final dye e = dyd.x;
   public static final dyk<dyi> f = dyd.af;
   protected static final float g = 3.0F;
   protected static final fcm h = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcm i = dke.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fcm j = dke.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcm k = dke.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dyc l;

   @Override
   public MapCodec<? extends dmm> a() {
      return a;
   }

   protected dmm(dyc $$0, dxm.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, dyh.a).b(e, Boolean.valueOf(false)).b(f, dyi.b));
   }

   public dyc b() {
      return this.l;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      jm $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dyh.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      dyi $$8 = $$0.c(f);
      if ($$4.o() != jm.a.b || $$8 == dyi.b != ($$4 == jm.b)) {
         return $$8 == dyi.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dmm && $$6.c(f) != $$8 ? $$6.b(f, $$8) : dkg.a.m();
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, dgs $$3, BiConsumer<cxk, jh> $$4) {
      if ($$3.g() && $$0.c(f) == dyi.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      if (!$$0.C && ($$3.b() || !$$3.d($$2))) {
         dmo.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      jh $$1 = $$0.a();
      dha $$2 = $$0.q();
      if ($$1.v() < $$2.am() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dyi.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bwb $$3, cxk $$4) {
      $$0.a($$1.d(), $$2.b(f, dyi.a), 3);
   }

   private dyh b(dbb $$0) {
      dgf $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.g();
      jh $$4 = $$2.d();
      jm $$5 = $$3.i();
      jh $$6 = $$2.a($$5);
      dxn $$7 = $$1.a_($$6);
      jh $$8 = $$4.a($$5);
      dxn $$9 = $$1.a_($$8);
      jm $$10 = $$3.h();
      jh $$11 = $$2.a($$10);
      dxn $$12 = $$1.a_($$11);
      jh $$13 = $$4.a($$10);
      dxn $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dmm && $$7.c(f) == dyi.b;
      boolean $$17 = $$12.b() instanceof dmm && $$12.c(f) == dyi.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fbs $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dyh.a : dyh.b;
         } else {
            return dyh.a;
         }
      } else {
         return dyh.b;
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!this.l.c()) {
         return bte.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? ecj.h : ecj.d, $$2);
         return bte.a;
      }
   }

   public boolean n(dxn $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bvf $$0, dha $$1, dxn $$2, jh $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ecj.h : ecj.d, $$3);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dyi.b ? jm.b : jm.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ecj.h : ecj.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxn $$4 = $$1.a_($$3);
      return $$0.c(f) == dyi.b ? $$4.c($$1, $$3, jm.b) : $$4.a(this);
   }

   private void a(@Nullable bvf $$0, dha $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$1 == dpd.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dxn $$0, jh $$1) {
      return bae.b($$1.u(), $$1.c($$0.c(f) == dyi.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dha $$0, jh $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dxn $$0) {
      if ($$0.b() instanceof dmm $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
