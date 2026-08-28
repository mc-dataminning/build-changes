import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dci(ju<btl> d, dcd e, dcd f, dcd g, dcd h) implements dcn {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(ma.W).fieldOf("to_apply").forGetter(dci::b),
               dcd.b.fieldOf("min_duration").forGetter(dci::c),
               dcd.b.fieldOf("max_duration").forGetter(dci::d),
               dcd.b.fieldOf("min_amplifier").forGetter(dci::e),
               dcd.b.fieldOf("max_amplifier").forGetter(dci::f)
            )
            .apply($$0, dci::new)
   );

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      if ($$3 instanceof bve $$5) {
         azv $$6 = $$5.eb();
         Optional<jq<btl>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azn.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azn.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new btn($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   public ju<btl> b() {
      return this.d;
   }

   public dcd c() {
      return this.e;
   }

   public dcd d() {
      return this.f;
   }

   public dcd e() {
      return this.g;
   }

   public dcd f() {
      return this.h;
   }
}
