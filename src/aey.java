import java.util.Objects;
import javax.annotation.Nullable;

public class aey implements zg<abu> {
   public static final yx<vw, aey> a = zg.a(aey::a, aey::new);
   private final exx b;
   private final String c;

   public aey(exx $$0, @Nullable exy $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aey(vw $$0) {
      this.b = $$0.a(exx.u);
      this.c = $$0.p();
   }

   private void a(vw $$0) {
      $$0.a(exx::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<aey> a() {
      return agg.aB;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public exx b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}
