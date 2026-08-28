import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ciq extends cin implements buc<jj<cir>> {
   private static final ajp<jj<cir>> h = ajt.a(ciq.class, ajr.A);
   public static final MapCodec<jj<cir>> e = cir.c.fieldOf("variant");
   public static final Codec<jj<cir>> f = e.codec();
   public static final float g = 0.0625F;

   public ciq(bsn<? extends ciq> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(h, this.dT().d(lr.W).a().orElseThrow());
   }

   @Override
   public void a(ajp<?> $$0) {
      if (h.equals($$0)) {
         this.p();
      }
   }

   public void b(jj<cir> $$0) {
      this.ao.a(h, $$0);
   }

   public jj<cir> v() {
      return this.ao.a(h);
   }

   public static Optional<ciq> a(dcg $$0, ja $$1, jf $$2) {
      ciq $$3 = new ciq($$0, $$1);
      List<jj<cir>> $$4 = new ArrayList<>();
      $$0.H_().d(lr.W).c(awg.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(ciq::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jj<cir>> $$6 = ac.b($$4, $$3.ah);
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

   private static int c(jj<cir> $$0) {
      return $$0.a().a();
   }

   private ciq(dcg $$0, ja $$1) {
      super(bsn.av, $$0, $$1);
   }

   public ciq(dcg $$0, ja $$1, jf $$2, jj<cir> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tx $$0) {
      f.encodeStart(this.dT().a(ul.a), this.v()).ifSuccess($$1 -> $$0.a((tx)$$1));
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(tx $$0) {
      f.parse(this.dT().a(ul.a), $$0).ifSuccess(this::b);
      this.d = jf.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   protected ewc a(ja $$0, jf $$1) {
      float $$2 = 0.46875F;
      ewh $$3 = ewh.b($$0).a($$1, -0.46875);
      cir $$4 = this.v().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jf $$7 = $$1.i();
      ewh $$8 = $$3.a($$7, $$5).a(jf.b, $$6);
      jf.a $$9 = $$1.o();
      double $$10 = $$9 == jf.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jf.a.c ? 0.0625 : (double)$$4.b();
      return ewc.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void b(@Nullable bsh $$0) {
      if (this.dR().ab().b(dcc.i)) {
         this.a(avh.ss, 1.0F, 1.0F);
         if ($$0 instanceof cml $$1 && $$1.fN()) {
            return;
         }

         this.a(cug.pZ);
      }
   }

   @Override
   public void C() {
      this.a(avh.st, 1.0F, 1.0F);
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
   public ewh dq() {
      return ewh.a(this.b);
   }

   @Override
   public zb<abn> dn() {
      return new abo(this, this.d.d(), this.t());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.a(jf.a($$0.p()));
   }

   @Override
   public cud dE() {
      return new cud(cug.pZ);
   }
}
