public class abn implements yp<aba> {
   public static final yg<vi, abn> a = yp.a(abn::a, abn::new);
   private final boc b;
   private final boolean c;

   public abn(boc $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private abn(vi $$0) {
      this.b = boc.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public yr<abn> a() {
      return afl.m;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public boc e() {
      return this.b;
   }
}
