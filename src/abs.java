import javax.annotation.Nullable;

public record abs(akr b, @Nullable byte[] c) implements zg<abr> {
   public static final yx<vw, abs> a = zg.a(abs::a, abs::new);

   private abs(vw $$0) {
      this($$0.q(), $$0.c(zv.b));
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zv.b);
   }

   @Override
   public zi<abs> a() {
      return abq.b;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
