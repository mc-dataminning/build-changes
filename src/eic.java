import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eic(eif b, eif c) implements eif {
   public static final Codec<eic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eig.a.fieldOf("n").forGetter(eic::c), eig.a.fieldOf("p").forGetter(eic::d)).apply($$0, eic::new)
   );

   @Override
   public eie b() {
      return eig.d;
   }

   @Override
   public int a(eel $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ato $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eel $$0) {
      return (float)this.a($$0);
   }

   public static eic a(int $$0, float $$1) {
      return new eic(eid.a((float)$$0), eid.a($$1));
   }

   @Override
   public Set<egt<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eif c() {
      return this.b;
   }

   public eif d() {
      return this.c;
   }
}
