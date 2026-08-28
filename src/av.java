import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av extends dy<av.a> {
   @Override
   public Codec<av.a> a() {
      return av.a.a;
   }

   public void a(ary $$0, jh $$1, cxg $$2) {
      arx $$3 = $$0.y();
      dxo $$4 = $$3.a_($$1);
      ewl $$5 = new ewl.a($$3).a(ezc.f, $$1.b()).a(ezc.a, $$0).a(ezc.g, $$4).a(ezc.i, $$2).a(ezb.o);
      ewi $$6 = new ewi.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<av.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(av.a::a), bh.a.optionalFieldOf("location").forGetter(av.a::b)).apply($$0, av.a::new)
      );

      public boolean a(ewi $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ezb.o, ".location"));
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
