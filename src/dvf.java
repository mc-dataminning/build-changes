import java.util.Optional;

public class dvf extends dmh {
   private final crt a;
   private final dhy b;
   private final Optional<dve> c;

   public dvf(crt $$0, dhy $$1, Optional<dve> $$2) {
      super($$1, $$0);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public int a(dlk.a $$0, int $$1, int $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public dhw a(cqg $$0, dlg.a $$1) {
      return ((dis)this.a.a($$0.e, $$0.f)).b($$1);
   }

   public dgb a(ht $$0) {
      return this.a.a_($$0);
   }

   public int c() {
      return this.a.I_();
   }

   public crt d() {
      return this.a;
   }

   public Optional<dve> e() {
      return this.c;
   }

   public dhy f() {
      return this.b;
   }
}
