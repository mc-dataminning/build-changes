import com.mojang.serialization.MapCodec;

public class enf extends emy {
   public static final MapCodec<enf> b = dzo.a.fieldOf("state").xmap(dzn.a::b, dlu::m).xmap(enf::new, $$0 -> $$0.c);
   private final dlu c;

   public enf(dlu $$0) {
      this.c = $$0;
   }

   @Override
   protected emz<?> a() {
      return emz.f;
   }

   @Override
   public dzo a(azt $$0, iu $$1) {
      ja.a $$2 = ja.a.a($$0);
      return this.c.m().c(dsl.d, $$2);
   }
}
