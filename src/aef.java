import java.util.List;
import java.util.UUID;

public record aef(List<UUID> b) implements zk<abz> {
   public static final zb<wa, aef> a = zk.a(aef::a, aef::new);

   private aef(wa $$0) {
      this($$0.a(kh.g));
   }

   private void a(wa $$0) {
      $$0.a(this.b, kh.g);
   }

   @Override
   public zm<aef> a() {
      return ago.af;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }
}
