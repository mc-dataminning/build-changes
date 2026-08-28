import java.util.Optional;

public record aie(Optional<ji<brv>> b, Optional<ji<brv>> c) implements zs<ags> {
   public static final zj<ww, aie> a = zj.a(zh.b(lq.R).a(zh::a), aie::b, zh.b(lq.R).a(zh::a), aie::e, aie::new);

   @Override
   public zu<aie> a() {
      return agq.bS;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public Optional<ji<brv>> e() {
      return this.c;
   }
}
