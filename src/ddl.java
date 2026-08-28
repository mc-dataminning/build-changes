import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddl(jv<bto> d, ddg e, ddg f, ddg g, ddg h) implements ddq {
   public static final MapCodec<ddl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.W).fieldOf("to_apply").forGetter(ddl::b),
               ddg.b.fieldOf("min_duration").forGetter(ddl::c),
               ddg.b.fieldOf("max_duration").forGetter(ddl::d),
               ddg.b.fieldOf("min_amplifier").forGetter(ddl::e),
               ddg.b.fieldOf("max_amplifier").forGetter(ddl::f)
            )
            .apply($$0, ddl::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcy $$2, bul $$3, fba $$4) {
      if ($$3 instanceof bvh $$5) {
         azh $$6 = $$5.dY();
         Optional<jr<bto>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(ayz.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(ayz.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new btq($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public jv<bto> b() {
      return this.d;
   }

   public ddg c() {
      return this.e;
   }

   public ddg d() {
      return this.f;
   }

   public ddg e() {
      return this.g;
   }

   public ddg f() {
      return this.h;
   }
}
