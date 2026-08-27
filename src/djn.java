import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djn extends dch {
   public static final MapCodec<djn> a = b(djn::new);
   public static final dqp b = dqo.E;
   private final bnv c = bns.a(5);

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   public djn(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new doj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0.B ? null : a($$2, dnf.K, doj::a);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, csd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
