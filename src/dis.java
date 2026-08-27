import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dis extends cvv {
   public static final MapCodec<dis> a = b(dis::new);
   public static final dju b = diu.a;
   public static final djy<dkc> c = diu.c;

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, dkc.a));
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return null;
   }

   public static dgo a(hx $$0, dja $$1, dja $$2, ic $$3, boolean $$4, boolean $$5) {
      return new diw($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.k, diw::a);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgo $$5 = $$1.c_($$2);
         if ($$5 instanceof diw) {
            ((diw)$$5).l();
         }
      }
   }

   @Override
   public void a(ctj $$0, hx $$1, dja $$2) {
      hx $$3 = $$1.a($$2.c(b).g());
      dja $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dit && $$4.c(dit.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bjv.b;
      } else {
         return bjv.d;
      }
   }

   @Override
   public List<cmr> a(dja $$0, egv.a $$1) {
      diw $$2 = this.a($$1.a(), hx.a($$1.a(eja.f)));
      return $$2 == null ? Collections.emptyList() : $$2.k().a($$1);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return emc.a();
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      diw $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : emc.a();
   }

   @Nullable
   private diw a(cso $$0, hx $$1) {
      dgo $$2 = $$0.c_($$1);
      return $$2 instanceof diw ? (diw)$$2 : null;
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return cmr.f;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
