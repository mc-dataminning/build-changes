import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record erz(esc b, esc c) implements esc {
   public static final Codec<erz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esd.a.fieldOf("n").forGetter(erz::c), esd.a.fieldOf("p").forGetter(erz::d)).apply($$0, erz::new)
   );

   @Override
   public esb b() {
      return esd.d;
   }

   @Override
   public int a(eoa $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ayd $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eoa $$0) {
      return (float)this.a($$0);
   }

   public static erz a(int $$0, float $$1) {
      return new erz(esa.a((float)$$0), esa.a($$1));
   }

   @Override
   public Set<eqq<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public esc c() {
      return this.b;
   }

   public esc d() {
      return this.c;
   }
}
