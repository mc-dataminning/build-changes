import javax.annotation.Nullable;

public class ace implements xg<zb> {
   private final int a;
   private final int b;

   public ace(blw $$0, @Nullable blw $$1) {
      this.a = $$0.aj();
      this.b = $$1 != null ? $$1.aj() : 0;
   }

   public ace(uj $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(uj $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
