import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class ck extends df<ck.a> {
   @Override
   public Codec<ck.a> a() {
      return ck.a.a;
   }

   public void a(aqo $$0, io $$1, ctq $$2) {
      aqn $$3 = $$0.z();
      drd $$4 = $$3.a_($$1);
      epk $$5 = new epk.a($$3).a(erz.f, $$1.b()).a(erz.a, $$0).a(erz.g, $$4).a(erz.i, $$2).a(ery.o);
      eph $$6 = new eph.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements df.a {
      public static final Codec<ck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(ck.a::a), bc.a.optionalFieldOf("location").forGetter(ck.a::b)).apply($$0, ck.a::new)
      );

      public static an<ck.a> a(dea $$0) {
         bc $$1 = bc.a(esm.a($$0).build());
         return am.z.a(new ck.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<ck.a> a(esn.a... $$0) {
         bc $$1 = bc.a(Arrays.stream($$0).map(esn.a::build).toArray(esn[]::new));
         return am.z.a(new ck.a(Optional.empty(), Optional.of($$1)));
      }

      private static ck.a c(cr.a $$0, ch.a $$1) {
         bc $$2 = bc.a(esl.a($$0).build(), esu.a($$1).build());
         return new ck.a(Optional.empty(), Optional.of($$2));
      }

      public static an<ck.a> a(cr.a $$0, ch.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<ck.a> b(cr.a $$0, ch.a $$1) {
         return am.aa.a(c($$0, $$1));
      }

      public boolean a(eph $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ery.o, ".location"));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> b() {
         return this.c;
      }
   }
}
