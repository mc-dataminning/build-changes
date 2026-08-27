import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cz extends dd<cz.a> {
   @Override
   public Codec<cz.a> a() {
      return cz.a.a;
   }

   public void a(aqf $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bc> b) implements dd.a {
      public static final Codec<cz.a> a = RecordCodecBuilder.create($$0 -> $$0.group(axe.a(br.b, "player").forGetter(cz.a::a)).apply($$0, cz.a::new));

      public static an<cz.a> a(cq.a $$0) {
         return am.q.a(new cz.a(Optional.of(br.a(br.a.a().a($$0)))));
      }

      public static an<cz.a> a(br.a $$0) {
         return am.q.a(new cz.a(Optional.of(br.a($$0.b()))));
      }

      public static an<cz.a> a(Optional<br> $$0) {
         return am.q.a(new cz.a(br.a($$0)));
      }

      public static an<cz.a> b() {
         return am.r.a(new cz.a(Optional.empty()));
      }

      public static an<cz.a> c() {
         return am.I.a(new cz.a(Optional.empty()));
      }

      public static an<cz.a> d() {
         return am.ab.a(new cz.a(Optional.empty()));
      }

      public static an<cz.a> e() {
         return am.x.a(new cz.a(Optional.empty()));
      }

      public static an<cz.a> a(dcv $$0, cry $$1) {
         return a(br.a.a().a(bo.a.a().d(cg.a.a().a($$1))).b(cq.a.a().a(av.a.a().a($$0))));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
