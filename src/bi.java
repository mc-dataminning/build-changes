import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bi extends dl<bi.a> {
   @Override
   public Codec<bi.a> a() {
      return bi.a.a;
   }

   public void a(arv $$0, daa $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cn> c) implements dl.a {
      public static final Codec<bi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(bi.a::a), cn.a.optionalFieldOf("item").forGetter(bi.a::c)).apply($$0, bi.a::new)
      );

      public static ar<bi.a> b() {
         return aq.A.a(new bi.a(Optional.empty(), Optional.empty()));
      }

      public static ar<bi.a> a(jh<czw> $$0, djy $$1) {
         return a(cn.a.a().a($$0, $$1.h()));
      }

      public static ar<bi.a> a(cn.a $$0) {
         return aq.A.a(new bi.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(daa $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
