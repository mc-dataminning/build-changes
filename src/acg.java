import javax.annotation.Nullable;

public record acg(alf b, @Nullable byte[] c) implements zw<acf> {
   public static final zn<wm, acg> a = zw.a(acg::a, acg::new);

   private acg(wm $$0) {
      this($$0.q(), $$0.c(aaj.b));
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aaj.b);
   }

   @Override
   public zy<acg> a() {
      return ace.b;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
