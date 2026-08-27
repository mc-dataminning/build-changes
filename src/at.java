import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends df<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(aqo $$0, io $$1, ctq $$2) {
      aqn $$3 = $$0.z();
      drd $$4 = $$3.a_($$1);
      epk $$5 = new epk.a($$3).a(erz.f, $$1.b()).a(erz.a, $$0).a(erz.g, $$4).a(erz.i, $$2).a(ery.o);
      eph $$6 = new eph.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements df.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(at.a::a), bc.a.optionalFieldOf("location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

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
