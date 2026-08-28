import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class doh extends dma {
   public static final MapCodec<doh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eao.a.fieldOf("block_set_type").forGetter(doh::b), t()).apply($$0, doh::new)
   );
   public static final eax<ja> b = dqa.e;
   public static final eax<eav> c = eap.ah;
   public static final eax<eau> d = eap.bh;
   public static final eaq e = eap.y;
   public static final eaq f = eap.A;
   private static final Map<ja, ffc> g = fez.c(dma.c(16.0, 13.0, 16.0));
   private final eao h;

   @Override
   public MapCodec<? extends doh> a() {
      return a;
   }

   protected doh(eao $$0, dzy.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.B.b().b(b, ja.c).b(e, Boolean.valueOf(false)).b(d, eau.a).b(f, Boolean.valueOf(false)).b(c, eav.b));
   }

   public eao b() {
      return this.h;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      ja $$4 = $$0.c(b);
      ja $$5 = $$0.c(e) ? ($$0.c(d) == eau.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      eav $$8 = $$0.c(c);
      if ($$4.o() != ja.a.b || $$8 == eav.b != ($$4 == ja.b)) {
         return $$8 == eav.b && $$4 == ja.a && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof doh && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dmc.a.m();
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, dio $$3, BiConsumer<cyy, iu> $$4) {
      if ($$3.g() && $$0.c(c) == eav.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      if (!$$0.C && ($$3.gk() || !$$3.d($$2))) {
         doj.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      iu $$1 = $$0.a();
      div $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.D($$1) || $$2.D($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, eav.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bxc $$3, cyy $$4) {
      $$0.a($$1.d(), $$2.b(c, eav.a), 3);
   }

   private eau b(dcr $$0) {
      dib $$1 = $$0.q();
      iu $$2 = $$0.a();
      ja $$3 = $$0.g();
      iu $$4 = $$2.d();
      ja $$5 = $$3.i();
      iu $$6 = $$2.a($$5);
      dzz $$7 = $$1.a_($$6);
      iu $$8 = $$4.a($$5);
      dzz $$9 = $$1.a_($$8);
      ja $$10 = $$3.h();
      iu $$11 = $$2.a($$10);
      dzz $$12 = $$1.a_($$11);
      iu $$13 = $$4.a($$10);
      dzz $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof doh && $$7.c(c) == eav.b;
      boolean $$17 = $$12.b() instanceof doh && $$12.c(c) == eav.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fei $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? eau.a : eau.b;
         } else {
            return eau.a;
         }
      } else {
         return eau.b;
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!this.h.c()) {
         return bub.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? eez.h : eez.d, $$2);
         return bub.a;
      }
   }

   public boolean n(dzz $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bwd $$0, div $$1, dzz $$2, iu $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? eez.h : eez.d, $$3);
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.a($$0.c(c) == eav.b ? ja.b : ja.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? eez.h : eez.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.e();
      dzz $$4 = $$1.a_($$3);
      return $$0.c(c) == eav.b ? $$4.c($$1, $$3, ja.b) : $$4.a(this);
   }

   private void a(@Nullable bwd $$0, div $$1, iu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$1 == drc.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dzz $$0, iu $$1) {
      return azm.b($$1.u(), $$1.c($$0.c(c) == eav.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(div $$0, iu $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dzz $$0) {
      if ($$0.b() instanceof doh $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
