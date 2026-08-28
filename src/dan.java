import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dan(jq<brx> d, daj e, daj f, daj g, daj h) implements das {
   public static final MapCodec<dan> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.a(lu.W).fieldOf("to_apply").forGetter(dan::b),
               daj.b.fieldOf("min_duration").forGetter(dan::c),
               daj.b.fieldOf("max_duration").forGetter(dan::d),
               daj.b.fieldOf("min_amplifier").forGetter(dan::e),
               daj.b.fieldOf("max_amplifier").forGetter(dan::f)
            )
            .apply($$0, dan::new)
   );

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4) {
      if ($$3 instanceof btn $$5) {
         ayw $$6 = $$5.dR();
         Optional<jm<brx>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(ayo.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(ayo.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.b(new brz($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dan> a() {
      return a;
   }

   public jq<brx> b() {
      return this.d;
   }

   public daj c() {
      return this.e;
   }

   public daj d() {
      return this.f;
   }

   public daj e() {
      return this.g;
   }

   public daj f() {
      return this.h;
   }
}
