import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dpj extends dnc {
   public static final MapCodec<dpj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebt.a.fieldOf("block_set_type").forGetter(dpj::b), t()).apply($$0, dpj::new)
   );
   public static final ecc<jb> b = drd.e;
   public static final ecc<eca> c = ebu.ah;
   public static final ecc<ebz> d = ebu.bh;
   public static final ebv e = ebu.y;
   public static final ebv f = ebu.A;
   private static final Map<jb, fgk> g = fgh.c(dnc.c(16.0, 13.0, 16.0));
   private final ebt h;

   @Override
   public MapCodec<? extends dpj> a() {
      return a;
   }

   protected dpj(ebt $$0, ebd.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(b, jb.c).b(e, Boolean.valueOf(false)).b(d, ebz.a).b(f, Boolean.valueOf(false)).b(c, eca.b));
   }

   public ebt b() {
      return this.h;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      jb $$4 = $$0.c(b);
      jb $$5 = $$0.c(e) ? ($$0.c(d) == ebz.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      eca $$8 = $$0.c(c);
      if ($$4.o() != jb.a.b || $$8 == eca.b != ($$4 == jb.b)) {
         return $$8 == eca.b && $$4 == jb.a && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dpj && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dne.a.m();
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      if ($$3.g() && $$0.c(c) == eca.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      if (!$$0.C && ($$3.gl() || !$$3.d($$2))) {
         dpl.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      iv $$1 = $$0.a();
      djx $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.D($$1) || $$2.D($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, eca.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bxu $$3, czy $$4) {
      $$0.a($$1.d(), $$2.b(c, eca.a), 3);
   }

   private ebz b(ddr $$0) {
      djb $$1 = $$0.q();
      iv $$2 = $$0.a();
      jb $$3 = $$0.g();
      iv $$4 = $$2.d();
      jb $$5 = $$3.i();
      iv $$6 = $$2.a($$5);
      ebe $$7 = $$1.a_($$6);
      iv $$8 = $$4.a($$5);
      ebe $$9 = $$1.a_($$8);
      jb $$10 = $$3.h();
      iv $$11 = $$2.a($$10);
      ebe $$12 = $$1.a_($$11);
      iv $$13 = $$4.a($$10);
      ebe $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dpj && $$7.c(c) == eca.b;
      boolean $$17 = $$12.b() instanceof dpj && $$12.c(c) == eca.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ffq $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? ebz.a : ebz.b;
         } else {
            return ebz.a;
         }
      } else {
         return ebz.b;
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!this.h.c()) {
         return bur.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? ege.h : ege.d, $$2);
         return bur.a;
      }
   }

   public boolean n(ebe $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bwt $$0, djx $$1, ebe $$2, iv $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ege.h : ege.d, $$3);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.a($$0.c(c) == eca.b ? jb.b : jb.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ege.h : ege.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      ebe $$4 = $$1.a_($$3);
      return $$0.c(c) == eca.b ? $$4.c($$1, $$3, jb.b) : $$4.a(this);
   }

   private void a(@Nullable bwt $$0, djx $$1, iv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), awq.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$1 == dsf.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(ebe $$0, iv $$1) {
      return azo.b($$1.u(), $$1.c($$0.c(c) == eca.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(djx $$0, iv $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(ebe $$0) {
      if ($$0.b() instanceof dpj $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
