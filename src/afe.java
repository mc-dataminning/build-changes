import java.util.Objects;
import javax.annotation.Nullable;

public class afe implements zk<abz> {
   public static final zb<wa, afe> a = zk.a(afe::a, afe::new);
   private final ezo b;
   private final String c;

   public afe(ezo $$0, @Nullable ezp $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afe(wa $$0) {
      this.b = $$0.a(ezo.u);
      this.c = $$0.p();
   }

   private void a(wa $$0) {
      $$0.a(ezo::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zm<afe> a() {
      return ago.aB;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public ezo b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}
