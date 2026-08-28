import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aw extends dz<aw.a> {
   @Override
   public Codec<aw.a> a() {
      return aw.a.a;
   }

   public void a(are $$0, ji $$1, cxh $$2) {
      ard $$3 = $$0.y();
      dxq $$4 = $$3.a_($$1);
      ewr $$5 = new ewr.a($$3).a(ezi.f, $$1.b()).a(ezi.a, $$0).a(ezi.g, $$4).a(ezi.i, $$2).a(ezh.o);
      ewo $$6 = new ewo.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dz.a {
      public static final Codec<aw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(aw.a::a), bi.a.optionalFieldOf("location").forGetter(aw.a::b)).apply($$0, aw.a::new)
      );

      public boolean a(ewo $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ezh.o, ".location"));
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
