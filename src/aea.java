import javax.annotation.Nullable;

public record aea(String b, @Nullable String c) implements zb<abn> {
   public static final ys<vr, aea> a = zb.a(aea::a, aea::new);

   private aea(vr $$0) {
      this($$0.p(), $$0.c(vr::p));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vr::a);
   }

   @Override
   public zd<aea> a() {
      return afz.ce;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
