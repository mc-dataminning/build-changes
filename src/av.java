import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av extends dy<av.a> {
   @Override
   public Codec<av.a> a() {
      return av.a.a;
   }

   public void a(asi $$0, jh $$1, cxk $$2) {
      ash $$3 = $$0.y();
      dxn $$4 = $$3.a_($$1);
      ewk $$5 = new ewk.a($$3).a(ezd.f, $$1.b()).a(ezd.a, $$0).a(ezd.g, $$4).a(ezd.i, $$2).a(ezc.o);
      ewh $$6 = new ewh.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<av.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(av.a::a), bh.a.optionalFieldOf("location").forGetter(av.a::b)).apply($$0, av.a::new)
      );

      public boolean a(ewh $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ezc.o, ".location"));
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<bh> b() {
         return this.c;
      }
   }
}
