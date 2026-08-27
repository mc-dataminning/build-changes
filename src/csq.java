import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class csq extends ctm {
   private final cix a;

   protected csq(cix $$0, dga.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends csq> a();

   @Override
   public boolean a(dgb $$0) {
      return true;
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new ddn($$0, $$1, this.a);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      if ($$0.B) {
         $$0.a($$1, ddz.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, ddz.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      ddx $$3 = $$0.c_($$1);
      return $$3 instanceof ddn ? ((ddn)$$3).f() : super.a($$0, $$1, $$2);
   }

   public cix b() {
      return this.a;
   }
}
