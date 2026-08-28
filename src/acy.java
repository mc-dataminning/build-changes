import javax.annotation.Nullable;

public class acy implements zg<abu> {
   public static final yx<vw, acy> a = zg.a(acy::a, acy::new);
   private final int b;
   private final byte c;

   public acy(bsr $$0, byte $$1) {
      this.b = $$0.an();
      this.c = $$1;
   }

   private acy(vw $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vw $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zi<acy> a() {
      return agg.D;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsr a(dcw $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
