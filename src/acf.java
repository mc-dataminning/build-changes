import javax.annotation.Nullable;

public record acf(ale b, @Nullable byte[] c) implements zv<ace> {
   public static final zm<wl, acf> a = zv.a(acf::a, acf::new);

   private acf(wl $$0) {
      this($$0.q(), $$0.c(aai.b));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aai.b);
   }

   @Override
   public zx<acf> a() {
      return acd.b;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
