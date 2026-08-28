import javax.annotation.Nullable;

public class afk implements zs<ace> {
   public static final zj<wl, afk> a = zs.a(afk::a, afk::new);
   private final int b;
   private final int c;

   public afk(bsp $$0, @Nullable bsp $$1) {
      this.b = $$0.al();
      this.c = $$1 != null ? $$1.al() : 0;
   }

   private afk(wl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(wl $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zu<afk> a() {
      return agq.aD;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
