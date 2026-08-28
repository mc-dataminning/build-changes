import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class doy extends dmr {
   public static final MapCodec<doy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebi.a.fieldOf("block_set_type").forGetter(doy::b), t()).apply($$0, doy::new)
   );
   public static final ebr<jb> b = dqs.e;
   public static final ebr<ebp> c = ebj.ah;
   public static final ebr<ebo> d = ebj.bh;
   public static final ebk e = ebj.y;
   public static final ebk f = ebj.A;
   private static final Map<jb, ffw> g = fft.c(dmr.c(16.0, 13.0, 16.0));
   private final ebi h;

   @Override
   public MapCodec<? extends doy> a() {
      return a;
   }

   protected doy(ebi $$0, eas.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(b, jb.c).b(e, Boolean.valueOf(false)).b(d, ebo.a).b(f, Boolean.valueOf(false)).b(c, ebp.b));
   }

   public ebi b() {
      return this.h;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      jb $$4 = $$0.c(b);
      jb $$5 = $$0.c(e) ? ($$0.c(d) == ebo.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      ebp $$8 = $$0.c(c);
      if ($$4.o() != jb.a.b || $$8 == ebp.b != ($$4 == jb.b)) {
         return $$8 == ebp.b && $$4 == jb.a && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof doy && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dmt.a.m();
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      if ($$3.g() && $$0.c(c) == ebp.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eat a(djm $$0, iv $$1, eat $$2, crm $$3) {
      if (!$$0.C && ($$3.gk() || !$$3.d($$2))) {
         dpa.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      iv $$1 = $$0.a();
      djm $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.D($$1) || $$2.D($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, ebp.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bxj $$3, czn $$4) {
      $$0.a($$1.d(), $$2.b(c, ebp.a), 3);
   }

   private ebo b(ddg $$0) {
      diq $$1 = $$0.q();
      iv $$2 = $$0.a();
      jb $$3 = $$0.g();
      iv $$4 = $$2.d();
      jb $$5 = $$3.i();
      iv $$6 = $$2.a($$5);
      eat $$7 = $$1.a_($$6);
      iv $$8 = $$4.a($$5);
      eat $$9 = $$1.a_($$8);
      jb $$10 = $$3.h();
      iv $$11 = $$2.a($$10);
      eat $$12 = $$1.a_($$11);
      iv $$13 = $$4.a($$10);
      eat $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof doy && $$7.c(c) == ebp.b;
      boolean $$17 = $$12.b() instanceof doy && $$12.c(c) == ebp.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ffc $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? ebo.a : ebo.b;
         } else {
            return ebo.a;
         }
      } else {
         return ebo.b;
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!this.h.c()) {
         return bug.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? eft.h : eft.d, $$2);
         return bug.a;
      }
   }

   public boolean n(eat $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bwi $$0, djm $$1, eat $$2, iv $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? eft.h : eft.d, $$3);
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.a($$0.c(c) == ebp.b ? jb.b : jb.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? eft.h : eft.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.e();
      eat $$4 = $$1.a_($$3);
      return $$0.c(c) == ebp.b ? $$4.c($$1, $$3, jb.b) : $$4.a(this);
   }

   private void a(@Nullable bwi $$0, djm $$1, iv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$1 == dru.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(eat $$0, iv $$1) {
      return azm.b($$1.u(), $$1.c($$0.c(c) == ebp.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(djm $$0, iv $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(eat $$0) {
      if ($$0.b() instanceof doy $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
