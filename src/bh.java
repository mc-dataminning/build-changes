import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends df<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(aqo $$0, io $$1) {
      aqn $$2 = $$0.z();
      drd $$3 = $$2.a_($$1);
      epk $$4 = new epk.a($$2).a(erz.f, $$1.b()).a(erz.a, $$0).a(erz.g, $$3).a(ery.p);
      eph $$5 = new eph.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements df.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(bh.a::a), bc.a.optionalFieldOf("location").forGetter(bh.a::b)).apply($$0, bh.a::new)
      );

      public boolean a(eph $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ery.p, ".location"));
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
