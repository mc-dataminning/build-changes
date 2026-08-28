import javax.annotation.Nullable;

public class adj implements zq<acf> {
   public static final zh<wg, adj> a = zq.a(adj::a, adj::new);
   private final int b;
   private final byte c;

   public adj(bul $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private adj(wg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wg $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zs<adj> a() {
      return agu.D;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   @Nullable
   public bul a(dfm $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
