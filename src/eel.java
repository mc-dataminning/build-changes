import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eel extends eeu {
   public static final Codec<eel> a = RecordCodecBuilder.create($$0 -> a($$0).and(eel.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eel::new));
   private final eel.a b;

   private eel(List<egh> $$0, eel.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eew b() {
      return eex.o;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      if ($$1.c(this.b.g) instanceof bif $$3 && $$3.ac()) {
         $$0.a($$3.O_());
      }

      return $$0;
   }

   public static eeu.a<?> a(eel.a $$0) {
      return a($$1 -> new eel($$1, $$0));
   }

   public static enum a implements atr {
      a("this", eft.a),
      b("killer", eft.d),
      c("killer_player", eft.b),
      d("block_entity", eft.h);

      public static final Codec<eel.a> e = atr.a(eel.a::values);
      private final String f;
      final efq<?> g;

      private a(String $$0, efq<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
