import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkw extends diq {
   public static final MapCodec<dkw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwk.a.fieldOf("block_set_type").forGetter(dkw::b), t()).apply($$0, dkw::new)
   );
   public static final dws<jm> b = dml.aF;
   public static final dwm c = dwl.u;
   public static final dws<dwp> d = dwl.be;
   public static final dwm e = dwl.w;
   public static final dws<dwq> f = dwl.ae;
   protected static final float g = 3.0F;
   protected static final fas h = diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fas i = diq.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fas j = diq.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fas k = diq.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dwk l;

   @Override
   public MapCodec<? extends dkw> a() {
      return a;
   }

   protected dkw(dwk $$0, dvu.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, dwp.a).b(e, Boolean.valueOf(false)).b(f, dwq.b));
   }

   public dwk b() {
      return this.l;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      jm $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dwp.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      dwq $$8 = $$0.c(f);
      if ($$4.o() != jm.a.b || $$8 == dwq.b != ($$4 == jm.b)) {
         return $$8 == dwq.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dkw && $$6.c(f) != $$8 ? $$6.b(f, $$8) : dis.a.m();
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, dfe $$3, BiConsumer<cwm, jh> $$4) {
      if ($$3.g() && $$0.c(f) == dwq.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      if (!$$0.C && ($$3.b() || !$$3.d($$2))) {
         dky.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      jh $$1 = $$0.a();
      dfm $$2 = $$0.q();
      if ($$1.v() < $$2.al() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dwq.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bvh $$3, cwm $$4) {
      $$0.a($$1.d(), $$2.b(f, dwq.a), 3);
   }

   private dwp b(dad $$0) {
      der $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.g();
      jh $$4 = $$2.d();
      jm $$5 = $$3.i();
      jh $$6 = $$2.a($$5);
      dvv $$7 = $$1.a_($$6);
      jh $$8 = $$4.a($$5);
      dvv $$9 = $$1.a_($$8);
      jm $$10 = $$3.h();
      jh $$11 = $$2.a($$10);
      dvv $$12 = $$1.a_($$11);
      jh $$13 = $$4.a($$10);
      dvv $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dkw && $$7.c(f) == dwq.b;
      boolean $$17 = $$12.b() instanceof dkw && $$12.c(f) == dwq.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ezy $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dwp.a : dwp.b;
         } else {
            return dwp.a;
         }
      } else {
         return dwp.b;
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!this.l.c()) {
         return bsk.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? ear.h : ear.d, $$2);
         return bsk.a;
      }
   }

   public boolean n(dvv $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bul $$0, dfm $$1, dvv $$2, jh $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ear.h : ear.d, $$3);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dwq.b ? jm.b : jm.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ear.h : ear.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvv $$4 = $$1.a_($$3);
      return $$0.c(f) == dwq.b ? $$4.c($$1, $$3, jm.b) : $$4.a(this);
   }

   private void a(@Nullable bul $$0, dfm $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awo.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$1 == dnm.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dvv $$0, jh $$1) {
      return azm.b($$1.u(), $$1.c($$0.c(f) == dwq.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dfm $$0, jh $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dvv $$0) {
      if ($$0.b() instanceof dkw $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
