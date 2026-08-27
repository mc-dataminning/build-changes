import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class chm extends chj implements bsz<iw<chn>> {
   private static final ajm<iw<chn>> g = ajq.a(chm.class, ajo.A);
   private static final akg<chn> h = cho.a;
   public static final MapCodec<iw<chn>> e = ld.l.r().fieldOf("variant");
   public static final Codec<iw<chn>> f = e.codec();

   private static iw<chn> r() {
      return ld.l.g(h);
   }

   public chm(brn<? extends chm> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajq.a $$0) {
      $$0.a(g, r());
   }

   @Override
   public void a(ajm<?> $$0) {
      if (g.equals($$0)) {
         this.y();
      }
   }

   public void b(iw<chn> $$0) {
      this.ao.a(g, $$0);
   }

   public iw<chn> p() {
      return this.ao.a(g);
   }

   public static Optional<chm> a(dad $$0, in $$1, is $$2) {
      chm $$3 = new chm($$0, $$1);
      List<iw<chn>> $$4 = new ArrayList<>();
      ld.l.c(awa.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.z();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(chm::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<iw<chn>> $$6 = ac.b($$4, $$3.ah);
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

   private static int c(iw<chn> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private chm(dad $$0, in $$1) {
      super(brn.au, $$0, $$1);
   }

   public chm(dad $$0, in $$1, is $$2, iw<chn> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ua $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(ua $$0) {
      iw<chn> $$1 = f.parse(uo.a, $$0).result().orElseGet(chm::r);
      this.b($$1);
      this.d = is.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(ua $$0, iw<chn> $$1) {
      f.encodeStart(uo.a, $$1).result().ifPresent($$1x -> $$0.a((ua)$$1x));
   }

   @Override
   public int A() {
      return this.p().a().a();
   }

   @Override
   public int B() {
      return this.p().a().b();
   }

   @Override
   public void b(@Nullable brh $$0) {
      if (this.dN().aa().b(czz.i)) {
         this.a(avc.se, 1.0F, 1.0F);
         if ($$0 instanceof clh $$1 && $$1.fN()) {
            return;
         }

         this.a(ctc.pZ);
      }
   }

   @Override
   public void C() {
      this.a(avc.sf, 1.0F, 1.0F);
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
   public etp dm() {
      return etp.a(this.c);
   }

   @Override
   public zb<abm> dj() {
      return new abn(this, this.d.d(), this.D());
   }

   @Override
   public void a(abn $$0) {
      super.a($$0);
      this.a(is.a($$0.p()));
   }

   @Override
   public csz dA() {
      return new csz(ctc.pZ);
   }
}
