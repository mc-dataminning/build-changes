import javax.annotation.Nullable;

public class ack implements wu<yo> {
   private final int a;
   @Nullable
   private final sj b;

   public ack(int $$0, @Nullable sj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ack(ue $$0) {
      this.a = $$0.n();
      this.b = $$0.q();
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a((tg)this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public sj d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
