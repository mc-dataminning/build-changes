import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class faj extends fau {
   public static final MapCodec<faj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(faj.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, faj::new)
   );
   private final faj.a b;

   private faj(List<fcq> $$0, faj.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public faw<faj> b() {
      return fax.s;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if ($$1.c(this.b.g) instanceof bug $$3) {
         $$0.b(kj.g, $$3.an());
      }

      return $$0;
   }

   public static fau.a<?> a(faj.a $$0) {
      return a($$1 -> new faj($$1, $$0));
   }

   public static enum a implements bak {
      a("this", fcb.a),
      b("attacking_entity", fcb.d),
      c("last_damage_player", fcb.b),
      d("block_entity", fcb.h);

      public static final Codec<faj.a> e = bak.a(faj.a::values);
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
