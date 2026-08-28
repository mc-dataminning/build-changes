import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddk(jv<btn> d, ddf e, ddf f, ddf g, ddf h) implements ddp {
   public static final MapCodec<ddk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.W).fieldOf("to_apply").forGetter(ddk::b),
               ddf.b.fieldOf("min_duration").forGetter(ddk::c),
               ddf.b.fieldOf("max_duration").forGetter(ddk::d),
               ddf.b.fieldOf("min_amplifier").forGetter(ddk::e),
               ddf.b.fieldOf("max_amplifier").forGetter(ddk::f)
            )
            .apply($$0, ddk::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      if ($$3 instanceof bvg $$5) {
         azh $$6 = $$5.dY();
         Optional<jr<btn>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(ayz.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(ayz.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new btp($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   public jv<btn> b() {
      return this.d;
   }

   public ddf c() {
      return this.e;
   }

   public ddf d() {
      return this.f;
   }

   public ddf e() {
      return this.g;
   }

   public ddf f() {
      return this.h;
   }
}
