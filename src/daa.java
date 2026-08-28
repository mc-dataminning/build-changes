import com.google.common.collect.HashMultimap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;

public record daa(String b, jj<bue> d, czs e, buh.a f, UUID g) implements dac {
   public static final MapCodec<daa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("name").forGetter(daa::b),
               bue.a.fieldOf("attribute").forGetter(daa::c),
               czs.b.fieldOf("amount").forGetter(daa::d),
               buh.a.f.fieldOf("operation").forGetter(daa::e),
               kd.d.fieldOf("uuid").forGetter(daa::f)
            )
            .apply($$0, daa::new)
   );

   public buh a(int $$0) {
      return new buh(this.f(), this.b(), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4, boolean $$5) {
      if ($$5 && $$3 instanceof btb $$6) {
         $$6.eT().a(this.b($$1));
      }
   }

   @Override
   public void a(czk $$0, bsg $$1, ewf $$2, int $$3) {
      if ($$1 instanceof btb $$4) {
         $$4.eT().b(this.b($$3));
      }
   }

   private HashMultimap<jj<bue>, buh> b(int $$0) {
      HashMultimap<jj<bue>, buh> $$1 = HashMultimap.create();
      $$1.put(this.d, this.a($$0));
      return $$1;
   }

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   public jj<bue> c() {
      return this.d;
   }

   public czs d() {
      return this.e;
   }

   public buh.a e() {
      return this.f;
   }

   public UUID f() {
      return this.g;
   }
}
