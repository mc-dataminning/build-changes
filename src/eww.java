import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eww(exa b, exa c) implements exa {
   public static final MapCodec<eww> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exb.a.fieldOf("n").forGetter(eww::c), exb.a.fieldOf("p").forGetter(eww::d)).apply($$0, eww::new)
   );

   @Override
   public ewz b() {
      return exb.d;
   }

   @Override
   public int a(est $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azk $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(est $$0) {
      return (float)this.a($$0);
   }

   public static eww a(int $$0, float $$1) {
      return new eww(ewx.a((float)$$0), ewx.a($$1));
   }

   @Override
   public Set<evm<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public exa c() {
      return this.b;
   }

   public exa d() {
      return this.c;
   }
}
