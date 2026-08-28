import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dai(czq d, czq e, ke f, Optional<dzg> g, efj h) implements czz {
   public static final MapCodec<dai> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czq.b.fieldOf("radius").forGetter(dai::b),
               czq.b.fieldOf("height").forGetter(dai::c),
               ke.f.optionalFieldOf("offset", ke.g).forGetter(dai::d),
               dzg.b.optionalFieldOf("predicate").forGetter(dai::e),
               efj.a.fieldOf("block_state").forGetter(dai::f)
            )
            .apply($$0, dai::new)
   );

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      ja $$5 = ja.a($$4).a(this.f);
      aym $$6 = $$3.dS();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (ja $$9 : ja.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.a($$4, (double)$$7) && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)) {
            $$0.b($$9, this.h.a($$6, $$9));
         }
      }
   }

   @Override
   public MapCodec<dai> a() {
      return a;
   }

   public czq b() {
      return this.d;
   }

   public czq c() {
      return this.e;
   }

   public ke d() {
      return this.f;
   }

   public Optional<dzg> e() {
      return this.g;
   }

   public efj f() {
      return this.h;
   }
}
