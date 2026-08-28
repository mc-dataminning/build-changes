import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bm extends dy<bm.a> {
   @Override
   public Codec<bm.a> a() {
      return bm.a.a;
   }

   public void a(ary $$0, jh $$1) {
      arx $$2 = $$0.y();
      dxo $$3 = $$2.a_($$1);
      ewl $$4 = new ewl.a($$2).a(ezc.f, $$1.b()).a(ezc.a, $$0).a(ezc.g, $$3).a(ezb.p);
      ewi $$5 = new ewi.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<bm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(bm.a::a), bh.a.optionalFieldOf("location").forGetter(bm.a::b)).apply($$0, bm.a::new)
      );

      public boolean a(ewi $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ezb.p, ".location"));
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
