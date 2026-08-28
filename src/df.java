import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class df extends dl<df.a> {
   @Override
   public Codec<df.a> a() {
      return df.a.a;
   }

   public void a(arv $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bj> b) implements dl.a {
      public static final Codec<df.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(df.a::a)).apply($$0, df.a::new));

      public static ar<df.a> a(cv.a $$0) {
         return aq.q.a(new df.a(Optional.of(bz.a(bz.a.a().a($$0)))));
      }

      public static ar<df.a> a(bz.a $$0) {
         return aq.q.a(new df.a(Optional.of(bz.a($$0.b()))));
      }

      public static ar<df.a> a(Optional<bz> $$0) {
         return aq.q.a(new df.a(bz.a($$0)));
      }

      public static ar<df.a> b() {
         return aq.r.a(new df.a(Optional.empty()));
      }

      public static ar<df.a> c() {
         return aq.I.a(new df.a(Optional.empty()));
      }

      public static ar<df.a> d() {
         return aq.ab.a(new df.a(Optional.empty()));
      }

      public static ar<df.a> e() {
         return aq.x.a(new df.a(Optional.empty()));
      }

      public static ar<df.a> a(jh<dne> $$0, jh<czw> $$1, dne $$2, czw $$3) {
         return a(bz.a.a().a(bw.a.a().d(cn.a.a().a($$1, $$3))).b(cv.a.a().a(az.a.a().a($$0, $$2))));
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
