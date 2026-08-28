import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class el extends dy<el.a> {
   @Override
   public Codec<el.a> a() {
      return el.a.a;
   }

   public void a(aro $$0, cwb $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bh> b, Optional<cu> c) implements dy.a {
      public static final Codec<el.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(el.a::a), cu.a.optionalFieldOf("item").forGetter(el.a::b)).apply($$0, el.a::new)
      );

      public static ap<el.a> a(cu $$0) {
         return ao.C.a(new el.a(Optional.empty(), Optional.of($$0)));
      }

      public static ap<el.a> a(jr<cvx> $$0, dfa $$1) {
         return ao.C.a(new el.a(Optional.empty(), Optional.of(cu.a.a().a($$0, $$1).b())));
      }

      public boolean a(cwb $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }
   }
}
