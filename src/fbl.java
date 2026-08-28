import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbl extends fbw {
   public static final MapCodec<fbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(fbl.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, fbl::new)
   );
   private final fbl.a b;

   private fbl(List<fds> $$0, fbl.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fby<fbl> b() {
      return fbz.s;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if ($$1.c(this.b.g) instanceof buw $$3) {
         $$0.b(kl.g, $$3.ak());
      }

      return $$0;
   }

   public static fbw.a<?> a(fbl.a $$0) {
      return a($$1 -> new fbl($$1, $$0));
   }

   public static enum a implements bao {
      a("this", fdd.a),
      b("attacking_entity", fdd.d),
      c("last_damage_player", fdd.b),
      d("block_entity", fdd.h);

      public static final Codec<fbl.a> e = bao.a(fbl.a::values);
      private final String f;
      final bbb<?> g;

      private a(final String $$0, final bbb<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
