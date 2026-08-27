import javax.annotation.Nullable;

public class aco implements yz<abk> {
   public static final yq<vs, aco> a = yz.a(aco::a, aco::new);
   private final int b;
   private final byte c;

   public aco(bql $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private aco(vs $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vs $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zb<aco> a() {
      return afv.D;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Nullable
   public bql a(czu $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
