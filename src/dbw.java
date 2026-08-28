import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbw(jr<bst> d, dbr e, dbr f, dbr g, dbr h) implements dcb {
   public static final MapCodec<dbw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a(lv.W).fieldOf("to_apply").forGetter(dbw::b),
               dbr.b.fieldOf("min_duration").forGetter(dbw::c),
               dbr.b.fieldOf("max_duration").forGetter(dbw::d),
               dbr.b.fieldOf("min_amplifier").forGetter(dbw::e),
               dbr.b.fieldOf("max_amplifier").forGetter(dbw::f)
            )
            .apply($$0, dbw::new)
   );

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      if ($$3 instanceof buk $$5) {
         azl $$6 = $$5.dV();
         Optional<jn<bst>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azd.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azd.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bsv($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   public jr<bst> b() {
      return this.d;
   }

   public dbr c() {
      return this.e;
   }

   public dbr d() {
      return this.f;
   }

   public dbr e() {
      return this.g;
   }

   public dbr f() {
      return this.h;
   }
}
