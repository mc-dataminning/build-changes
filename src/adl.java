import java.util.Objects;
import javax.annotation.Nullable;

public class adl implements xz<aai> {
   public static final xq<us, adl> a = xz.a(adl::a, adl::new);
   private final epq b;
   private final String c;

   public adl(epq $$0, @Nullable epr $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private adl(us $$0) {
      this.b = $$0.a(epq.u);
      this.c = $$0.p();
   }

   private void a(us $$0) {
      $$0.a(epq::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public yb<adl> a() {
      return aet.aB;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public epq b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}
