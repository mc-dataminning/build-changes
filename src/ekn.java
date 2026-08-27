import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekn(ekq b, ekq c) implements ekq {
   public static final Codec<ekn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekr.a.fieldOf("n").forGetter(ekn::c), ekr.a.fieldOf("p").forGetter(ekn::d)).apply($$0, ekn::new)
   );

   @Override
   public ekp b() {
      return ekr.d;
   }

   @Override
   public int a(egw $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      auv $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(egw $$0) {
      return (float)this.a($$0);
   }

   public static ekn a(int $$0, float $$1) {
      return new ekn(eko.a((float)$$0), eko.a($$1));
   }

   @Override
   public Set<eje<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ekq c() {
      return this.b;
   }

   public ekq d() {
      return this.c;
   }
}
