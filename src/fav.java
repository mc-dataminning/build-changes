import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fav extends fbg {
   public static final MapCodec<fav> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(fav.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, fav::new)
   );
   private final fav.a b;

   private fav(List<fdc> $$0, fav.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbi<fav> b() {
      return fbj.s;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if ($$1.c(this.b.g) instanceof buj $$3) {
         $$0.b(kk.g, $$3.ak());
      }

      return $$0;
   }

   public static fbg.a<?> a(fav.a $$0) {
      return a($$1 -> new fav($$1, $$0));
   }

   public static enum a implements bak {
      a("this", fcn.a),
      b("attacking_entity", fcn.d),
      c("last_damage_player", fcn.b),
      d("block_entity", fcn.h);

      public static final Codec<fav.a> e = bak.a(fav.a::values);
      private final String f;
      final bax<?> g;

      private a(final String $$0, final bax<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
