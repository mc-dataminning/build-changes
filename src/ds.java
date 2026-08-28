import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ds extends dy<ds.a> {
   @Override
   public Codec<ds.a> a() {
      return ds.a.a;
   }

   public void a(asi $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bh> b) implements dy.a {
      public static final Codec<ds.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(ds.a::a)).apply($$0, ds.a::new));

      public static ap<ds.a> a(dh.a $$0) {
         return ao.q.a(new ds.a(Optional.of(bw.a(bw.a.a().a($$0)))));
      }

      public static ap<ds.a> a(bw.a $$0) {
         return ao.q.a(new ds.a(Optional.of(bw.a($$0.b()))));
      }

      public static ap<ds.a> a(Optional<bw> $$0) {
         return ao.q.a(new ds.a(bw.a($$0)));
      }

      public static ap<ds.a> b() {
         return ao.r.a(new ds.a(Optional.empty()));
      }

      public static ap<ds.a> c() {
         return ao.I.a(new ds.a(Optional.empty()));
      }

      public static ap<ds.a> d() {
         return ao.ab.a(new ds.a(Optional.empty()));
      }

      public static ap<ds.a> e() {
         return ao.x.a(new ds.a(Optional.empty()));
      }

      public static ap<ds.a> a(jr<dke> $$0, jr<cxg> $$1, dke $$2, cxg $$3) {
         return a(bw.a.a().a(bt.a.a().d(cu.a.a().a($$1, $$3))).b(dh.a.a().a(ax.a.a().a($$0, $$2))));
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
