import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ejv(ejy b, ejy c) implements ejy {
   public static final Codec<ejv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejz.a.fieldOf("n").forGetter(ejv::c), ejz.a.fieldOf("p").forGetter(ejv::d)).apply($$0, ejv::new)
   );

   @Override
   public ejx b() {
      return ejz.d;
   }

   @Override
   public int a(ege $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      auf $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ege $$0) {
      return (float)this.a($$0);
   }

   public static ejv a(int $$0, float $$1) {
      return new ejv(ejw.a((float)$$0), ejw.a($$1));
   }

   @Override
   public Set<eim<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ejy c() {
      return this.b;
   }

   public ejy d() {
      return this.c;
   }
}
