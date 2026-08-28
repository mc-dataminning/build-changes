import javax.annotation.Nullable;

public class chl extends bsg {
   public final chn b;
   public final String c;
   private final bsj d;

   public chl(chn $$0, String $$1, float $$2, float $$3) {
      super($$0.al(), $$0.dQ());
      this.d = bsj.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   protected void a(tx $$0) {
   }

   @Override
   protected void b(tx $$0) {
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Nullable
   @Override
   public cuc dD() {
      return this.b.dD();
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bsg $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zb<abn> dm() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bsj a(btn $$0) {
      return this.d;
   }

   @Override
   public boolean dO() {
      return false;
   }
}
