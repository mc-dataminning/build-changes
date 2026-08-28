import java.util.Optional;

public record ahu(Optional<jm<brx>> b, Optional<jm<brx>> c) implements zg<agi> {
   public static final yx<wk, ahu> a = yx.a(brx.b.a(yv::a), ahu::b, brx.b.a(yv::a), ahu::e, ahu::new);

   @Override
   public zi<ahu> a() {
      return agg.bS;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public Optional<jm<brx>> e() {
      return this.c;
   }
}
