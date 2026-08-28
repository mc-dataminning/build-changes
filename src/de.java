import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class de extends dk<de.a> {
   @Override
   public Codec<de.a> a() {
      return de.a.a;
   }

   public void a(art $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bj> b) implements dk.a {
      public static final Codec<de.a> a = RecordCodecBuilder.create($$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(de.a::a)).apply($$0, de.a::new));

      public static ar<de.a> a(cu.a $$0) {
         return aq.q.a(new de.a(Optional.of(by.a(by.a.a().a($$0)))));
      }

      public static ar<de.a> a(by.a $$0) {
         return aq.q.a(new de.a(Optional.of(by.a($$0.b()))));
      }

      public static ar<de.a> a(Optional<by> $$0) {
         return aq.q.a(new de.a(by.a($$0)));
      }

      public static ar<de.a> b() {
         return aq.r.a(new de.a(Optional.empty()));
      }

      public static ar<de.a> c() {
         return aq.I.a(new de.a(Optional.empty()));
      }

      public static ar<de.a> d() {
         return aq.ab.a(new de.a(Optional.empty()));
      }

      public static ar<de.a> e() {
         return aq.x.a(new de.a(Optional.empty()));
      }

      public static ar<de.a> a(jg<dnc> $$0, jg<czu> $$1, dnc $$2, czu $$3) {
         return a(by.a.a().a(bv.a.a().d(cm.a.a().a($$1, $$3))).b(cu.a.a().a(az.a.a().a($$0, $$2))));
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
