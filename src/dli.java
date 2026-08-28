import com.mojang.serialization.MapCodec;

public abstract class dli extends dmd {
   private final cyl a;

   protected dli(cyl $$0, eas.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dli> a();

   @Override
   public boolean a(eat $$0) {
      return true;
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxf($$0, $$1, this.a);
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dxf $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cyl b() {
      return this.a;
   }
}
