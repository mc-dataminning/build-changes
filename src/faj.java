import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record faj(fan b, fan c) implements fan {
   public static final MapCodec<faj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fao.a.fieldOf("n").forGetter(faj::c), fao.a.fieldOf("p").forGetter(faj::d)).apply($$0, faj::new)
   );

   @Override
   public fam b() {
      return fao.d;
   }

   @Override
   public int a(ewi $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      bac $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ewi $$0) {
      return (float)this.a($$0);
   }

   public static faj a(int $$0, float $$1) {
      return new faj(fak.a((float)$$0), fak.a($$1));
   }

   @Override
   public Set<bbd<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fan c() {
      return this.b;
   }

   public fan d() {
      return this.c;
   }
}
