import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmt extends dkl {
   public static final MapCodec<dmt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyj.a.fieldOf("block_set_type").forGetter(dmt::b), t()).apply($$0, dmt::new)
   );
   public static final dyr<jm> b = doj.aF;
   public static final dyl c = dyk.v;
   public static final dyr<dyo> d = dyk.bf;
   public static final dyl e = dyk.x;
   public static final dyr<dyp> f = dyk.af;
   protected static final float g = 3.0F;
   protected static final fcr h = dkl.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcr i = dkl.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fcr j = dkl.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcr k = dkl.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dyj l;

   @Override
   public MapCodec<? extends dmt> a() {
      return a;
   }

   protected dmt(dyj $$0, dxt.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, dyo.a).b(e, Boolean.valueOf(false)).b(f, dyp.b));
   }

   public dyj b() {
      return this.l;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      jm $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dyo.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      dyp $$8 = $$0.c(f);
      if ($$4.o() != jm.a.b || $$8 == dyp.b != ($$4 == jm.b)) {
         return $$8 == dyp.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dmt && $$6.c(f) != $$8 ? $$6.b(f, $$8) : dkn.a.m();
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, dgz $$3, BiConsumer<cxo, jh> $$4) {
      if ($$3.g() && $$0.c(f) == dyp.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      if (!$$0.C && ($$3.b() || !$$3.d($$2))) {
         dmv.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      jh $$1 = $$0.a();
      dhh $$2 = $$0.q();
      if ($$1.v() < $$2.am() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dyp.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bwf $$3, cxo $$4) {
      $$0.a($$1.d(), $$2.b(f, dyp.a), 3);
   }

   private dyo b(dbf $$0) {
      dgm $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.g();
      jh $$4 = $$2.d();
      jm $$5 = $$3.i();
      jh $$6 = $$2.a($$5);
      dxu $$7 = $$1.a_($$6);
      jh $$8 = $$4.a($$5);
      dxu $$9 = $$1.a_($$8);
      jm $$10 = $$3.h();
      jh $$11 = $$2.a($$10);
      dxu $$12 = $$1.a_($$11);
      jh $$13 = $$4.a($$10);
      dxu $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dmt && $$7.c(f) == dyp.b;
      boolean $$17 = $$12.b() instanceof dmt && $$12.c(f) == dyp.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fbx $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dyo.a : dyo.b;
         } else {
            return dyo.a;
         }
      } else {
         return dyo.b;
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!this.l.c()) {
         return bti.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? ecq.h : ecq.d, $$2);
         return bti.a;
      }
   }

   public boolean n(dxu $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bvj $$0, dhh $$1, dxu $$2, jh $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ecq.h : ecq.d, $$3);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dyp.b ? jm.b : jm.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ecq.h : ecq.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxu $$4 = $$1.a_($$3);
      return $$0.c(f) == dyp.b ? $$4.c($$1, $$3, jm.b) : $$4.a(this);
   }

   private void a(@Nullable bvj $$0, dhh $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$1 == dpk.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dxu $$0, jh $$1) {
      return bae.b($$1.u(), $$1.c($$0.c(f) == dyp.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dhh $$0, jh $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dxu $$0) {
      if ($$0.b() instanceof dmt $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
