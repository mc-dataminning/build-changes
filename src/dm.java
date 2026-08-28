import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dm extends ds<dm.a> {
   @Override
   public Codec<dm.a> a() {
      return dm.a.a;
   }

   public void a(aqn $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bf> b) implements ds.a {
      public static final Codec<dm.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dm.a::a)).apply($$0, dm.a::new));

      public static an<dm.a> a(dc.a $$0) {
         return am.q.a(new dm.a(Optional.of(bu.a(bu.a.a().a($$0)))));
      }

      public static an<dm.a> a(bu.a $$0) {
         return am.q.a(new dm.a(Optional.of(bu.a($$0.b()))));
      }

      public static an<dm.a> a(Optional<bu> $$0) {
         return am.q.a(new dm.a(bu.a($$0)));
      }

      public static an<dm.a> b() {
         return am.r.a(new dm.a(Optional.empty()));
      }

      public static an<dm.a> c() {
         return am.I.a(new dm.a(Optional.empty()));
      }

      public static an<dm.a> d() {
         return am.ab.a(new dm.a(Optional.empty()));
      }

      public static an<dm.a> e() {
         return am.x.a(new dm.a(Optional.empty()));
      }

      public static an<dm.a> a(dfi $$0, cty $$1) {
         return a(bu.a.a().a(br.a.a().d(cp.a.a().a($$1))).b(dc.a.a().a(av.a.a().a($$0))));
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
