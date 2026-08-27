import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bq extends cx<bq.a> {
   @Override
   public Codec<bq.a> a() {
      return bq.a.a;
   }

   public void a(aow $$0, bmn $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static record a(Optional<bc> b, Optional<bf> c) implements cx.a {
      public static final Codec<bq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.a(br.b, "player").forGetter(bq.a::a), avp.a(bf.a, "damage").forGetter(bq.a::c)).apply($$0, bq.a::new)
      );

      public static an<bq.a> b() {
         return am.i.a(new bq.a(Optional.empty(), Optional.empty()));
      }

      public static an<bq.a> a(bf $$0) {
         return am.i.a(new bq.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<bq.a> a(bf.a $$0) {
         return am.i.a(new bq.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(aow $$0, bmn $$1, float $$2, float $$3, boolean $$4) {
         return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
