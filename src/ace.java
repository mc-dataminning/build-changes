import javax.annotation.Nullable;

public class ace implements yp<aba> {
   public static final yg<vi, ace> a = yp.a(ace::a, ace::new);
   private final int b;
   private final byte c;

   public ace(bqa $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private ace(vi $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vi $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public yr<ace> a() {
      return afl.D;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   @Nullable
   public bqa a(czg $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
