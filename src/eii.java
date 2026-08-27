import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eii(eif b, eif c) implements eif {
   public static final Codec<eii> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eig.a.fieldOf("min").forGetter(eii::c), eig.a.fieldOf("max").forGetter(eii::d)).apply($$0, eii::new)
   );

   @Override
   public eie b() {
      return eig.c;
   }

   public static eii a(float $$0, float $$1) {
      return new eii(eid.a($$0), eid.a($$1));
   }

   @Override
   public int a(eel $$0) {
      return ati.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eel $$0) {
      return ati.a($$0.b(), this.b.b($$0), this.c.b($$0));
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
