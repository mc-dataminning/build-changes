import javax.annotation.Nullable;

public record aei(String b, @Nullable String c) implements zc<abr> {
   public static final yt<vr, aei> a = zc.a(aei::a, aei::new);

   private aei(vr $$0) {
      this($$0.p(), $$0.c(vr::p));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vr::a);
   }

   @Override
   public ze<aei> a() {
      return agk.cp;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
