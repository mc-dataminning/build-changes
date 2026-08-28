import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fab extends fam {
   public static final MapCodec<fab> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(fab.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, fab::new)
   );
   private final fab.a b;

   private fab(List<fci> $$0, fab.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fao<fab> b() {
      return fap.s;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if ($$1.c(this.b.g) instanceof bue $$3) {
         $$0.b(kj.g, $$3.an());
      }

      return $$0;
   }

   public static fam.a<?> a(fab.a $$0) {
      return a($$1 -> new fab($$1, $$0));
   }

   public static enum a implements bak {
      a("this", fbt.a),
      b("attacking_entity", fbt.d),
      c("last_damage_player", fbt.b),
      d("block_entity", fbt.h);

      public static final Codec<fab.a> e = bak.a(fab.a::values);
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
