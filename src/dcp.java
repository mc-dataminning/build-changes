import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcp(ju<bto> d, dck e, dck f, dck g, dck h) implements dcu {
   public static final MapCodec<dcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(ma.W).fieldOf("to_apply").forGetter(dcp::b),
               dck.b.fieldOf("min_duration").forGetter(dcp::c),
               dck.b.fieldOf("max_duration").forGetter(dcp::d),
               dck.b.fieldOf("min_amplifier").forGetter(dcp::e),
               dck.b.fieldOf("max_amplifier").forGetter(dcp::f)
            )
            .apply($$0, dcp::new)
   );

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      if ($$3 instanceof bvh $$5) {
         azu $$6 = $$5.dY();
         Optional<jq<bto>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azm.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azm.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new btq($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public ju<bto> b() {
      return this.d;
   }

   public dck c() {
      return this.e;
   }

   public dck d() {
      return this.f;
   }

   public dck e() {
      return this.g;
   }

   public dck f() {
      return this.h;
   }
}
