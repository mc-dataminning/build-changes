import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cpb extends coz {
   private static final ddl g = new dek(true, false, Optional.of(1.22F), lu.e.a(aws.cz).map(Function.identity()));
   private static final float h = 1.2F;
   private static final float i = azc.k(3.5F);
   private int j = 5;

   public cpb(btq<? extends coz> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cpb(cnp $$0, dds $$1, double $$2, double $$3, double $$4) {
      super(btq.bn, $$1, $$0, $$2, $$3, $$4);
   }

   public cpb(dds $$0, double $$1, double $$2, double $$3, eye $$4) {
      super(btq.bn, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.j > 0) {
         this.j--;
      }
   }

   @Override
   public boolean a(coj $$0, @Nullable btj $$1, @Nullable btj $$2, boolean $$3) {
      return this.j > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eye $$0) {
      this.dS().a(this, null, g, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dds.a.e, ln.A, ln.z, awd.Cw);
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < (double)i ? false : super.a($$0);
   }
}
