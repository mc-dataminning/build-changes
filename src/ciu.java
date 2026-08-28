import javax.annotation.Nullable;

public class ciu extends bto {
   public final cix b;
   public final String c;
   private final btr d;

   public ciu(cix $$0, String $$1, float $$2, float $$3) {
      super($$0.ao(), $$0.dS());
      this.d = btr.b($$2, $$3);
      this.i_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(uf $$0) {
   }

   @Override
   protected void b(uf $$0) {
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Nullable
   @Override
   public cvp dF() {
      return this.b.dF();
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean u(bto $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zk<abz> a(arg $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public btr a(buw $$0) {
      return this.d;
   }

   @Override
   public boolean dQ() {
      return false;
   }
}
