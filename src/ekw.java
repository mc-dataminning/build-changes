import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekw(ekz b, ekz c) implements ekz {
   public static final Codec<ekw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ela.a.fieldOf("n").forGetter(ekw::c), ela.a.fieldOf("p").forGetter(ekw::d)).apply($$0, ekw::new)
   );

   @Override
   public eky b() {
      return ela.d;
   }

   @Override
   public int a(ehf $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      auw $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ehf $$0) {
      return (float)this.a($$0);
   }

   public static ekw a(int $$0, float $$1) {
      return new ekw(ekx.a((float)$$0), ekx.a($$1));
   }

   @Override
   public Set<ejn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ekz c() {
      return this.b;
   }

   public ekz d() {
      return this.c;
   }
}
