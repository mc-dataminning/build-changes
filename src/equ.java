import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record equ(eqx b, eqx c) implements eqx {
   public static final Codec<equ> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqy.a.fieldOf("n").forGetter(equ::c), eqy.a.fieldOf("p").forGetter(equ::d)).apply($$0, equ::new)
   );

   @Override
   public eqw b() {
      return eqy.d;
   }

   @Override
   public int a(enb $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      axr $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(enb $$0) {
      return (float)this.a($$0);
   }

   public static equ a(int $$0, float $$1) {
      return new equ(eqv.a((float)$$0), eqv.a($$1));
   }

   @Override
   public Set<epl<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eqx c() {
      return this.b;
   }

   public eqx d() {
      return this.c;
   }
}
