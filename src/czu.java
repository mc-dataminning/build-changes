import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czu(jn<brj> d, czq e, czq f, czq g, czq h) implements czz {
   public static final MapCodec<czu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.a(lr.V).fieldOf("to_apply").forGetter(czu::b),
               czq.b.fieldOf("min_duration").forGetter(czu::c),
               czq.b.fieldOf("max_duration").forGetter(czu::d),
               czq.b.fieldOf("min_amplifier").forGetter(czu::e),
               czq.b.fieldOf("max_amplifier").forGetter(czu::f)
            )
            .apply($$0, czu::new)
   );

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      if ($$3 instanceof bsy $$5) {
         aym $$6 = $$5.dS();
         Optional<jj<brj>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(aye.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.min(0, Math.round(aye.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.b(new brl($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   public jn<brj> b() {
      return this.d;
   }

   public czq c() {
      return this.e;
   }

   public czq d() {
      return this.f;
   }

   public czq e() {
      return this.g;
   }

   public czq f() {
      return this.h;
   }
}
