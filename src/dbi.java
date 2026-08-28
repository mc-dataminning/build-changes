import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbi(jr<bso> d, dbd e, dbd f, dbd g, dbd h) implements dbn {
   public static final MapCodec<dbi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a(lv.W).fieldOf("to_apply").forGetter(dbi::b),
               dbd.b.fieldOf("min_duration").forGetter(dbi::c),
               dbd.b.fieldOf("max_duration").forGetter(dbi::d),
               dbd.b.fieldOf("min_amplifier").forGetter(dbi::e),
               dbd.b.fieldOf("max_amplifier").forGetter(dbi::f)
            )
            .apply($$0, dbi::new)
   );

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      if ($$3 instanceof buf $$5) {
         azk $$6 = $$5.dV();
         Optional<jn<bso>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azc.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azc.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.b(new bsq($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dbi> a() {
      return a;
   }

   public jr<bso> b() {
      return this.d;
   }

   public dbd c() {
      return this.e;
   }

   public dbd d() {
      return this.f;
   }

   public dbd e() {
      return this.g;
   }

   public dbd f() {
      return this.h;
   }
}
