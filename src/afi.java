import java.util.Objects;
import javax.annotation.Nullable;

public class afi implements zo<acd> {
   public static final zf<we, afi> a = zo.a(afi::a, afi::new);
   private final fad b;
   private final String c;

   public afi(fad $$0, @Nullable fae $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afi(we $$0) {
      this.b = $$0.a(fad.u);
      this.c = $$0.p();
   }

   private void a(we $$0) {
      $$0.a(fad::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<afi> a() {
      return ags.aB;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public fad b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}
