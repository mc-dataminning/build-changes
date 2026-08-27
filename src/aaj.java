import javax.annotation.Nullable;

public class aaj implements wu<yo> {
   private final int a;
   private final cir<?> b;
   private final vb c;

   public aaj(int $$0, cir<?> $$1, vb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aaj(ue $$0) {
      this.a = $$0.n();
      this.b = $$0.a(kb.r);
      this.c = $$0.m();
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a(kb.r, this.b);
      $$0.a(this.c);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cir<?> d() {
      return this.b;
   }

   public vb e() {
      return this.c;
   }
}
