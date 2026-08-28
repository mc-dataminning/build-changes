import javax.annotation.Nullable;

public class ade implements zl<aca> {
   public static final zc<wb, ade> a = zl.a(ade::a, ade::new);
   private final int b;
   private final byte c;

   public ade(btr $$0, byte $$1) {
      this.b = $$0.ap();
      this.c = $$1;
   }

   private ade(wb $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wb $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zn<ade> a() {
      return agp.D;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   @Nullable
   public btr a(dej $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
