import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends cx<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(apt $$0, ib $$1, crj $$2) {
      aps $$3 = $$0.z();
      doz $$4 = $$3.a_($$1);
      enh $$5 = new enh.a($$3).a(epo.f, $$1.b()).a(epo.a, $$0).a(epo.g, $$4).a(epo.i, $$2).a(epn.n);
      enb $$6 = new enb.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aws.a(br.b, "player").forGetter(at.a::a), aws.a(bc.a, "location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(enb $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, epn.n, ".location"));
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
