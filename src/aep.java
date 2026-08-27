import java.util.Objects;
import javax.annotation.Nullable;

public class aep implements zb<abm> {
   public static final ys<vu, aep> a = zb.a(aep::a, aep::new);
   private final euk b;
   private final String c;

   public aep(euk $$0, @Nullable eul $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aep(vu $$0) {
      this.b = $$0.a(euk.u);
      this.c = $$0.p();
   }

   private void a(vu $$0) {
      $$0.a(euk::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<aep> a() {
      return afx.aB;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public euk b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}
