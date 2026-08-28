import javax.annotation.Nullable;

public record abp(ald b, @Nullable byte[] c) implements zc<abo> {
   public static final yt<vr, abp> a = zc.a(abp::a, abp::new);

   private abp(vr $$0) {
      this($$0.q(), $$0.c(zr.b));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zr.b);
   }

   @Override
   public ze<abp> a() {
      return abn.b;
   }

   public void a(abo $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
