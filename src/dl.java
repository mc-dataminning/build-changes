import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dl extends dr<dl.a> {
   @Override
   public Codec<dl.a> a() {
      return dl.a.a;
   }

   public void a(arg $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bf> b) implements dr.a {
      public static final Codec<dl.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dl.a::a)).apply($$0, dl.a::new));

      public static an<dl.a> a(dc.a $$0) {
         return am.q.a(new dl.a(Optional.of(bu.a(bu.a.a().a($$0)))));
      }

      public static an<dl.a> a(bu.a $$0) {
         return am.q.a(new dl.a(Optional.of(bu.a($$0.b()))));
      }

      public static an<dl.a> a(Optional<bu> $$0) {
         return am.q.a(new dl.a(bu.a($$0)));
      }

      public static an<dl.a> b() {
         return am.r.a(new dl.a(Optional.empty()));
      }

      public static an<dl.a> c() {
         return am.I.a(new dl.a(Optional.empty()));
      }

      public static an<dl.a> d() {
         return am.ab.a(new dl.a(Optional.empty()));
      }

      public static an<dl.a> e() {
         return am.x.a(new dl.a(Optional.empty()));
      }

      public static an<dl.a> a(dfa $$0, cul $$1) {
         return a(bu.a.a().a(br.a.a().d(cp.a.a().a($$1))).b(dc.a.a().a(av.a.a().a($$0))));
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
