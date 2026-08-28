import javax.annotation.Nullable;

public class aic implements zs<ags> {
   public static final zj<wl, aic> a = zs.a(aic::a, aic::new);
   private final aic.a b;
   @Nullable
   private final alb c;

   public aic(aic.a $$0, @Nullable alb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aic a(af $$0) {
      return new aic(aic.a.a, $$0.a());
   }

   public static aic b() {
      return new aic(aic.a.b, null);
   }

   private aic(wl $$0) {
      this.b = $$0.b(aic.a.class);
      if (this.b == aic.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      if (this.b == aic.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zu<aic> a() {
      return agq.bQ;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public aic.a e() {
      return this.b;
   }

   @Nullable
   public alb f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
