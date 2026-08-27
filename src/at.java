import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends de<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(aqi $$0, in $$1, csz $$2) {
      aqh $$3 = $$0.z();
      dqh $$4 = $$3.a_($$1);
      eoo $$5 = new eoo.a($$3).a(erc.f, $$1.b()).a(erc.a, $$0).a(erc.g, $$4).a(erc.i, $$2).a(erb.n);
      eol $$6 = new eol.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements de.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(at.a::a), axh.a(bc.a, "location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(eol $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, erb.n, ".location"));
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
