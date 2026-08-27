import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dgo extends cuf {
   public static final MapCodec<dgo> a = b(dgo::new);
   public static final dhq b = dgq.a;
   public static final dhu<dhy> c = dgq.c;

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgo(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, dhy.a));
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return null;
   }

   public static der a(ht $$0, dgw $$1, dgw $$2, hx $$3, boolean $$4, boolean $$5) {
      return new dgs($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.k, dgs::a);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         der $$5 = $$1.c_($$2);
         if ($$5 instanceof dgs) {
            ((dgs)$$5).j();
         }
      }
   }

   @Override
   public void a(crt $$0, ht $$1, dgw $$2) {
      ht $$3 = $$1.a($$2.c(b).g());
      dgw $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dgp && $$4.c(dgp.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return biq.b;
      } else {
         return biq.d;
      }
   }

   @Override
   public List<clb> a(dgw $$0, eer.a $$1) {
      dgs $$2 = this.a($$1.a(), ht.a($$1.a(egw.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ejy.a();
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      dgs $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ejy.a();
   }

   @Nullable
   private dgs a(cqy $$0, ht $$1) {
      der $$2 = $$0.c_($$1);
      return $$2 instanceof dgs ? (dgs)$$2 : null;
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return clb.b;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
