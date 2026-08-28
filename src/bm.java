import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bm extends dy<bm.a> {
   @Override
   public Codec<bm.a> a() {
      return bm.a.a;
   }

   public void a(arq $$0, jh $$1) {
      arp $$2 = $$0.y();
      dvv $$3 = $$2.a_($$1);
      euq $$4 = new euq.a($$2).a(exj.f, $$1.b()).a(exj.a, $$0).a(exj.g, $$3).a(exi.p);
      eun $$5 = new eun.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<bm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(bm.a::a), bh.a.optionalFieldOf("location").forGetter(bm.a::b)).apply($$0, bm.a::new)
      );

      public boolean a(eun $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, exi.p, ".location"));
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
