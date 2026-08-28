import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dt extends dz<dt.a> {
   @Override
   public Codec<dt.a> a() {
      return dt.a.a;
   }

   public void a(are $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bi> b) implements dz.a {
      public static final Codec<dt.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dt.a::a)).apply($$0, dt.a::new));

      public static aq<dt.a> a(di.a $$0) {
         return ap.q.a(new dt.a(Optional.of(bx.a(bx.a.a().a($$0)))));
      }

      public static aq<dt.a> a(bx.a $$0) {
         return ap.q.a(new dt.a(Optional.of(bx.a($$0.b()))));
      }

      public static aq<dt.a> a(Optional<bx> $$0) {
         return ap.q.a(new dt.a(bx.a($$0)));
      }

      public static aq<dt.a> b() {
         return ap.r.a(new dt.a(Optional.empty()));
      }

      public static aq<dt.a> c() {
         return ap.I.a(new dt.a(Optional.empty()));
      }

      public static aq<dt.a> d() {
         return ap.ab.a(new dt.a(Optional.empty()));
      }

      public static aq<dt.a> e() {
         return ap.x.a(new dt.a(Optional.empty()));
      }

      public static aq<dt.a> a(js<djn> $$0, js<cwm> $$1, djn $$2, cwm $$3) {
         return a(bx.a.a().a(bu.a.a().d(cv.a.a().a($$1, $$3))).b(di.a.a().a(ay.a.a().a($$0, $$2))));
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
