import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddj(jv<btm> d, dde e, dde f, dde g, dde h) implements ddo {
   public static final MapCodec<ddj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.W).fieldOf("to_apply").forGetter(ddj::b),
               dde.b.fieldOf("min_duration").forGetter(ddj::c),
               dde.b.fieldOf("max_duration").forGetter(ddj::d),
               dde.b.fieldOf("min_amplifier").forGetter(ddj::e),
               dde.b.fieldOf("max_amplifier").forGetter(ddj::f)
            )
            .apply($$0, ddj::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      if ($$3 instanceof bvf $$5) {
         azg $$6 = $$5.dZ();
         Optional<jr<btm>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(ayy.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(ayy.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bto($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   public jv<btm> b() {
      return this.d;
   }

   public dde c() {
      return this.e;
   }

   public dde d() {
      return this.f;
   }

   public dde e() {
      return this.g;
   }

   public dde f() {
      return this.h;
   }
}
