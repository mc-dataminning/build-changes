import java.util.Objects;
import javax.annotation.Nullable;

public class afk implements zq<acf> {
   public static final zh<wg, afk> a = zq.a(afk::a, afk::new);
   private final fau b;
   private final String c;

   public afk(fau $$0, @Nullable fav $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afk(wg $$0) {
      this.b = $$0.a(fau.u);
      this.c = $$0.p();
   }

   private void a(wg $$0) {
      $$0.a(fau::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zs<afk> a() {
      return agu.aB;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public fau b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}
