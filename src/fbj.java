import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbj extends fbu {
   public static final MapCodec<fbj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(fbj.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, fbj::new)
   );
   private final fbj.a b;

   private fbj(List<fdq> $$0, fbj.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbw<fbj> b() {
      return fbx.s;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if ($$1.c(this.b.g) instanceof buu $$3) {
         $$0.b(kk.g, $$3.ak());
      }

      return $$0;
   }

   public static fbu.a<?> a(fbj.a $$0) {
      return a($$1 -> new fbj($$1, $$0));
   }

   public static enum a implements bam {
      a("this", fdb.a),
      b("attacking_entity", fdb.d),
      c("last_damage_player", fdb.b),
      d("block_entity", fdb.h);

      public static final Codec<fbj.a> e = bam.a(fbj.a::values);
      private final String f;
      final baz<?> g;

      private a(final String $$0, final baz<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
