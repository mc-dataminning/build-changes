import java.util.Optional;

public class elc extends ecc {
   private final dfy a;
   private final dxg b;
   private final Optional<elb> c;

   public elc(dfy $$0, dxg $$1, Optional<elb> $$2) {
      super($$1, $$0);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public int a(ebf.a $$0, int $$1, int $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public dxe a(deh $$0) {
      return ((dxz)this.a.a($$0.g, $$0.h)).C();
   }

   public dvj a(jh $$0) {
      return this.a.a_($$0);
   }

   public int c() {
      return this.a.I_();
   }

   public dfy d() {
      return this.a;
   }

   public Optional<elb> e() {
      return this.c;
   }

   public dxg f() {
      return this.b;
   }
}
