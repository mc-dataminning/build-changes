import com.google.common.collect.HashMultimap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;

public record czy(String b, jj<bub> d, czq e, bue.a f, UUID g) implements daa {
   public static final MapCodec<czy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("name").forGetter(czy::b),
               bub.a.fieldOf("attribute").forGetter(czy::c),
               czq.b.fieldOf("amount").forGetter(czy::d),
               bue.a.f.fieldOf("operation").forGetter(czy::e),
               kd.d.fieldOf("uuid").forGetter(czy::f)
            )
            .apply($$0, czy::new)
   );

   public bue a(int $$0) {
      return new bue(this.f(), this.b(), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bsy $$6) {
         $$6.eS().a(this.b($$1));
      }
   }

   @Override
   public void a(czi $$0, bsd $$1, evz $$2, int $$3) {
      if ($$1 instanceof bsy $$4) {
         $$4.eS().b(this.b($$3));
      }
   }

   private HashMultimap<jj<bub>, bue> b(int $$0) {
      HashMultimap<jj<bub>, bue> $$1 = HashMultimap.create();
      $$1.put(this.d, this.a($$0));
      return $$1;
   }

   @Override
   public MapCodec<czy> a() {
      return a;
   }

   public jj<bub> c() {
      return this.d;
   }

   public czq d() {
      return this.e;
   }

   public bue.a e() {
      return this.f;
   }

   public UUID f() {
      return this.g;
   }
}
