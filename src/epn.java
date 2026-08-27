import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epn extends epw {
   public static final Codec<epn> a = RecordCodecBuilder.create($$0 -> a($$0).and(epn.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, epn::new));
   private final epn.a b;

   private epn(List<erq> $$0, epn.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epy b() {
      return epz.r;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      if ($$1.c(this.b.g) instanceof bpr $$3) {
         $$0.b(ka.f, $$3.af());
      }

      return $$0;
   }

   public static epw.a<?> a(epn.a $$0) {
      return a($$1 -> new epn($$1, $$0));
   }

   public static enum a implements ayt {
      a("this", erc.a),
      b("killer", erc.d),
      c("killer_player", erc.b),
      d("block_entity", erc.h);

      public static final Codec<epn.a> e = ayt.a(epn.a::values);
      private final String f;
      final eqz<?> g;

      private a(String $$0, eqz<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
