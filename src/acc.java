import javax.annotation.Nullable;

public class acc implements yn<aay> {
   public static final ye<vg, acc> a = yn.a(acc::a, acc::new);
   private final int b;
   private final byte c;

   public acc(bpv $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private acc(vg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vg $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public yp<acc> a() {
      return afj.D;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   @Nullable
   public bpv a(cyx $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
