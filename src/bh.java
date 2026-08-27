import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends de<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(aqi $$0, in $$1) {
      aqh $$2 = $$0.z();
      dqh $$3 = $$2.a_($$1);
      eoo $$4 = new eoo.a($$2).a(erc.f, $$1.b()).a(erc.a, $$0).a(erc.g, $$3).a(erb.o);
      eol $$5 = new eol.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements de.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(bh.a::a), axh.a(bc.a, "location").forGetter(bh.a::b)).apply($$0, bh.a::new)
      );

      public boolean a(eol $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, erb.o, ".location"));
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
