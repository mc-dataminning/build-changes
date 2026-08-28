import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aw extends dj<aw.a> {
   @Override
   public Codec<aw.a> a() {
      return aw.a.a;
   }

   public void a(arp $$0, iu $$1, cys $$2) {
      aro $$3 = $$0.y();
      dzo $$4 = $$3.a_($$1);
      eyq $$5 = new eyq.a($$3).a(fbh.f, $$1.b()).a(fbh.a, $$0).a(fbh.g, $$4).a(fbh.i, $$2).a(fbg.o);
      eyn $$6 = new eyn.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dj.a {
      public static final Codec<aw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(aw.a::a), bi.a.optionalFieldOf("location").forGetter(aw.a::b)).apply($$0, aw.a::new)
      );

      public boolean a(eyn $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fbg.o, ".location"));
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }
   }
}
