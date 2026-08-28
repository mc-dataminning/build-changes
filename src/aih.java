import java.util.Optional;

public record aih(Optional<ji<brz>> b, Optional<ji<brz>> c) implements zv<agv> {
   public static final zm<wz, aih> a = zm.a(zk.b(lq.R).a(zk::a), aih::b, zk.b(lq.R).a(zk::a), aih::e, aih::new);

   @Override
   public zx<aih> a() {
      return agt.bS;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public Optional<ji<brz>> e() {
      return this.c;
   }
}
