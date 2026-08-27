import javax.annotation.Nullable;

public class ael implements yb<aam> {
   public static final xs<uu, ael> a = yb.a(ael::a, ael::new);
   private final int b;
   @Nullable
   private final ta c;

   public ael(int $$0, @Nullable ta $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ael(uu $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.a((tx)this.c);
   }

   @Override
   public yd<ael> a() {
      return aex.aX;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public ta e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
