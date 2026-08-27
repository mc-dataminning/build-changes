import javax.annotation.Nullable;

public class afl implements zb<abm> {
   public static final ys<vu, afl> a = zb.a(afl::a, afl::new);
   private final int b;
   @Nullable
   private final ua c;

   public afl(int $$0, @Nullable ua $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afl(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a((ux)this.c);
   }

   @Override
   public zd<afl> a() {
      return afx.aX;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public ua e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
