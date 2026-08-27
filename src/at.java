import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends df<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(aqn $$0, io $$1, cto $$2) {
      aqm $$3 = $$0.z();
      drb $$4 = $$3.a_($$1);
      epi $$5 = new epi.a($$3).a(erx.f, $$1.b()).a(erx.a, $$0).a(erx.g, $$4).a(erx.i, $$2).a(erw.o);
      epf $$6 = new epf.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements df.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(at.a::a), bc.a.optionalFieldOf("location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(epf $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, erw.o, ".location"));
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
