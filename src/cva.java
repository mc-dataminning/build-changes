import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cva extends cvv {
   private final clf a;

   protected cva(clf $$0, diz.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cva> a();

   @Override
   public boolean a(dja $$0) {
      return true;
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dge($$0, $$1, this.a);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      if ($$0.B) {
         $$0.a($$1, dgq.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dgq.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      dgo $$3 = $$0.c_($$1);
      return $$3 instanceof dge ? ((dge)$$3).f() : super.a($$0, $$1, $$2);
   }

   public clf b() {
      return this.a;
   }
}
