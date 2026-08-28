import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djb extends dgv {
   public static final MapCodec<djb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dup.a.fieldOf("block_set_type").forGetter(djb::b), u()).apply($$0, djb::new)
   );
   public static final duu b = dkr.aE;
   public static final dur c = duq.u;
   public static final duy<duv> d = duq.be;
   public static final dur e = duq.w;
   public static final duy<duw> f = duq.ae;
   protected static final float g = 3.0F;
   protected static final eyx h = dgv.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eyx i = dgv.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eyx j = dgv.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eyx k = dgv.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dup l;

   @Override
   public MapCodec<? extends djb> a() {
      return a;
   }

   protected djb(dup $$0, dtz.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.E.b().b(b, jj.c).b(c, Boolean.valueOf(false)).b(d, duv.a).b(e, Boolean.valueOf(false)).b(f, duw.b));
   }

   public dup b() {
      return this.l;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      jj $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == duv.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      duw $$6 = $$0.c(f);
      if ($$1.o() != jj.a.b || $$6 == duw.b != ($$1 == jj.b)) {
         return $$6 == duw.b && $$1 == jj.a && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof djb && $$2.c(f) != $$6 ? $$2.b(f, $$6) : dgx.a.o();
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, ddk $$3, BiConsumer<cvl, je> $$4) {
      if ($$3.f() && $$0.c(f) == duw.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      if (!$$0.B && ($$3.f() || !$$3.d($$2))) {
         djd.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      je $$1 = $$0.a();
      dds $$2 = $$0.q();
      if ($$1.v() < $$2.an() - 1 && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.o().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, duw.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, buf $$3, cvl $$4) {
      $$0.a($$1.d(), $$2.b(f, duw.a), 3);
   }

   private duv b(cyw $$0) {
      dcx $$1 = $$0.q();
      je $$2 = $$0.a();
      jj $$3 = $$0.g();
      je $$4 = $$2.d();
      jj $$5 = $$3.i();
      je $$6 = $$2.a($$5);
      dua $$7 = $$1.a_($$6);
      je $$8 = $$4.a($$5);
      dua $$9 = $$1.a_($$8);
      jj $$10 = $$3.h();
      je $$11 = $$2.a($$10);
      dua $$12 = $$1.a_($$11);
      je $$13 = $$4.a($$10);
      dua $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof djb && $$7.c(f) == duw.b;
      boolean $$17 = $$12.b() instanceof djb && $$12.c(f) == duw.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            eye $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? duv.a : duv.b;
         } else {
            return duv.a;
         }
      } else {
         return duv.b;
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!this.l.c()) {
         return brk.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? dyx.h : dyx.d, $$2);
         return brk.a;
      }
   }

   public boolean n(dua $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable btj $$0, dds $$1, dua $$2, je $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dyx.h : dyx.d, $$3);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == duw.b ? jj.b : jj.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dyx.h : dyx.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      dua $$4 = $$1.a_($$3);
      return $$0.c(f) == duw.b ? $$4.c($$1, $$3, jj.b) : $$4.a(this);
   }

   private void a(@Nullable btj $$0, dds $$1, je $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awe.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$1 == dls.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dua $$0, je $$1) {
      return azc.b($$1.u(), $$1.c($$0.c(f) == duw.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dds $$0, je $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dua $$0) {
      if ($$0.b() instanceof djb $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
