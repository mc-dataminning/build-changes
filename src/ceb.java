import javax.annotation.Nullable;

public class ceb<T extends bvh> extends cdy<T> {
   private final bwe i;

   public ceb(bwe $$0, Class<T> $$1, boolean $$2, @Nullable cfy.a $$3) {
      super($$0, $$1, 10, $$2, false, $$3);
      this.i = $$0;
   }

   @Override
   public boolean b() {
      return !this.i.p() && super.b();
   }

   @Override
   public boolean c() {
      return this.d != null ? this.d.a(a(this.e), this.e, this.c) : super.c();
   }
}
