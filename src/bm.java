import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bm extends dy<bm.a> {
   @Override
   public Codec<bm.a> a() {
      return bm.a.a;
   }

   public void a(aro $$0, jh $$1) {
      arn $$2 = $$0.B();
      dvj $$3 = $$2.a_($$1);
      euf $$4 = new euf.a($$2).a(ewy.f, $$1.b()).a(ewy.a, $$0).a(ewy.g, $$3).a(ewx.p);
      euc $$5 = new euc.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<bm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(bm.a::a), bh.a.optionalFieldOf("location").forGetter(bm.a::b)).apply($$0, bm.a::new)
      );

      public boolean a(euc $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewx.p, ".location"));
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
