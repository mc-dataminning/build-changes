import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbj(jq<daa> c, bpv d) implements dbh {
   public static final MapCodec<dbj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.a(lu.aL).fieldOf("enchantments").forGetter(dbj::b), bpv.c.fieldOf("cost").forGetter(dbj::c)).apply($$0, dbj::new)
   );

   @Override
   public void a(cuo $$0, dag.a $$1, ayv $$2, bqo $$3) {
      for (dad $$5 : dac.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dbj> a() {
      return b;
   }

   public jq<daa> b() {
      return this.c;
   }

   public bpv c() {
      return this.d;
   }
}
