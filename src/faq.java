import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class faq extends fbb {
   public static final MapCodec<faq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(faq.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, faq::new)
   );
   private final faq.a b;

   private faq(List<fcx> $$0, faq.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbd<faq> b() {
      return fbe.s;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if ($$1.c(this.b.g) instanceof buj $$3) {
         $$0.b(kk.g, $$3.ak());
      }

      return $$0;
   }

   public static fbb.a<?> a(faq.a $$0) {
      return a($$1 -> new faq($$1, $$0));
   }

   public static enum a implements bak {
      a("this", fci.a),
      b("attacking_entity", fci.d),
      c("last_damage_player", fci.b),
      d("block_entity", fci.h);

      public static final Codec<faq.a> e = bak.a(faq.a::values);
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
