import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exk extends exv {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(exk.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, exk::new)
   );
   private final exk.a b;

   private exk(List<ezr> $$0, exk.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exx<exk> b() {
      return exy.s;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if ($$1.c(this.b.g) instanceof btd $$3) {
         $$0.b(ku.g, $$3.an());
      }

      return $$0;
   }

   public static exv.a<?> a(exk.a $$0) {
      return a($$1 -> new exk($$1, $$0));
   }

   public static enum a implements baq {
      a("this", ezc.a),
      b("attacking_entity", ezc.d),
      c("last_damage_player", ezc.b),
      d("block_entity", ezc.h);

      public static final Codec<exk.a> e = baq.a(exk.a::values);
      private final String f;
      final bbd<?> g;

      private a(final String $$0, final bbd<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
