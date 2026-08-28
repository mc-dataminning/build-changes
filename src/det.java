import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record det(jw<buu> d, deo e, deo f, deo g, deo h) implements dey {
   public static final MapCodec<det> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kh.a(me.W).fieldOf("to_apply").forGetter(det::b),
               deo.b.fieldOf("min_duration").forGetter(det::c),
               deo.b.fieldOf("max_duration").forGetter(det::d),
               deo.b.fieldOf("min_amplifier").forGetter(det::e),
               deo.b.fieldOf("max_amplifier").forGetter(det::f)
            )
            .apply($$0, det::new)
   );

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      if ($$3 instanceof bwr $$5) {
         azs $$6 = $$5.dY();
         Optional<js<buu>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azk.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azk.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new buw($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public jw<buu> b() {
      return this.d;
   }

   public deo c() {
      return this.e;
   }

   public deo d() {
      return this.f;
   }

   public deo e() {
      return this.g;
   }

   public deo f() {
      return this.h;
   }
}
