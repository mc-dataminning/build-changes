import javax.annotation.Nullable;

public record aby(ale b, @Nullable byte[] c) implements zl<abx> {
   public static final zc<wb, aby> a = zl.a(aby::a, aby::new);

   private aby(wb $$0) {
      this($$0.q(), $$0.c(aaa.b));
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aaa.b);
   }

   @Override
   public zn<aby> a() {
      return abw.b;
   }

   public void a(abx $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
