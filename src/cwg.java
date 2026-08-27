import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwg extends cuf implements dbt {
   public static final MapCodec<cwg> a = b(cwg::new);
   public static final dhn b = dhm.C;
   private static final int d = 3;
   protected static final ekb c = cut.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cwg> a() {
      return a;
   }

   public cwg(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.z, $$0.B ? dfd::a : dfd::b);
   }

   @Override
   public day b_(dgw $$0) {
      return day.b;
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(b) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof dem) {
            ((dem)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(arh.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
