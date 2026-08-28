import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ded(jv<buc> d, ddy e, ddy f, ddy g, ddy h) implements dei {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.W).fieldOf("to_apply").forGetter(ded::b),
               ddy.b.fieldOf("min_duration").forGetter(ded::c),
               ddy.b.fieldOf("max_duration").forGetter(ded::d),
               ddy.b.fieldOf("min_amplifier").forGetter(ded::e),
               ddy.b.fieldOf("max_amplifier").forGetter(ded::f)
            )
            .apply($$0, ded::new)
   );

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      if ($$3 instanceof bvy $$5) {
         azh $$6 = $$5.dX();
         Optional<jr<buc>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(ayz.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(ayz.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bue($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public jv<buc> b() {
      return this.d;
   }

   public ddy c() {
      return this.e;
   }

   public ddy d() {
      return this.f;
   }

   public ddy e() {
      return this.g;
   }

   public ddy f() {
      return this.h;
   }
}
