import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddm(jv<btp> d, ddh e, ddh f, ddh g, ddh h) implements ddr {
   public static final MapCodec<ddm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.W).fieldOf("to_apply").forGetter(ddm::b),
               ddh.b.fieldOf("min_duration").forGetter(ddm::c),
               ddh.b.fieldOf("max_duration").forGetter(ddm::d),
               ddh.b.fieldOf("min_amplifier").forGetter(ddm::e),
               ddh.b.fieldOf("max_amplifier").forGetter(ddm::f)
            )
            .apply($$0, ddm::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      if ($$3 instanceof bvi $$5) {
         azh $$6 = $$5.dY();
         Optional<jr<btp>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(ayz.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(ayz.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new btr($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   public jv<btp> b() {
      return this.d;
   }

   public ddh c() {
      return this.e;
   }

   public ddh d() {
      return this.f;
   }

   public ddh e() {
      return this.g;
   }

   public ddh f() {
      return this.h;
   }
}
