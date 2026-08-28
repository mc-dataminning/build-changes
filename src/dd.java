import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dd extends dj<dd.a> {
   @Override
   public Codec<dd.a> a() {
      return dd.a.a;
   }

   public void a(arp $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bi> b) implements dj.a {
      public static final Codec<dd.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dd.a::a)).apply($$0, dd.a::new));

      public static aq<dd.a> a(ct.a $$0) {
         return ap.q.a(new dd.a(Optional.of(bx.a(bx.a.a().a($$0)))));
      }

      public static aq<dd.a> a(bx.a $$0) {
         return ap.q.a(new dd.a(Optional.of(bx.a($$0.b()))));
      }

      public static aq<dd.a> a(Optional<bx> $$0) {
         return ap.q.a(new dd.a(bx.a($$0)));
      }

      public static aq<dd.a> b() {
         return ap.r.a(new dd.a(Optional.empty()));
      }

      public static aq<dd.a> c() {
         return ap.I.a(new dd.a(Optional.empty()));
      }

      public static aq<dd.a> d() {
         return ap.ab.a(new dd.a(Optional.empty()));
      }

      public static aq<dd.a> e() {
         return ap.x.a(new dd.a(Optional.empty()));
      }

      public static aq<dd.a> a(jf<dlu> $$0, jf<cyo> $$1, dlu $$2, cyo $$3) {
         return a(bx.a.a().a(bu.a.a().d(cl.a.a().a($$1, $$3))).b(ct.a.a().a(ay.a.a().a($$0, $$2))));
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
