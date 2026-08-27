import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ct extends cx<ct.a> {
   @Override
   public Codec<ct.a> a() {
      return ct.a.a;
   }

   public void a(aox $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bc> b) implements cx.a {
      public static final Codec<ct.a> a = RecordCodecBuilder.create($$0 -> $$0.group(avq.a(br.b, "player").forGetter(ct.a::a)).apply($$0, ct.a::new));

      public static an<ct.a> a(ck.a $$0) {
         return am.q.a(new ct.a(Optional.of(br.a(br.a.a().a($$0)))));
      }

      public static an<ct.a> a(br.a $$0) {
         return am.q.a(new ct.a(Optional.of(br.a($$0.b()))));
      }

      public static an<ct.a> a(Optional<br> $$0) {
         return am.q.a(new ct.a(br.a($$0)));
      }

      public static an<ct.a> b() {
         return am.r.a(new ct.a(Optional.empty()));
      }

      public static an<ct.a> c() {
         return am.I.a(new ct.a(Optional.empty()));
      }

      public static an<ct.a> d() {
         return am.ab.a(new ct.a(Optional.empty()));
      }

      public static an<ct.a> e() {
         return am.x.a(new ct.a(Optional.empty()));
      }

      public static an<ct.a> a(cys $$0, coy $$1) {
         return a(br.a.a().a(bo.a.a().d(cc.a.a().a($$1))).b(ck.a.a().a(av.a.a().a($$0))));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
