import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cim extends cij implements bty<jj<cin>> {
   private static final ajp<jj<cin>> h = ajt.a(cim.class, ajr.A);
   public static final MapCodec<jj<cin>> e = cin.b.fieldOf("variant");
   public static final Codec<jj<cin>> f = e.codec();
   public static final float g = 0.0625F;

   public cim(bsj<? extends cim> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(h, this.dR().d(lr.W).a().orElseThrow());
   }

   @Override
   public void a(ajp<?> $$0) {
      if (h.equals($$0)) {
         this.p();
      }
   }

   public void b(jj<cin> $$0) {
      this.ao.a(h, $$0);
   }

   public jj<cin> v() {
      return this.ao.a(h);
   }

   public static Optional<cim> a(dcd $$0, ja $$1, jf $$2) {
      cim $$3 = new cim($$0, $$1);
      List<jj<cin>> $$4 = new ArrayList<>();
      $$0.H_().d(lr.W).c(awe.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cim::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jj<cin>> $$6 = ac.b($$4, $$3.ah);
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

   private static int c(jj<cin> $$0) {
      return $$0.a().a();
   }

   private cim(dcd $$0, ja $$1) {
      super(bsj.av, $$0, $$1);
   }

   public cim(dcd $$0, ja $$1, jf $$2, jj<cin> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tx $$0) {
      f.encodeStart(this.dR().a(ul.a), this.v()).ifSuccess($$1 -> $$0.a((tx)$$1));
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(tx $$0) {
      f.parse(this.dR().a(ul.a), $$0).ifSuccess(this::b);
      this.d = jf.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   protected evu a(ja $$0, jf $$1) {
      float $$2 = 0.46875F;
      evz $$3 = evz.b($$0).a($$1, -0.46875);
      cin $$4 = this.v().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jf $$7 = $$1.i();
      evz $$8 = $$3.a($$7, $$5).a(jf.b, $$6);
      jf.a $$9 = $$1.o();
      double $$10 = $$9 == jf.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jf.a.c ? 0.0625 : (double)$$4.b();
      return evu.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void b(@Nullable bsd $$0) {
      if (this.dP().ab().b(dbz.i)) {
         this.a(avf.ss, 1.0F, 1.0F);
         if ($$0 instanceof cmh $$1 && $$1.fL()) {
            return;
         }

         this.a(cud.pZ);
      }
   }

   @Override
   public void C() {
      this.a(avf.st, 1.0F, 1.0F);
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
   public evz do() {
      return evz.a(this.b);
   }

   @Override
   public zb<abn> dl() {
      return new abo(this, this.d.d(), this.u());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.a(jf.a($$0.p()));
   }

   @Override
   public cua dC() {
      return new cua(cud.pZ);
   }
}
