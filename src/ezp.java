import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ezp extends faa {
   public static final MapCodec<ezp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ezp.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ezp::new)
   );
   private final ezp.a b;

   private ezp(List<fbw> $$0, ezp.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fac<ezp> b() {
      return fad.s;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if ($$1.c(this.b.g) instanceof bub $$3) {
         $$0.b(kj.g, $$3.an());
      }

      return $$0;
   }

   public static faa.a<?> a(ezp.a $$0) {
      return a($$1 -> new ezp($$1, $$0));
   }

   public static enum a implements bai {
      a("this", fbh.a),
      b("attacking_entity", fbh.d),
      c("last_damage_player", fbh.b),
      d("block_entity", fbh.h);

      public static final Codec<ezp.a> e = bai.a(ezp.a::values);
      private final String f;
      final bav<?> g;

      private a(final String $$0, final bav<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
