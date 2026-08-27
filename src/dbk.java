import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbk extends cuf {
   public static final MapCodec<dbk> a = b(dbk::new);
   public static final dhn b = dhm.E;
   private final bhv c = bhs.a(5);

   @Override
   public MapCodec<dbk> a() {
      return a;
   }

   public dbk(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return $$0.B ? null : a($$2, det.K, dfw::a);
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, clb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
