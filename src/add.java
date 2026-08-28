import javax.annotation.Nullable;

public class add implements zk<abz> {
   public static final zb<wa, add> a = zk.a(add::a, add::new);
   private final int b;
   private final byte c;

   public add(bto $$0, byte $$1) {
      this.b = $$0.ap();
      this.c = $$1;
   }

   private add(wa $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wa $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zm<add> a() {
      return ago.D;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   @Nullable
   public bto a(deg $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
