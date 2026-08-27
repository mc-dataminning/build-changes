import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends cx<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(apt $$0, ib $$1) {
      aps $$2 = $$0.z();
      doz $$3 = $$2.a_($$1);
      enh $$4 = new enh.a($$2).a(epo.f, $$1.b()).a(epo.a, $$0).a(epo.g, $$3).a(epn.o);
      enb $$5 = new enb.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aws.a(br.b, "player").forGetter(bh.a::a), aws.a(bc.a, "location").forGetter(bh.a::b)).apply($$0, bh.a::new)
      );

      public boolean a(enb $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, epn.o, ".location"));
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
