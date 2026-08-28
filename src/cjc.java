import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cjc extends ciz implements buo<jm<cjd>> {
   private static final ajw<jm<cjd>> h = aka.a(cjc.class, ajy.A);
   public static final MapCodec<jm<cjd>> e = cjd.c.fieldOf("variant");
   public static final Codec<jm<cjd>> f = e.codec();
   public static final float g = 0.0625F;

   public cjc(bsx<? extends cjc> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(h, this.dQ().d(lu.X).a().orElseThrow());
   }

   @Override
   public void a(ajw<?> $$0) {
      if (h.equals($$0)) {
         this.p();
      }
   }

   public void b(jm<cjd> $$0) {
      this.ao.a(h, $$0);
   }

   public jm<cjd> v() {
      return this.ao.a(h);
   }

   public static Optional<cjc> a(dcw $$0, jd $$1, ji $$2) {
      cjc $$3 = new cjc($$0, $$1);
      List<jm<cjd>> $$4 = new ArrayList<>();
      $$0.H_().d(lu.X).c(awo.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.s();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(cjc::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jm<cjd>> $$6 = ad.b($$4, $$3.ah);
            if ($$6.isEmpty()) {
               return Optional.empty();
            } else {
               $$3.b($$6.get());
               $$3.a($$2);
               return Optional.of($$3);
            }
         }
      }
   }

   private static int c(jm<cjd> $$0) {
      return $$0.a().a();
   }

   private cjc(dcw $$0, jd $$1) {
      super(bsx.av, $$0, $$1);
   }

   public cjc(dcw $$0, jd $$1, ji $$2, jm<cjd> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ub $$0) {
      f.encodeStart(this.dQ().a(up.a), this.v()).ifSuccess($$1 -> $$0.a((ub)$$1));
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(ub $$0) {
      f.parse(this.dQ().a(up.a), $$0).ifSuccess(this::b);
      this.d = ji.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   protected ewx a(jd $$0, ji $$1) {
      float $$2 = 0.46875F;
      exc $$3 = exc.b($$0).a($$1, -0.46875);
      cjd $$4 = this.v().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      ji $$7 = $$1.i();
      exc $$8 = $$3.a($$7, $$5).a(ji.b, $$6);
      ji.a $$9 = $$1.o();
      double $$10 = $$9 == ji.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == ji.a.c ? 0.0625 : (double)$$4.b();
      return ewx.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void b(@Nullable bsr $$0) {
      if (this.dO().ab().b(dcs.i)) {
         this.a(avp.ss, 1.0F, 1.0F);
         if ($$0 instanceof cmx $$1 && $$1.fL()) {
            return;
         }

         this.a(cut.pZ);
      }
   }

   @Override
   public void C() {
      this.a(avp.st, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public exc dn() {
      return exc.a(this.b);
   }

   @Override
   public zg<abu> a(aqt $$0) {
      return new abv(this, this.d.d(), this.t());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.a(ji.a($$0.p()));
   }

   @Override
   public cuq dB() {
      return new cuq(cut.pZ);
   }
}
