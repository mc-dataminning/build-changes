import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doq extends dhk {
   public static final MapCodec<doq> a = b(doq::new);
   public static final dvu b = dvt.E;
   private final brd c = bra.a(5);

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   public doq(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dto($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0.C ? null : a($$2, dsi.K, dto::a);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, cvx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
