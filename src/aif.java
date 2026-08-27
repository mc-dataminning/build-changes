import java.util.UUID;
import javax.annotation.Nullable;

public class aif implements zl<agl> {
   public static final zc<we, aif> a = zl.a(aif::a, aif::new);
   private final UUID b;

   public aif(UUID $$0) {
      this.b = $$0;
   }

   private aif(we $$0) {
      this.b = $$0.n();
   }

   private void a(we $$0) {
      $$0.a(this.b);
   }

   @Override
   public zn<aif> a() {
      return agj.cb;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   @Nullable
   public brv a(aqt $$0) {
      return $$0.a(this.b);
   }
}
