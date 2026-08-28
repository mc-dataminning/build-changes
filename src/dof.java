import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dof extends dgy {
   public static final MapCodec<dof> a = b(dof::new);
   public static final dvj b = dvi.E;
   private final bqx c = bqu.a(5);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0.B ? null : a($$2, drx.K, dtd::a);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, cvs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
