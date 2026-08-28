import javax.annotation.Nullable;

public record aes(String b, @Nullable String c) implements zp<ace> {
   public static final zg<wf, aes> a = zp.a(aes::a, aes::new);

   private aes(wf $$0) {
      this($$0.p(), $$0.c(wf::p));
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wf::a);
   }

   @Override
   public zr<aes> a() {
      return agt.ch;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
