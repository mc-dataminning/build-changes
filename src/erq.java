import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erq extends esb {
   public static final MapCodec<erq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(erq.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, erq::new)
   );
   private final erq.a b;

   private erq(List<etz> $$0, erq.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esd<erq> b() {
      return ese.s;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if ($$1.c(this.b.g) instanceof bqi $$3) {
         $$0.b(kn.g, $$3.ah());
      }

      return $$0;
   }

   public static esb.a<?> a(erq.a $$0) {
      return a($$1 -> new erq($$1, $$0));
   }

   public static enum a implements ayz {
      a("this", etk.a),
      b("attacking_entity", etk.d),
      c("last_damage_player", etk.b),
      d("block_entity", etk.h);

      public static final Codec<erq.a> e = ayz.a(erq.a::values);
      private final String f;
      final eth<?> g;

      private a(final String $$0, final eth<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
