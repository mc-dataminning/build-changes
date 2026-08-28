import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcm(dbt d, dbt e, kk f, Optional<ecg> g, eik h, Optional<jp<eaa>> i) implements dcd {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbt.b.fieldOf("radius").forGetter(dcm::b),
               dbt.b.fieldOf("height").forGetter(dcm::c),
               kk.f.optionalFieldOf("offset", kk.g).forGetter(dcm::d),
               ecg.b.optionalFieldOf("predicate").forGetter(dcm::e),
               eik.a.fieldOf("block_state").forGetter(dcm::f),
               eaa.aj.optionalFieldOf("trigger_game_event").forGetter(dcm::g)
            )
            .apply($$0, dcm::new)
   );

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      jg $$5 = jg.a((jz)$$4).a(this.f);
      azr $$6 = $$3.ea();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jg $$9 : jg.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azj.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public dbt b() {
      return this.d;
   }

   public dbt c() {
      return this.e;
   }

   public kk d() {
      return this.f;
   }

   public Optional<ecg> e() {
      return this.g;
   }

   public eik f() {
      return this.h;
   }

   public Optional<jp<eaa>> g() {
      return this.i;
   }
}
