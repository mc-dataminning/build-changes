import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class der extends cry {
   public static final dft a = det.a;
   public static final dfx<dgb> b = det.b;

   public der(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, dgb.a));
   }

   @Nullable
   @Override
   public dcl a(gu $$0, dez $$1) {
      return null;
   }

   public static dcl a(gu $$0, dez $$1, dez $$2, ha $$3, boolean $$4, boolean $$5) {
      return new dev($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$2, dcn.k, dev::a);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcl $$5 = $$1.c_($$2);
         if ($$5 instanceof dev) {
            ((dev)$$5).j();
         }
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dez $$2) {
      gu $$3 = $$1.a($$2.c(a).g());
      dez $$4 = $$0.a_($$3);
      if ($$4.b() instanceof des && $$4.c(des.b)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bgq.b;
      } else {
         return bgq.d;
      }
   }

   @Override
   public List<cix> a(dez $$0, ecm.a $$1) {
      dev $$2 = this.a($$1.a(), gu.a($$1.a(eer.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return eht.a();
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      dev $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eht.a();
   }

   @Nullable
   private dev a(cor $$0, gu $$1) {
      dcl $$2 = $$0.c_($$1);
      return $$2 instanceof dev ? (dev)$$2 : null;
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return cix.b;
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
