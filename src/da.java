import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class da extends de<da.a> {
   @Override
   public Codec<da.a> a() {
      return da.a.a;
   }

   public void a(aqi $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bc> b) implements de.a {
      public static final Codec<da.a> a = RecordCodecBuilder.create($$0 -> $$0.group(axh.a(br.b, "player").forGetter(da.a::a)).apply($$0, da.a::new));

      public static an<da.a> a(cr.a $$0) {
         return am.q.a(new da.a(Optional.of(br.a(br.a.a().a($$0)))));
      }

      public static an<da.a> a(br.a $$0) {
         return am.q.a(new da.a(Optional.of(br.a($$0.b()))));
      }

      public static an<da.a> a(Optional<br> $$0) {
         return am.q.a(new da.a(br.a($$0)));
      }

      public static an<da.a> b() {
         return am.r.a(new da.a(Optional.empty()));
      }

      public static an<da.a> c() {
         return am.I.a(new da.a(Optional.empty()));
      }

      public static an<da.a> d() {
         return am.ab.a(new da.a(Optional.empty()));
      }

      public static an<da.a> e() {
         return am.x.a(new da.a(Optional.empty()));
      }

      public static an<da.a> a(dde $$0, csu $$1) {
         return a(br.a.a().a(bo.a.a().d(ch.a.a().a($$1))).b(cr.a.a().a(av.a.a().a($$0))));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
