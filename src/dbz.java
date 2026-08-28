import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbz(js<bsw> d, dbu e, dbu f, dbu g, dbu h) implements dce {
   public static final MapCodec<dbz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kd.a(lw.W).fieldOf("to_apply").forGetter(dbz::b),
               dbu.b.fieldOf("min_duration").forGetter(dbz::c),
               dbu.b.fieldOf("max_duration").forGetter(dbz::d),
               dbu.b.fieldOf("min_amplifier").forGetter(dbz::e),
               dbu.b.fieldOf("max_amplifier").forGetter(dbz::f)
            )
            .apply($$0, dbz::new)
   );

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      if ($$3 instanceof bun $$5) {
         azn $$6 = $$5.dV();
         Optional<jo<bsw>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azf.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azf.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bsy($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public js<bsw> b() {
      return this.d;
   }

   public dbu c() {
      return this.e;
   }

   public dbu d() {
      return this.f;
   }

   public dbu e() {
      return this.g;
   }

   public dbu f() {
      return this.h;
   }
}
