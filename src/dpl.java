import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dpl extends dne {
   public static final MapCodec<dpl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebv.a.fieldOf("block_set_type").forGetter(dpl::b), t()).apply($$0, dpl::new)
   );
   public static final ece<jc> b = drf.e;
   public static final ece<ecc> c = ebw.ah;
   public static final ece<ecb> d = ebw.bh;
   public static final ebx e = ebw.y;
   public static final ebx f = ebw.A;
   private static final Map<jc, fgm> g = fgj.c(dne.c(16.0, 13.0, 16.0));
   private final ebv h;

   @Override
   public MapCodec<? extends dpl> a() {
      return a;
   }

   protected dpl(ebv $$0, ebf.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(b, jc.c).b(e, Boolean.valueOf(false)).b(d, ecb.a).b(f, Boolean.valueOf(false)).b(c, ecc.b));
   }

   public ebv b() {
      return this.h;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      jc $$4 = $$0.c(b);
      jc $$5 = $$0.c(e) ? ($$0.c(d) == ecb.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      ecc $$8 = $$0.c(c);
      if ($$4.o() != jc.a.b || $$8 == ecc.b != ($$4 == jc.b)) {
         return $$8 == ecc.b && $$4 == jc.a && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dpl && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dng.a.m();
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, djs $$3, BiConsumer<daa, iw> $$4) {
      if ($$3.g() && $$0.c(c) == ecc.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      if (!$$0.C && ($$3.gl() || !$$3.d($$2))) {
         dpn.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      iw $$1 = $$0.a();
      djz $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.D($$1) || $$2.D($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, ecc.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bxw $$3, daa $$4) {
      $$0.a($$1.d(), $$2.b(c, ecc.a), 3);
   }

   private ecb b(ddt $$0) {
      djd $$1 = $$0.q();
      iw $$2 = $$0.a();
      jc $$3 = $$0.g();
      iw $$4 = $$2.d();
      jc $$5 = $$3.i();
      iw $$6 = $$2.a($$5);
      ebg $$7 = $$1.a_($$6);
      iw $$8 = $$4.a($$5);
      ebg $$9 = $$1.a_($$8);
      jc $$10 = $$3.h();
      iw $$11 = $$2.a($$10);
      ebg $$12 = $$1.a_($$11);
      iw $$13 = $$4.a($$10);
      ebg $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dpl && $$7.c(c) == ecc.b;
      boolean $$17 = $$12.b() instanceof dpl && $$12.c(c) == ecc.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ffs $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? ecb.a : ecb.b;
         } else {
            return ecb.a;
         }
      } else {
         return ecb.b;
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!this.h.c()) {
         return but.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? egg.h : egg.d, $$2);
         return but.a;
      }
   }

   public boolean n(ebg $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bwv $$0, djz $$1, ebg $$2, iw $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? egg.h : egg.d, $$3);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.a($$0.c(c) == ecc.b ? jc.b : jc.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? egg.h : egg.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      ebg $$4 = $$1.a_($$3);
      return $$0.c(c) == ecc.b ? $$4.c($$1, $$3, jc.b) : $$4.a(this);
   }

   private void a(@Nullable bwv $$0, djz $$1, iw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), aws.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$1 == dsh.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(ebg $$0, iw $$1) {
      return azq.b($$1.u(), $$1.c($$0.c(c) == ecc.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(djz $$0, iw $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(ebg $$0) {
      if ($$0.b() instanceof dpl $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
