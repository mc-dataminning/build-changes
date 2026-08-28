import javax.annotation.Nullable;

public class agk implements zs<ach> {
   public static final zj<wi, agk> a = zs.a(agk::a, agk::new);
   private final int b;
   @Nullable
   private final un c;

   public agk(int $$0, @Nullable un $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agk(wi $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a((vk)this.c);
   }

   @Override
   public zu<agk> a() {
      return agw.aY;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public un e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
