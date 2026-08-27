import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dih extends cvl {
   public static final MapCodec<dih> a = b(dih::new);
   public static final djj b = dij.a;
   public static final djn<djr> c = dij.c;

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   public dih(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c).a(c, djr.a));
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return null;
   }

   public static dgd a(hv $$0, dip $$1, dip $$2, ia $$3, boolean $$4, boolean $$5) {
      return new dil($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.k, dil::a);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgd $$5 = $$1.c_($$2);
         if ($$5 instanceof dil) {
            ((dil)$$5).l();
         }
      }
   }

   @Override
   public void a(csz $$0, hv $$1, dip $$2) {
      hv $$3 = $$1.a($$2.c(b).g());
      dip $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dii && $$4.c(dii.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bjl.b;
      } else {
         return bjl.d;
      }
   }

   @Override
   public List<cmh> a(dip $$0, egk.a $$1) {
      dil $$2 = this.a($$1.a(), hv.a($$1.a(eip.f)));
      return $$2 == null ? Collections.emptyList() : $$2.k().a($$1);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return elr.a();
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      dil $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : elr.a();
   }

   @Nullable
   private dil a(cse $$0, hv $$1) {
      dgd $$2 = $$0.c_($$1);
      return $$2 instanceof dil ? (dil)$$2 : null;
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return cmh.f;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
