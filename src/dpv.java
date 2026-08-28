import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dpv extends dno {
   public static final MapCodec<dpv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecf.a.fieldOf("block_set_type").forGetter(dpv::b), t()).apply($$0, dpv::new)
   );
   public static final eco<jc> b = drp.e;
   public static final eco<ecm> c = ecg.ah;
   public static final eco<ecl> d = ecg.bh;
   public static final ech e = ecg.y;
   public static final ech f = ecg.A;
   private static final Map<jc, fgw> g = fgt.c(dno.c(16.0, 13.0, 16.0));
   private final ecf h;

   @Override
   public MapCodec<? extends dpv> a() {
      return a;
   }

   protected dpv(ecf $$0, ebp.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(b, jc.c).b(e, Boolean.valueOf(false)).b(d, ecl.a).b(f, Boolean.valueOf(false)).b(c, ecm.b));
   }

   public ecf b() {
      return this.h;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      jc $$4 = $$0.c(b);
      jc $$5 = $$0.c(e) ? ($$0.c(d) == ecl.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      ecm $$8 = $$0.c(c);
      if ($$4.o() != jc.a.b || $$8 == ecm.b != ($$4 == jc.b)) {
         return $$8 == ecm.b && $$4 == jc.a && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dpv && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dnq.a.m();
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dkc $$3, BiConsumer<dak, iw> $$4) {
      if ($$3.g() && $$0.c(c) == ecm.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      if (!$$0.C && ($$3.gl() || !$$3.d($$2))) {
         dpx.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      iw $$1 = $$0.a();
      dkj $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.D($$1) || $$2.D($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, ecm.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, byf $$3, dak $$4) {
      $$0.a($$1.d(), $$2.b(c, ecm.a), 3);
   }

   private ecl b(ded $$0) {
      djn $$1 = $$0.q();
      iw $$2 = $$0.a();
      jc $$3 = $$0.g();
      iw $$4 = $$2.d();
      jc $$5 = $$3.i();
      iw $$6 = $$2.a($$5);
      ebq $$7 = $$1.a_($$6);
      iw $$8 = $$4.a($$5);
      ebq $$9 = $$1.a_($$8);
      jc $$10 = $$3.h();
      iw $$11 = $$2.a($$10);
      ebq $$12 = $$1.a_($$11);
      iw $$13 = $$4.a($$10);
      ebq $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dpv && $$7.c(c) == ecm.b;
      boolean $$17 = $$12.b() instanceof dpv && $$12.c(c) == ecm.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fgc $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? ecl.a : ecl.b;
         } else {
            return ecl.a;
         }
      } else {
         return ecl.b;
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!this.h.c()) {
         return bvc.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? egq.h : egq.d, $$2);
         return bvc.a;
      }
   }

   public boolean n(ebq $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bxe $$0, dkj $$1, ebq $$2, iw $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? egq.h : egq.d, $$3);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.a($$0.c(c) == ecm.b ? jc.b : jc.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? egq.h : egq.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      ebq $$4 = $$1.a_($$3);
      return $$0.c(c) == ecm.b ? $$4.c($$1, $$3, jc.b) : $$4.a(this);
   }

   private void a(@Nullable bxe $$0, dkj $$1, iw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), awz.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$1 == dsr.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(ebq $$0, iw $$1) {
      return azz.b($$1.u(), $$1.c($$0.c(c) == ecm.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(dkj $$0, iw $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(ebq $$0) {
      if ($$0.b() instanceof dpv $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
